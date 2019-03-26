package com.zhku.yiyi.project.system.purchasingOrderDetail.controller;

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
import com.zhku.yiyi.project.system.purchasingOrderDetail.domain.PurchasingOrderDetail;
import com.zhku.yiyi.project.system.purchasingOrderDetail.service.IPurchasingOrderDetailService;
import com.zhku.yiyi.framework.web.controller.BaseController;
import com.zhku.yiyi.framework.web.page.TableDataInfo;
import com.zhku.yiyi.framework.web.domain.AjaxResult;
import com.zhku.yiyi.common.utils.poi.ExcelUtil;
import org.springframework.stereotype.Controller;
/**
 * 采购明细 信息操作处理
 * 
 * @author liujiating
 * @date 2018-12-04
 */
@Controller
@RequestMapping("/system/purchasingOrderDetail")
public class PurchasingOrderDetailController extends BaseController
{
    private String prefix = "system/purchasingOrderDetail";
	
	@Autowired
	private IPurchasingOrderDetailService purchasingOrderDetailService;
	
	@RequiresPermissions("system:purchasingOrderDetail:view")
	@GetMapping()
	public String purchasingOrderDetail()
	{
	    return prefix + "/purchasingOrderDetail";
	}
	
	/**
	 * 查询采购明细列表
	 */
	@RequiresPermissions("system:purchasingOrderDetail:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(PurchasingOrderDetail purchasingOrderDetail)
	{
		startPage();
        List<PurchasingOrderDetail> list = purchasingOrderDetailService.selectPurchasingOrderDetailList(purchasingOrderDetail);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出采购明细列表
	 */
	@RequiresPermissions("system:purchasingOrderDetail:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(PurchasingOrderDetail purchasingOrderDetail)
    {
    	List<PurchasingOrderDetail> list = purchasingOrderDetailService.selectPurchasingOrderDetailList(purchasingOrderDetail);
        ExcelUtil<PurchasingOrderDetail> util = new ExcelUtil<PurchasingOrderDetail>(PurchasingOrderDetail.class);
        return util.exportExcel(list, "purchasingOrderDetail");
    }
	
	/**
	 * 新增采购明细
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存采购明细
	 */
	@RequiresPermissions("system:purchasingOrderDetail:add")
	@Log(title = "采购明细", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(PurchasingOrderDetail purchasingOrderDetail)
	{		
		return toAjax(purchasingOrderDetailService.insertPurchasingOrderDetail(purchasingOrderDetail));
	}

	/**
	 * 修改采购明细
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") String id, ModelMap mmap)
	{
		PurchasingOrderDetail purchasingOrderDetail = purchasingOrderDetailService.selectPurchasingOrderDetailById(id);
		mmap.put("purchasingOrderDetail", purchasingOrderDetail);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存采购明细
	 */
	@RequiresPermissions("system:purchasingOrderDetail:edit")
	@Log(title = "采购明细", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(PurchasingOrderDetail purchasingOrderDetail)
	{		
		return toAjax(purchasingOrderDetailService.updatePurchasingOrderDetail(purchasingOrderDetail));
	}
	
	/**
	 * 删除采购明细
	 */
	@RequiresPermissions("system:purchasingOrderDetail:remove")
	@Log(title = "采购明细", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(purchasingOrderDetailService.deletePurchasingOrderDetailByIds(ids));
	}
	
}
