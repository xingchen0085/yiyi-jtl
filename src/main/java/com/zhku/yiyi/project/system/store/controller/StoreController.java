package com.zhku.yiyi.project.system.store.controller;

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
import com.zhku.yiyi.project.system.store.domain.Store;
import com.zhku.yiyi.project.system.store.service.IStoreService;
import com.zhku.yiyi.framework.web.controller.BaseController;
import com.zhku.yiyi.framework.web.page.TableDataInfo;
import com.zhku.yiyi.framework.web.domain.AjaxResult;
import com.zhku.yiyi.common.utils.poi.ExcelUtil;
import org.springframework.stereotype.Controller;
/**
 * 供应商 信息操作处理
 * 
 * @author liujiating
 * @date 2018-12-04
 */
@Controller
@RequestMapping("/system/store")
public class StoreController extends BaseController
{
    private String prefix = "system/store";
	
	@Autowired
	private IStoreService storeService;
	
	@RequiresPermissions("system:store:view")
	@GetMapping()
	public String store()
	{
	    return prefix + "/store";
	}
	
	/**
	 * 查询供应商列表
	 */
	@RequiresPermissions("system:store:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Store store)
	{
		startPage();
        List<Store> list = storeService.selectStoreList(store);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出供应商列表
	 */
	@RequiresPermissions("system:store:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Store store)
    {
    	List<Store> list = storeService.selectStoreList(store);
        ExcelUtil<Store> util = new ExcelUtil<Store>(Store.class);
        return util.exportExcel(list, "store");
    }
	
	/**
	 * 新增供应商
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存供应商
	 */
	@RequiresPermissions("system:store:add")
	@Log(title = "供应商", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Store store)
	{		
		return toAjax(storeService.insertStore(store));
	}

	/**
	 * 修改供应商
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") String id, ModelMap mmap)
	{
		Store store = storeService.selectStoreById(id);
		mmap.put("store", store);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存供应商
	 */
	@RequiresPermissions("system:store:edit")
	@Log(title = "供应商", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Store store)
	{		
		return toAjax(storeService.updateStore(store));
	}
	
	/**
	 * 删除供应商
	 */
	@RequiresPermissions("system:store:remove")
	@Log(title = "供应商", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(storeService.deleteStoreByIds(ids));
	}
	
}
