package com.zhku.yiyi.project.system.medicaldept.controller;

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
import com.zhku.yiyi.project.system.medicaldept.domain.Medicaldept;
import com.zhku.yiyi.project.system.medicaldept.service.IMedicaldeptService;
import com.zhku.yiyi.framework.web.controller.BaseController;
import com.zhku.yiyi.framework.web.page.TableDataInfo;
import com.zhku.yiyi.framework.web.domain.AjaxResult;
import com.zhku.yiyi.common.utils.poi.ExcelUtil;
import org.springframework.stereotype.Controller;
/**
 * 科室分类 信息操作处理
 * 
 * @author liujiating
 * @date 2018-12-04
 */
@Controller
@RequestMapping("/system/medicaldept")
public class MedicaldeptController extends BaseController
{
    private String prefix = "system/medicaldept";
	
	@Autowired
	private IMedicaldeptService medicaldeptService;
	
	@RequiresPermissions("system:medicaldept:view")
	@GetMapping()
	public String medicaldept()
	{
	    return prefix + "/medicaldept";
	}
	
	/**
	 * 查询科室分类列表
	 */
	@RequiresPermissions("system:medicaldept:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Medicaldept medicaldept)
	{
		startPage();
        List<Medicaldept> list = medicaldeptService.selectMedicaldeptList(medicaldept);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出科室分类列表
	 */
	@RequiresPermissions("system:medicaldept:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Medicaldept medicaldept)
    {
    	List<Medicaldept> list = medicaldeptService.selectMedicaldeptList(medicaldept);
        ExcelUtil<Medicaldept> util = new ExcelUtil<Medicaldept>(Medicaldept.class);
        return util.exportExcel(list, "medicaldept");
    }
	
	/**
	 * 新增科室分类
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存科室分类
	 */
	@RequiresPermissions("system:medicaldept:add")
	@Log(title = "科室分类", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Medicaldept medicaldept)
	{		
		return toAjax(medicaldeptService.insertMedicaldept(medicaldept));
	}

	/**
	 * 修改科室分类
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") String id, ModelMap mmap)
	{
		Medicaldept medicaldept = medicaldeptService.selectMedicaldeptById(id);
		mmap.put("medicaldept", medicaldept);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存科室分类
	 */
	@RequiresPermissions("system:medicaldept:edit")
	@Log(title = "科室分类", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Medicaldept medicaldept)
	{		
		return toAjax(medicaldeptService.updateMedicaldept(medicaldept));
	}
	
	/**
	 * 删除科室分类
	 */
	@RequiresPermissions("system:medicaldept:remove")
	@Log(title = "科室分类", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(medicaldeptService.deleteMedicaldeptByIds(ids));
	}
	
}
