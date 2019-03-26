package com.zhku.yiyi.project.system.qualityOrder.controller;

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
import com.zhku.yiyi.project.system.qualityOrder.domain.QualityOrder;
import com.zhku.yiyi.project.system.qualityOrder.service.IQualityOrderService;
import com.zhku.yiyi.framework.web.controller.BaseController;
import com.zhku.yiyi.framework.web.page.TableDataInfo;
import com.zhku.yiyi.framework.web.domain.AjaxResult;
import com.zhku.yiyi.common.utils.poi.ExcelUtil;

/**
 * 质检订单头 信息操作处理
 * 
 * @author liujiating
 * @date 2018-12-04
 */
@Controller
@RequestMapping("/system/qualityOrder")
public class QualityOrderController extends BaseController
{
    private String prefix = "system/qualityOrder";
	
	@Autowired
	private IQualityOrderService qualityOrderService;
	
	@RequiresPermissions("system:qualityOrder:view")
	@GetMapping()
	public String qualityOrder()
	{
	    return prefix + "/qualityOrder";
	}
	
	/**
	 * 查询质检订单头列表
	 */
	@RequiresPermissions("system:qualityOrder:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(QualityOrder qualityOrder)
	{
		startPage();
        List<QualityOrder> list = qualityOrderService.selectQualityOrderList(qualityOrder);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出质检订单头列表
	 */
	@RequiresPermissions("system:qualityOrder:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(QualityOrder qualityOrder)
    {
    	List<QualityOrder> list = qualityOrderService.selectQualityOrderList(qualityOrder);
        ExcelUtil<QualityOrder> util = new ExcelUtil<QualityOrder>(QualityOrder.class);
        return util.exportExcel(list, "qualityOrder");
    }
	
	/**
	 * 新增质检订单头
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存质检订单头
	 */
	@RequiresPermissions("system:qualityOrder:add")
	@Log(title = "质检订单头", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(QualityOrder qualityOrder)
	{		
		return toAjax(qualityOrderService.insertQualityOrder(qualityOrder));
	}

	/**
	 * 修改质检订单头
	 */
	@GetMapping("/edit/{orderNo}")
	public String edit(@PathVariable("orderNo") String orderNo, ModelMap mmap)
	{
		QualityOrder qualityOrder = qualityOrderService.selectQualityOrderById(orderNo);
		mmap.put("qualityOrder", qualityOrder);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存质检订单头
	 */
	@RequiresPermissions("system:qualityOrder:edit")
	@Log(title = "质检订单头", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(QualityOrder qualityOrder)
	{		
		return toAjax(qualityOrderService.updateQualityOrder(qualityOrder));
	}
	
	/**
	 * 删除质检订单头
	 */
	@RequiresPermissions("system:qualityOrder:remove")
	@Log(title = "质检订单头", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(qualityOrderService.deleteQualityOrderByIds(ids));
	}
	
}
