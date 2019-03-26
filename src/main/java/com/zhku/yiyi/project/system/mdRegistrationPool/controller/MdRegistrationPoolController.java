package com.zhku.yiyi.project.system.mdRegistrationPool.controller;

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
import com.zhku.yiyi.project.system.mdRegistrationPool.domain.MdRegistrationPool;
import com.zhku.yiyi.project.system.mdRegistrationPool.service.IMdRegistrationPoolService;
import com.zhku.yiyi.framework.web.controller.BaseController;
import com.zhku.yiyi.framework.web.page.TableDataInfo;
import com.zhku.yiyi.framework.web.domain.AjaxResult;
import com.zhku.yiyi.common.utils.poi.ExcelUtil;
import org.springframework.stereotype.Controller;
/**
 * 科室放号池,设置挂号放号 信息操作处理
 * 
 * @author liujiating
 * @date 2018-12-04
 */
@Controller
@RequestMapping("/system/mdRegistrationPool")
public class MdRegistrationPoolController extends BaseController
{
    private String prefix = "system/mdRegistrationPool";
	
	@Autowired
	private IMdRegistrationPoolService mdRegistrationPoolService;
	
	@RequiresPermissions("system:mdRegistrationPool:view")
	@GetMapping()
	public String mdRegistrationPool()
	{
	    return prefix + "/mdRegistrationPool";
	}
	
	/**
	 * 查询科室放号池,设置挂号放号列表
	 */
	@RequiresPermissions("system:mdRegistrationPool:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(MdRegistrationPool mdRegistrationPool)
	{
		startPage();
        List<MdRegistrationPool> list = mdRegistrationPoolService.selectMdRegistrationPoolList(mdRegistrationPool);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出科室放号池,设置挂号放号列表
	 */
	@RequiresPermissions("system:mdRegistrationPool:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(MdRegistrationPool mdRegistrationPool)
    {
    	List<MdRegistrationPool> list = mdRegistrationPoolService.selectMdRegistrationPoolList(mdRegistrationPool);
        ExcelUtil<MdRegistrationPool> util = new ExcelUtil<MdRegistrationPool>(MdRegistrationPool.class);
        return util.exportExcel(list, "mdRegistrationPool");
    }
	
	/**
	 * 新增科室放号池,设置挂号放号
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存科室放号池,设置挂号放号
	 */
	@RequiresPermissions("system:mdRegistrationPool:add")
	@Log(title = "科室放号池,设置挂号放号", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(MdRegistrationPool mdRegistrationPool)
	{		
		return toAjax(mdRegistrationPoolService.insertMdRegistrationPool(mdRegistrationPool));
	}

	/**
	 * 修改科室放号池,设置挂号放号
	 */
	@GetMapping("/edit/{mdNo}")
	public String edit(@PathVariable("mdNo") String mdNo, ModelMap mmap)
	{
		MdRegistrationPool mdRegistrationPool = mdRegistrationPoolService.selectMdRegistrationPoolById(mdNo);
		mmap.put("mdRegistrationPool", mdRegistrationPool);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存科室放号池,设置挂号放号
	 */
	@RequiresPermissions("system:mdRegistrationPool:edit")
	@Log(title = "科室放号池,设置挂号放号", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(MdRegistrationPool mdRegistrationPool)
	{		
		return toAjax(mdRegistrationPoolService.updateMdRegistrationPool(mdRegistrationPool));
	}
	
	/**
	 * 删除科室放号池,设置挂号放号
	 */
	@RequiresPermissions("system:mdRegistrationPool:remove")
	@Log(title = "科室放号池,设置挂号放号", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(mdRegistrationPoolService.deleteMdRegistrationPoolByIds(ids));
	}
	
}
