package com.zhku.yiyi.project.system.supplier.controller;

import java.util.List;

import com.zhku.yiyi.project.system.supplierType.service.ISupplierTypeService;
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
import com.zhku.yiyi.project.system.supplier.domain.Supplier;
import com.zhku.yiyi.project.system.supplier.service.ISupplierService;
import com.zhku.yiyi.framework.web.controller.BaseController;
import com.zhku.yiyi.framework.web.page.TableDataInfo;
import com.zhku.yiyi.framework.web.domain.AjaxResult;
import com.zhku.yiyi.common.utils.poi.ExcelUtil;
/**
 * 供应商 信息操作处理
 * 
 * @author liujiating
 * @date 2018-12-04
 */
@Controller
@RequestMapping("/system/supplier")
public class SupplierController extends BaseController
{
    private String prefix = "system/supplier";
	
	@Autowired
	private ISupplierService supplierService;

	@Autowired
	private ISupplierTypeService supplierTypeService;
	
	@RequiresPermissions("system:supplier:view")
	@GetMapping()
	public String supplier()
	{
	    return prefix + "/supplier";
	}
	
	/**
	 * 查询供应商列表
	 */
	@RequiresPermissions("system:supplier:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Supplier supplier)
	{
		startPage();
        List<Supplier> list = supplierService.selectSupplierList(supplier);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出供应商列表
	 */
	@RequiresPermissions("system:supplier:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Supplier supplier)
    {
    	List<Supplier> list = supplierService.selectSupplierList(supplier);
        ExcelUtil<Supplier> util = new ExcelUtil<Supplier>(Supplier.class);
        return util.exportExcel(list, "supplier");
    }
	
	/**
	 * 新增供应商
	 */
	@GetMapping("/add")
	public String add(ModelMap mmap)
	{
		mmap.put("supplierTypeList",supplierTypeService.selectSupplierTypeList(null));
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存供应商
	 */
	@RequiresPermissions("system:supplier:add")
	@Log(title = "供应商", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Supplier supplier)
	{		
		return toAjax(supplierService.insertSupplier(supplier));
	}

	/**
	 * 修改供应商
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") String id, ModelMap mmap)
	{
		Supplier supplier = supplierService.selectSupplierById(id);
		mmap.put("supplier", supplier);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存供应商
	 */
	@RequiresPermissions("system:supplier:edit")
	@Log(title = "供应商", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Supplier supplier)
	{		
		return toAjax(supplierService.updateSupplier(supplier));
	}
	
	/**
	 * 删除供应商
	 */
	@RequiresPermissions("system:supplier:remove")
	@Log(title = "供应商", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(supplierService.deleteSupplierByIds(ids));
	}
	
}
