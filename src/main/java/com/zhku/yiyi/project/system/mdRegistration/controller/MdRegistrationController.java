package com.zhku.yiyi.project.system.mdRegistration.controller;

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
import com.zhku.yiyi.project.system.mdRegistration.domain.MdRegistration;
import com.zhku.yiyi.project.system.mdRegistration.service.IMdRegistrationService;
import com.zhku.yiyi.framework.web.controller.BaseController;
import com.zhku.yiyi.framework.web.page.TableDataInfo;
import com.zhku.yiyi.framework.web.domain.AjaxResult;
import com.zhku.yiyi.common.utils.poi.ExcelUtil;
import org.springframework.stereotype.Controller;
/**
 * 科室放号跟踪 信息操作处理
 * 
 * @author liujiating
 * @date 2018-12-04
 */
@Controller
@RequestMapping("/system/mdRegistration")
public class MdRegistrationController extends BaseController
{
    private String prefix = "system/mdRegistration";
	
	@Autowired
	private IMdRegistrationService mdRegistrationService;
	
	@RequiresPermissions("system:mdRegistration:view")
	@GetMapping()
	public String mdRegistration()
	{
	    return prefix + "/mdRegistration";
	}
	
	/**
	 * 查询科室放号跟踪列表
	 */
	@RequiresPermissions("system:mdRegistration:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(MdRegistration mdRegistration)
	{
		startPage();
        List<MdRegistration> list = mdRegistrationService.selectMdRegistrationList(mdRegistration);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出科室放号跟踪列表
	 */
	@RequiresPermissions("system:mdRegistration:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(MdRegistration mdRegistration)
    {
    	List<MdRegistration> list = mdRegistrationService.selectMdRegistrationList(mdRegistration);
        ExcelUtil<MdRegistration> util = new ExcelUtil<MdRegistration>(MdRegistration.class);
        return util.exportExcel(list, "mdRegistration");
    }
	
	/**
	 * 新增科室放号跟踪
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存科室放号跟踪
	 */
	@RequiresPermissions("system:mdRegistration:add")
	@Log(title = "科室放号跟踪", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(MdRegistration mdRegistration)
	{		
		return toAjax(mdRegistrationService.insertMdRegistration(mdRegistration));
	}

	/**
	 * 修改科室放号跟踪
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") String id, ModelMap mmap)
	{
		MdRegistration mdRegistration = mdRegistrationService.selectMdRegistrationById(id);
		mmap.put("mdRegistration", mdRegistration);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存科室放号跟踪
	 */
	@RequiresPermissions("system:mdRegistration:edit")
	@Log(title = "科室放号跟踪", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(MdRegistration mdRegistration)
	{		
		return toAjax(mdRegistrationService.updateMdRegistration(mdRegistration));
	}
	
	/**
	 * 删除科室放号跟踪
	 */
	@RequiresPermissions("system:mdRegistration:remove")
	@Log(title = "科室放号跟踪", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(mdRegistrationService.deleteMdRegistrationByIds(ids));
	}
	
}
