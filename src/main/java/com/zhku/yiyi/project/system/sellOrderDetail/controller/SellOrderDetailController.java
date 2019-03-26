package com.zhku.yiyi.project.system.sellOrderDetail.controller;

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
import com.zhku.yiyi.project.system.sellOrderDetail.domain.SellOrderDetail;
import com.zhku.yiyi.project.system.sellOrderDetail.service.ISellOrderDetailService;
import com.zhku.yiyi.framework.web.controller.BaseController;
import com.zhku.yiyi.framework.web.page.TableDataInfo;
import com.zhku.yiyi.framework.web.domain.AjaxResult;
import com.zhku.yiyi.common.utils.poi.ExcelUtil;

/**
 * 销售明细 信息操作处理
 * 
 * @author liujiating
 * @date 2018-12-04
 */
@Controller
@RequestMapping("/system/sellOrderDetail")
public class SellOrderDetailController extends BaseController
{
    private String prefix = "system/sellOrderDetail";
	
	@Autowired
	private ISellOrderDetailService sellOrderDetailService;
	
	@RequiresPermissions("system:sellOrderDetail:view")
	@GetMapping()
	public String sellOrderDetail()
	{
	    return prefix + "/sellOrderDetail";
	}
	
	/**
	 * 查询销售明细列表
	 */
	@RequiresPermissions("system:sellOrderDetail:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(SellOrderDetail sellOrderDetail)
	{
		startPage();
        List<SellOrderDetail> list = sellOrderDetailService.selectSellOrderDetailList(sellOrderDetail);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出销售明细列表
	 */
	@RequiresPermissions("system:sellOrderDetail:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SellOrderDetail sellOrderDetail)
    {
    	List<SellOrderDetail> list = sellOrderDetailService.selectSellOrderDetailList(sellOrderDetail);
        ExcelUtil<SellOrderDetail> util = new ExcelUtil<SellOrderDetail>(SellOrderDetail.class);
        return util.exportExcel(list, "sellOrderDetail");
    }
	
	/**
	 * 新增销售明细
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存销售明细
	 */
	@RequiresPermissions("system:sellOrderDetail:add")
	@Log(title = "销售明细", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(SellOrderDetail sellOrderDetail)
	{		
		return toAjax(sellOrderDetailService.insertSellOrderDetail(sellOrderDetail));
	}

	/**
	 * 修改销售明细
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") String id, ModelMap mmap)
	{
		SellOrderDetail sellOrderDetail = sellOrderDetailService.selectSellOrderDetailById(id);
		mmap.put("sellOrderDetail", sellOrderDetail);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存销售明细
	 */
	@RequiresPermissions("system:sellOrderDetail:edit")
	@Log(title = "销售明细", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(SellOrderDetail sellOrderDetail)
	{		
		return toAjax(sellOrderDetailService.updateSellOrderDetail(sellOrderDetail));
	}
	
	/**
	 * 删除销售明细
	 */
	@RequiresPermissions("system:sellOrderDetail:remove")
	@Log(title = "销售明细", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(sellOrderDetailService.deleteSellOrderDetailByIds(ids));
	}
	
}
