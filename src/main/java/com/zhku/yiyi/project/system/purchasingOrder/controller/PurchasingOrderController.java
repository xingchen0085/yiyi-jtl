package com.zhku.yiyi.project.system.purchasingOrder.controller;

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
import com.zhku.yiyi.project.system.purchasingOrder.domain.PurchasingOrder;
import com.zhku.yiyi.project.system.purchasingOrder.service.IPurchasingOrderService;
import com.zhku.yiyi.framework.web.controller.BaseController;
import com.zhku.yiyi.framework.web.page.TableDataInfo;
import com.zhku.yiyi.framework.web.domain.AjaxResult;
import com.zhku.yiyi.common.utils.poi.ExcelUtil;
import org.springframework.stereotype.Controller;
/**
 * 采购订单头 信息操作处理
 * 
 * @author liujiating
 * @date 2018-12-04
 */
@Controller
@RequestMapping("/system/purchasingOrder")
public class PurchasingOrderController extends BaseController
{
    private String prefix = "system/purchasingOrder";
	
	@Autowired
	private IPurchasingOrderService purchasingOrderService;
	
	@RequiresPermissions("system:purchasingOrder:view")
	@GetMapping()
	public String purchasingOrder()
	{
	    return prefix + "/purchasingOrder";
	}
	
	/**
	 * 查询采购订单头列表
	 */
	@RequiresPermissions("system:purchasingOrder:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(PurchasingOrder purchasingOrder)
	{
		startPage();
        List<PurchasingOrder> list = purchasingOrderService.selectPurchasingOrderList(purchasingOrder);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出采购订单头列表
	 */
	@RequiresPermissions("system:purchasingOrder:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(PurchasingOrder purchasingOrder)
    {
    	List<PurchasingOrder> list = purchasingOrderService.selectPurchasingOrderList(purchasingOrder);
        ExcelUtil<PurchasingOrder> util = new ExcelUtil<PurchasingOrder>(PurchasingOrder.class);
        return util.exportExcel(list, "purchasingOrder");
    }
	
	/**
	 * 新增采购订单头
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存采购订单头
	 */
	@RequiresPermissions("system:purchasingOrder:add")
	@Log(title = "采购订单头", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(PurchasingOrder purchasingOrder)
	{		
		return toAjax(purchasingOrderService.insertPurchasingOrder(purchasingOrder));
	}

	/**
	 * 修改采购订单头
	 */
	@GetMapping("/edit/{orderNo}")
	public String edit(@PathVariable("orderNo") String orderNo, ModelMap mmap)
	{
		PurchasingOrder purchasingOrder = purchasingOrderService.selectPurchasingOrderById(orderNo);
		mmap.put("purchasingOrder", purchasingOrder);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存采购订单头
	 */
	@RequiresPermissions("system:purchasingOrder:edit")
	@Log(title = "采购订单头", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(PurchasingOrder purchasingOrder)
	{		
		return toAjax(purchasingOrderService.updatePurchasingOrder(purchasingOrder));
	}
	
	/**
	 * 删除采购订单头
	 */
	@RequiresPermissions("system:purchasingOrder:remove")
	@Log(title = "采购订单头", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(purchasingOrderService.deletePurchasingOrderByIds(ids));
	}
	
}
