package com.zhku.yiyi.project.system.goods.controller;

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
import com.zhku.yiyi.project.system.goods.domain.Goods;
import com.zhku.yiyi.project.system.goods.service.IGoodsService;
import com.zhku.yiyi.framework.web.controller.BaseController;
import com.zhku.yiyi.framework.web.page.TableDataInfo;
import com.zhku.yiyi.framework.web.domain.AjaxResult;
import com.zhku.yiyi.common.utils.poi.ExcelUtil;
import org.springframework.stereotype.Controller;
/**
 * 物品 信息操作处理
 * 
 * @author liujiating
 * @date 2018-12-04
 */
@Controller
@RequestMapping("/system/goods")
public class GoodsController extends BaseController
{
    private String prefix = "system/goods";
	
	@Autowired
	private IGoodsService goodsService;
	
	@RequiresPermissions("system:goods:view")
	@GetMapping()
	public String goods()
	{
	    return prefix + "/goods";
	}
	
	/**
	 * 查询物品列表
	 */
	@RequiresPermissions("system:goods:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Goods goods)
	{
		startPage();
        List<Goods> list = goodsService.selectGoodsList(goods);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出物品列表
	 */
	@RequiresPermissions("system:goods:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Goods goods)
    {
    	List<Goods> list = goodsService.selectGoodsList(goods);
        ExcelUtil<Goods> util = new ExcelUtil<Goods>(Goods.class);
        return util.exportExcel(list, "goods");
    }
	
	/**
	 * 新增物品
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存物品
	 */
	@RequiresPermissions("system:goods:add")
	@Log(title = "物品", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Goods goods)
	{		
		return toAjax(goodsService.insertGoods(goods));
	}

	/**
	 * 修改物品
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") String id, ModelMap mmap)
	{
		Goods goods = goodsService.selectGoodsById(id);
		mmap.put("goods", goods);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存物品
	 */
	@RequiresPermissions("system:goods:edit")
	@Log(title = "物品", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Goods goods)
	{		
		return toAjax(goodsService.updateGoods(goods));
	}
	
	/**
	 * 删除物品
	 */
	@RequiresPermissions("system:goods:remove")
	@Log(title = "物品", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(goodsService.deleteGoodsByIds(ids));
	}
	
}
