package com.zhku.yiyi.project.system.staff.controller;

import java.util.List;

import com.zhku.yiyi.project.system.classification.service.IClassificationService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.zhku.yiyi.framework.aspectj.lang.annotation.Log;
import com.zhku.yiyi.framework.aspectj.lang.enums.BusinessType;
import com.zhku.yiyi.project.system.staff.domain.Staff;
import com.zhku.yiyi.project.system.staff.service.IStaffService;
import com.zhku.yiyi.framework.web.controller.BaseController;
import com.zhku.yiyi.framework.web.page.TableDataInfo;
import com.zhku.yiyi.framework.web.domain.AjaxResult;
import com.zhku.yiyi.common.utils.poi.ExcelUtil;

/**
 * 人员管理 信息操作处理
 * 
 * @author liujiating
 * @date 2018-12-04
 */
@Controller
@RequestMapping("/system/staff")
public class StaffController extends BaseController
{
    private String prefix = "system/staff";
	
	@Autowired
	private IStaffService staffService;

	@Autowired
	private IClassificationService classificationService;
	
	@RequiresPermissions("system:staff:view")
	@GetMapping()
	public String staff()
	{
	    return prefix + "/staff";
	}
	
	/**
	 * 查询人员管理列表
	 */
	@RequiresPermissions("system:staff:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Staff staff)
	{
		startPage();
        List<Staff> list = staffService.selectStaffList(staff);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出人员管理列表
	 */
	@RequiresPermissions("system:staff:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Staff staff)
    {
    	List<Staff> list = staffService.selectStaffList(staff);
        ExcelUtil<Staff> util = new ExcelUtil<Staff>(Staff.class);
        return util.exportExcel(list, "staff");
    }
	
	/**
	 * 新增人员管理
	 */
	@GetMapping("/add")
	public String add(ModelMap mmap)
	{
		mmap.put("classificationList",classificationService.selectClassificationList(null));
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存人员管理
	 */
	@RequiresPermissions("system:staff:add")
	@Log(title = "人员管理", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Staff staff)
	{		
		return toAjax(staffService.insertStaff(staff));
	}

	/**
	 * 修改人员管理
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") String id, ModelMap mmap)
	{
		Staff staff = staffService.selectStaffById(id);
		mmap.put("staff", staff);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存人员管理
	 */
	@RequiresPermissions("system:staff:edit")
	@Log(title = "人员管理", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Staff staff)
	{		
		return toAjax(staffService.updateStaff(staff));
	}
	
	/**
	 * 删除人员管理
	 */
	@RequiresPermissions("system:staff:remove")
	@Log(title = "人员管理", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(staffService.deleteStaffByIds(ids));
	}
	
}
