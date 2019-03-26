package com.zhku.yiyi.project.system.storeType.controller;

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
import com.zhku.yiyi.project.system.storeType.domain.StoreType;
import com.zhku.yiyi.project.system.storeType.service.IStoreTypeService;
import com.zhku.yiyi.framework.web.controller.BaseController;
import com.zhku.yiyi.framework.web.page.TableDataInfo;
import com.zhku.yiyi.framework.web.domain.AjaxResult;
import com.zhku.yiyi.common.utils.poi.ExcelUtil;

/**
 * 仓库类型 信息操作处理
 * 
 * @author liujiating
 * @date 2018-12-04
 */
@Controller
@RequestMapping("/system/storeType")
public class StoreTypeController extends BaseController
{
    private String prefix = "system/storeType";
	
	@Autowired
	private IStoreTypeService storeTypeService;
	
	@RequiresPermissions("system:storeType:view")
	@GetMapping()
	public String storeType()
	{
	    return prefix + "/storeType";
	}
	
	/**
	 * 查询仓库类型列表
	 */
	@RequiresPermissions("system:storeType:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(StoreType storeType)
	{
		startPage();
        List<StoreType> list = storeTypeService.selectStoreTypeList(storeType);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出仓库类型列表
	 */
	@RequiresPermissions("system:storeType:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(StoreType storeType)
    {
    	List<StoreType> list = storeTypeService.selectStoreTypeList(storeType);
        ExcelUtil<StoreType> util = new ExcelUtil<StoreType>(StoreType.class);
        return util.exportExcel(list, "storeType");
    }
	
	/**
	 * 新增仓库类型
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存仓库类型
	 */
	@RequiresPermissions("system:storeType:add")
	@Log(title = "仓库类型", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(StoreType storeType)
	{		
		return toAjax(storeTypeService.insertStoreType(storeType));
	}

	/**
	 * 修改仓库类型
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") String id, ModelMap mmap)
	{
		StoreType storeType = storeTypeService.selectStoreTypeById(id);
		mmap.put("storeType", storeType);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存仓库类型
	 */
	@RequiresPermissions("system:storeType:edit")
	@Log(title = "仓库类型", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(StoreType storeType)
	{		
		return toAjax(storeTypeService.updateStoreType(storeType));
	}
	
	/**
	 * 删除仓库类型
	 */
	@RequiresPermissions("system:storeType:remove")
	@Log(title = "仓库类型", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(storeTypeService.deleteStoreTypeByIds(ids));
	}
	
}
