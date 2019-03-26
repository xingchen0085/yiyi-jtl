package com.zhku.yiyi.project.system.supplierType.controller;

import java.util.List;
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
import com.zhku.yiyi.project.system.supplierType.domain.SupplierType;
import com.zhku.yiyi.project.system.supplierType.service.ISupplierTypeService;
import com.zhku.yiyi.framework.web.controller.BaseController;
import com.zhku.yiyi.framework.web.page.TableDataInfo;
import com.zhku.yiyi.framework.web.domain.AjaxResult;
import com.zhku.yiyi.common.utils.poi.ExcelUtil;

/**
 * 供应商类型 信息操作处理
 * 
 * @author liujiating
 * @date 2018-12-04
 */
@Controller
@RequestMapping("/system/supplierType")
public class SupplierTypeController extends BaseController
{
    private String prefix = "system/supplierType";
	
	@Autowired
	private ISupplierTypeService supplierTypeService;
	
	@RequiresPermissions("system:supplierType:view")
	@GetMapping()
	public String supplierType()
	{
	    return prefix + "/supplierType";
	}
	
	/**
	 * 查询供应商类型列表
	 */
	@RequiresPermissions("system:supplierType:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(SupplierType supplierType)
	{
		startPage();
        List<SupplierType> list = supplierTypeService.selectSupplierTypeList(supplierType);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出供应商类型列表
	 */
	@RequiresPermissions("system:supplierType:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SupplierType supplierType)
    {
    	List<SupplierType> list = supplierTypeService.selectSupplierTypeList(supplierType);
        ExcelUtil<SupplierType> util = new ExcelUtil<SupplierType>(SupplierType.class);
        return util.exportExcel(list, "supplierType");
    }
	
	/**
	 * 新增供应商类型
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存供应商类型
	 */
	@RequiresPermissions("system:supplierType:add")
	@Log(title = "供应商类型", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(SupplierType supplierType)
	{		
		return toAjax(supplierTypeService.insertSupplierType(supplierType));
	}

	/**
	 * 修改供应商类型
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") String id, ModelMap mmap)
	{
		SupplierType supplierType = supplierTypeService.selectSupplierTypeById(id);
		mmap.put("supplierType", supplierType);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存供应商类型
	 */
	@RequiresPermissions("system:supplierType:edit")
	@Log(title = "供应商类型", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(SupplierType supplierType)
	{		
		return toAjax(supplierTypeService.updateSupplierType(supplierType));
	}
	
	/**
	 * 删除供应商类型
	 */
	@RequiresPermissions("system:supplierType:remove")
	@Log(title = "供应商类型", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(supplierTypeService.deleteSupplierTypeByIds(ids));
	}
	
}
