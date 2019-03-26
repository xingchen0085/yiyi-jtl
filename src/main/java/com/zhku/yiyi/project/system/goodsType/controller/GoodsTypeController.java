package com.zhku.yiyi.project.system.goodsType.controller;

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
import com.zhku.yiyi.project.system.goodsType.domain.GoodsType;
import com.zhku.yiyi.project.system.goodsType.service.IGoodsTypeService;
import com.zhku.yiyi.framework.web.controller.BaseController;
import com.zhku.yiyi.framework.web.page.TableDataInfo;
import com.zhku.yiyi.framework.web.domain.AjaxResult;
import com.zhku.yiyi.common.utils.poi.ExcelUtil;
import org.springframework.stereotype.Controller;
/**
 * 物品类型 信息操作处理
 * 
 * @author liujiating
 * @date 2018-12-04
 */
@Controller
@RequestMapping("/system/goodsType")
public class GoodsTypeController extends BaseController
{
    private String prefix = "system/goodsType";
	
	@Autowired
	private IGoodsTypeService goodsTypeService;
	
	@RequiresPermissions("system:goodsType:view")
	@GetMapping()
	public String goodsType()
	{
	    return prefix + "/goodsType";
	}
	
	/**
	 * 查询物品类型列表
	 */
	@RequiresPermissions("system:goodsType:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(GoodsType goodsType)
	{
		startPage();
        List<GoodsType> list = goodsTypeService.selectGoodsTypeList(goodsType);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出物品类型列表
	 */
	@RequiresPermissions("system:goodsType:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(GoodsType goodsType)
    {
    	List<GoodsType> list = goodsTypeService.selectGoodsTypeList(goodsType);
        ExcelUtil<GoodsType> util = new ExcelUtil<GoodsType>(GoodsType.class);
        return util.exportExcel(list, "goodsType");
    }
	
	/**
	 * 新增物品类型
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存物品类型
	 */
	@RequiresPermissions("system:goodsType:add")
	@Log(title = "物品类型", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(GoodsType goodsType)
	{		
		return toAjax(goodsTypeService.insertGoodsType(goodsType));
	}

	/**
	 * 修改物品类型
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") String id, ModelMap mmap)
	{
		GoodsType goodsType = goodsTypeService.selectGoodsTypeById(id);
		mmap.put("goodsType", goodsType);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存物品类型
	 */
	@RequiresPermissions("system:goodsType:edit")
	@Log(title = "物品类型", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(GoodsType goodsType)
	{		
		return toAjax(goodsTypeService.updateGoodsType(goodsType));
	}
	
	/**
	 * 删除物品类型
	 */
	@RequiresPermissions("system:goodsType:remove")
	@Log(title = "物品类型", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(goodsTypeService.deleteGoodsTypeByIds(ids));
	}
	
}
