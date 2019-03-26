package com.zhku.yiyi.project.system.ward.controller;

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
import com.zhku.yiyi.project.system.ward.domain.Ward;
import com.zhku.yiyi.project.system.ward.service.IWardService;
import com.zhku.yiyi.framework.web.controller.BaseController;
import com.zhku.yiyi.framework.web.page.TableDataInfo;
import com.zhku.yiyi.framework.web.domain.AjaxResult;
import com.zhku.yiyi.common.utils.poi.ExcelUtil;

/**
 * 病房 信息操作处理
 * 
 * @author liujiating
 * @date 2018-12-04
 */
@Controller
@RequestMapping("/system/ward")
public class WardController extends BaseController
{
    private String prefix = "system/ward";
	
	@Autowired
	private IWardService wardService;
	
	@RequiresPermissions("system:ward:view")
	@GetMapping()
	public String ward()
	{
	    return prefix + "/ward";
	}
	
	/**
	 * 查询病房列表
	 */
	@RequiresPermissions("system:ward:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Ward ward)
	{
		startPage();
        List<Ward> list = wardService.selectWardList(ward);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出病房列表
	 */
	@RequiresPermissions("system:ward:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Ward ward)
    {
    	List<Ward> list = wardService.selectWardList(ward);
        ExcelUtil<Ward> util = new ExcelUtil<Ward>(Ward.class);
        return util.exportExcel(list, "ward");
    }
	
	/**
	 * 新增病房
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存病房
	 */
	@RequiresPermissions("system:ward:add")
	@Log(title = "病房", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Ward ward)
	{		
		return toAjax(wardService.insertWard(ward));
	}

	/**
	 * 修改病房
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") String id, ModelMap mmap)
	{
		Ward ward = wardService.selectWardById(id);
		mmap.put("ward", ward);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存病房
	 */
	@RequiresPermissions("system:ward:edit")
	@Log(title = "病房", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Ward ward)
	{		
		return toAjax(wardService.updateWard(ward));
	}
	
	/**
	 * 删除病房
	 */
	@RequiresPermissions("system:ward:remove")
	@Log(title = "病房", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(wardService.deleteWardByIds(ids));
	}
	
}
