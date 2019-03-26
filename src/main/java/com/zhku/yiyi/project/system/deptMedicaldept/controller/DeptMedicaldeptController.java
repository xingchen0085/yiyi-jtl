package com.zhku.yiyi.project.system.deptMedicaldept.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.zhku.yiyi.framework.aspectj.lang.annotation.Log;
import com.zhku.yiyi.framework.aspectj.lang.enums.BusinessType;
import com.zhku.yiyi.project.system.deptMedicaldept.domain.DeptMedicaldept;
import com.zhku.yiyi.project.system.deptMedicaldept.service.IDeptMedicaldeptService;
import com.zhku.yiyi.framework.web.controller.BaseController;
import com.zhku.yiyi.framework.web.page.TableDataInfo;
import com.zhku.yiyi.framework.web.domain.AjaxResult;
import com.zhku.yiyi.common.utils.poi.ExcelUtil;
import org.springframework.stereotype.Controller;
/**
 * 机构科室关系(机构只能是医院) 信息操作处理
 * 
 * @author liujiating
 * @date 2018-12-04
 */
@Controller
@RequestMapping("/system/deptMedicaldept")
public class DeptMedicaldeptController extends BaseController
{
    private String prefix = "system/deptMedicaldept";
	
	@Autowired
	private IDeptMedicaldeptService deptMedicaldeptService;
	
	@RequiresPermissions("system:deptMedicaldept:view")
	@GetMapping()
	public String deptMedicaldept()
	{
	    return prefix + "/deptMedicaldept";
	}
	
	/**
	 * 查询机构科室关系(机构只能是医院)列表
	 */
	@RequiresPermissions("system:deptMedicaldept:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(DeptMedicaldept deptMedicaldept)
	{
		startPage();
        List<DeptMedicaldept> list = deptMedicaldeptService.selectDeptMedicaldeptList(deptMedicaldept);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出机构科室关系(机构只能是医院)列表
	 */
	@RequiresPermissions("system:deptMedicaldept:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(DeptMedicaldept deptMedicaldept)
    {
    	List<DeptMedicaldept> list = deptMedicaldeptService.selectDeptMedicaldeptList(deptMedicaldept);
        ExcelUtil<DeptMedicaldept> util = new ExcelUtil<DeptMedicaldept>(DeptMedicaldept.class);
        return util.exportExcel(list, "deptMedicaldept");
    }
	
	/**
	 * 新增机构科室关系(机构只能是医院)
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存机构科室关系(机构只能是医院)
	 */
	@RequiresPermissions("system:deptMedicaldept:add")
	@Log(title = "机构科室关系(机构只能是医院)", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(DeptMedicaldept deptMedicaldept)
	{		
		return toAjax(deptMedicaldeptService.insertDeptMedicaldept(deptMedicaldept));
	}

	/**
	 * 修改机构科室关系(机构只能是医院)
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") String id, ModelMap mmap)
	{
		DeptMedicaldept deptMedicaldept = deptMedicaldeptService.selectDeptMedicaldeptById(id);
		mmap.put("deptMedicaldept", deptMedicaldept);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存机构科室关系(机构只能是医院)
	 */
	@RequiresPermissions("system:deptMedicaldept:edit")
	@Log(title = "机构科室关系(机构只能是医院)", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(DeptMedicaldept deptMedicaldept)
	{		
		return toAjax(deptMedicaldeptService.updateDeptMedicaldept(deptMedicaldept));
	}
	
	/**
	 * 删除机构科室关系(机构只能是医院)
	 */
	@RequiresPermissions("system:deptMedicaldept:remove")
	@Log(title = "机构科室关系(机构只能是医院)", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(deptMedicaldeptService.deleteDeptMedicaldeptByIds(ids));
	}
	
}
