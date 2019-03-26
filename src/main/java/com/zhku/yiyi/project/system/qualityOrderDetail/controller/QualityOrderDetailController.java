package com.zhku.yiyi.project.system.qualityOrderDetail.controller;

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
import com.zhku.yiyi.project.system.qualityOrderDetail.domain.QualityOrderDetail;
import com.zhku.yiyi.project.system.qualityOrderDetail.service.IQualityOrderDetailService;
import com.zhku.yiyi.framework.web.controller.BaseController;
import com.zhku.yiyi.framework.web.page.TableDataInfo;
import com.zhku.yiyi.framework.web.domain.AjaxResult;
import com.zhku.yiyi.common.utils.poi.ExcelUtil;
import org.springframework.stereotype.Controller;
/**
 * 质检明细 信息操作处理
 * 
 * @author liujiating
 * @date 2018-12-04
 */
@Controller
@RequestMapping("/system/qualityOrderDetail")
public class QualityOrderDetailController extends BaseController
{
    private String prefix = "system/qualityOrderDetail";
	
	@Autowired
	private IQualityOrderDetailService qualityOrderDetailService;
	
	@RequiresPermissions("system:qualityOrderDetail:view")
	@GetMapping()
	public String qualityOrderDetail()
	{
	    return prefix + "/qualityOrderDetail";
	}
	
	/**
	 * 查询质检明细列表
	 */
	@RequiresPermissions("system:qualityOrderDetail:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(QualityOrderDetail qualityOrderDetail)
	{
		startPage();
        List<QualityOrderDetail> list = qualityOrderDetailService.selectQualityOrderDetailList(qualityOrderDetail);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出质检明细列表
	 */
	@RequiresPermissions("system:qualityOrderDetail:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(QualityOrderDetail qualityOrderDetail)
    {
    	List<QualityOrderDetail> list = qualityOrderDetailService.selectQualityOrderDetailList(qualityOrderDetail);
        ExcelUtil<QualityOrderDetail> util = new ExcelUtil<QualityOrderDetail>(QualityOrderDetail.class);
        return util.exportExcel(list, "qualityOrderDetail");
    }
	
	/**
	 * 新增质检明细
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存质检明细
	 */
	@RequiresPermissions("system:qualityOrderDetail:add")
	@Log(title = "质检明细", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(QualityOrderDetail qualityOrderDetail)
	{		
		return toAjax(qualityOrderDetailService.insertQualityOrderDetail(qualityOrderDetail));
	}

	/**
	 * 修改质检明细
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") String id, ModelMap mmap)
	{
		QualityOrderDetail qualityOrderDetail = qualityOrderDetailService.selectQualityOrderDetailById(id);
		mmap.put("qualityOrderDetail", qualityOrderDetail);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存质检明细
	 */
	@RequiresPermissions("system:qualityOrderDetail:edit")
	@Log(title = "质检明细", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(QualityOrderDetail qualityOrderDetail)
	{		
		return toAjax(qualityOrderDetailService.updateQualityOrderDetail(qualityOrderDetail));
	}
	
	/**
	 * 删除质检明细
	 */
	@RequiresPermissions("system:qualityOrderDetail:remove")
	@Log(title = "质检明细", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(qualityOrderDetailService.deleteQualityOrderDetailByIds(ids));
	}
	
}
