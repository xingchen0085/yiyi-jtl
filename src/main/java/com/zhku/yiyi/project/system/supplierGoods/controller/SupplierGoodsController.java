package com.zhku.yiyi.project.system.supplierGoods.controller;

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
import com.zhku.yiyi.project.system.supplierGoods.domain.SupplierGoods;
import com.zhku.yiyi.project.system.supplierGoods.service.ISupplierGoodsService;
import com.zhku.yiyi.framework.web.controller.BaseController;
import com.zhku.yiyi.framework.web.page.TableDataInfo;
import com.zhku.yiyi.framework.web.domain.AjaxResult;
import com.zhku.yiyi.common.utils.poi.ExcelUtil;

/**
 * 供应商商品 信息操作处理
 * 
 * @author liujiating
 * @date 2018-12-04
 */
@Controller
@RequestMapping("/system/supplierGoods")
public class SupplierGoodsController extends BaseController
{
    private String prefix = "system/supplierGoods";
	
	@Autowired
	private ISupplierGoodsService supplierGoodsService;
	
	@RequiresPermissions("system:supplierGoods:view")
	@GetMapping()
	public String supplierGoods()
	{
	    return prefix + "/supplierGoods";
	}
	
	/**
	 * 查询供应商商品列表
	 */
	@RequiresPermissions("system:supplierGoods:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(SupplierGoods supplierGoods)
	{
		startPage();
        List<SupplierGoods> list = supplierGoodsService.selectSupplierGoodsList(supplierGoods);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出供应商商品列表
	 */
	@RequiresPermissions("system:supplierGoods:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SupplierGoods supplierGoods)
    {
    	List<SupplierGoods> list = supplierGoodsService.selectSupplierGoodsList(supplierGoods);
        ExcelUtil<SupplierGoods> util = new ExcelUtil<SupplierGoods>(SupplierGoods.class);
        return util.exportExcel(list, "supplierGoods");
    }
	
	/**
	 * 新增供应商商品
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存供应商商品
	 */
	@RequiresPermissions("system:supplierGoods:add")
	@Log(title = "供应商商品", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(SupplierGoods supplierGoods)
	{		
		return toAjax(supplierGoodsService.insertSupplierGoods(supplierGoods));
	}

	/**
	 * 修改供应商商品
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") String id, ModelMap mmap)
	{
		SupplierGoods supplierGoods = supplierGoodsService.selectSupplierGoodsById(id);
		mmap.put("supplierGoods", supplierGoods);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存供应商商品
	 */
	@RequiresPermissions("system:supplierGoods:edit")
	@Log(title = "供应商商品", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(SupplierGoods supplierGoods)
	{		
		return toAjax(supplierGoodsService.updateSupplierGoods(supplierGoods));
	}
	
	/**
	 * 删除供应商商品
	 */
	@RequiresPermissions("system:supplierGoods:remove")
	@Log(title = "供应商商品", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(supplierGoodsService.deleteSupplierGoodsByIds(ids));
	}
	
}
