package com.zhku.yiyi.project.system.sellOrder.controller;

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
import com.zhku.yiyi.project.system.sellOrder.domain.SellOrder;
import com.zhku.yiyi.project.system.sellOrder.service.ISellOrderService;
import com.zhku.yiyi.framework.web.controller.BaseController;
import com.zhku.yiyi.framework.web.page.TableDataInfo;
import com.zhku.yiyi.framework.web.domain.AjaxResult;
import com.zhku.yiyi.common.utils.poi.ExcelUtil;
import org.springframework.stereotype.Controller;
/**
 * 销售订单头 信息操作处理
 * 
 * @author liujiating
 * @date 2018-12-04
 */
@Controller
@RequestMapping("/system/sellOrder")
public class SellOrderController extends BaseController
{
    private String prefix = "system/sellOrder";
	
	@Autowired
	private ISellOrderService sellOrderService;
	
	@RequiresPermissions("system:sellOrder:view")
	@GetMapping()
	public String sellOrder()
	{
	    return prefix + "/sellOrder";
	}
	
	/**
	 * 查询销售订单头列表
	 */
	@RequiresPermissions("system:sellOrder:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(SellOrder sellOrder)
	{
		startPage();
        List<SellOrder> list = sellOrderService.selectSellOrderList(sellOrder);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出销售订单头列表
	 */
	@RequiresPermissions("system:sellOrder:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SellOrder sellOrder)
    {
    	List<SellOrder> list = sellOrderService.selectSellOrderList(sellOrder);
        ExcelUtil<SellOrder> util = new ExcelUtil<SellOrder>(SellOrder.class);
        return util.exportExcel(list, "sellOrder");
    }
	
	/**
	 * 新增销售订单头
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存销售订单头
	 */
	@RequiresPermissions("system:sellOrder:add")
	@Log(title = "销售订单头", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(SellOrder sellOrder)
	{		
		return toAjax(sellOrderService.insertSellOrder(sellOrder));
	}

	/**
	 * 修改销售订单头
	 */
	@GetMapping("/edit/{orderNo}")
	public String edit(@PathVariable("orderNo") String orderNo, ModelMap mmap)
	{
		SellOrder sellOrder = sellOrderService.selectSellOrderById(orderNo);
		mmap.put("sellOrder", sellOrder);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存销售订单头
	 */
	@RequiresPermissions("system:sellOrder:edit")
	@Log(title = "销售订单头", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(SellOrder sellOrder)
	{		
		return toAjax(sellOrderService.updateSellOrder(sellOrder));
	}
	
	/**
	 * 删除销售订单头
	 */
	@RequiresPermissions("system:sellOrder:remove")
	@Log(title = "销售订单头", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(sellOrderService.deleteSellOrderByIds(ids));
	}
	
}
