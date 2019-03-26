package com.zhku.yiyi.project.system.classification.controller;

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
import com.zhku.yiyi.project.system.classification.domain.Classification;
import com.zhku.yiyi.project.system.classification.service.IClassificationService;
import com.zhku.yiyi.framework.web.controller.BaseController;
import com.zhku.yiyi.framework.web.page.TableDataInfo;
import com.zhku.yiyi.framework.web.domain.AjaxResult;
import com.zhku.yiyi.common.utils.poi.ExcelUtil;

/**
 * 职能分类 信息操作处理
 * 
 * @author liujiating
 * @date 2018-12-04
 */
@Controller
@RequestMapping("/system/classification")
public class ClassificationController extends BaseController
{
    private String prefix = "system/classification";
	
	@Autowired
	private IClassificationService classificationService;
	
	@RequiresPermissions("system:classification:view")
	@GetMapping()
	public String classification()
	{
	    return prefix + "/classification";
	}
	
	/**
	 * 查询职能分类列表
	 */
	@RequiresPermissions("system:classification:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Classification classification)
	{
		startPage();
        List<Classification> list = classificationService.selectClassificationList(classification);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出职能分类列表
	 */
	@RequiresPermissions("system:classification:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Classification classification)
    {
    	List<Classification> list = classificationService.selectClassificationList(classification);
        ExcelUtil<Classification> util = new ExcelUtil<Classification>(Classification.class);
        return util.exportExcel(list, "classification");
    }
	
	/**
	 * 新增职能分类
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存职能分类
	 */
	@RequiresPermissions("system:classification:add")
	@Log(title = "职能分类", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Classification classification)
	{		
		return toAjax(classificationService.insertClassification(classification));
	}

	/**
	 * 修改职能分类
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") String id, ModelMap mmap)
	{
		Classification classification = classificationService.selectClassificationById(id);
		mmap.put("classification", classification);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存职能分类
	 */
	@RequiresPermissions("system:classification:edit")
	@Log(title = "职能分类", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Classification classification)
	{		
		return toAjax(classificationService.updateClassification(classification));
	}
	
	/**
	 * 删除职能分类
	 */
	@RequiresPermissions("system:classification:remove")
	@Log(title = "职能分类", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(classificationService.deleteClassificationByIds(ids));
	}
	
}
