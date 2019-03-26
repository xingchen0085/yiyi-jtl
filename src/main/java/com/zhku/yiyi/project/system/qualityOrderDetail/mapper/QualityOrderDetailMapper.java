package com.zhku.yiyi.project.system.qualityOrderDetail.mapper;

import com.zhku.yiyi.project.system.qualityOrderDetail.domain.QualityOrderDetail;
import java.util.List;	

/**
 * 质检明细 数据层
 * 
 * @author liujiating
 * @date 2018-12-04
 */
public interface QualityOrderDetailMapper 
{
	/**
     * 查询质检明细信息
     * 
     * @param id 质检明细ID
     * @return 质检明细信息
     */
	public QualityOrderDetail selectQualityOrderDetailById(String id);
	
	/**
     * 查询质检明细列表
     * 
     * @param qualityOrderDetail 质检明细信息
     * @return 质检明细集合
     */
	public List<QualityOrderDetail> selectQualityOrderDetailList(QualityOrderDetail qualityOrderDetail);
	
	/**
     * 新增质检明细
     * 
     * @param qualityOrderDetail 质检明细信息
     * @return 结果
     */
	public int insertQualityOrderDetail(QualityOrderDetail qualityOrderDetail);
	
	/**
     * 修改质检明细
     * 
     * @param qualityOrderDetail 质检明细信息
     * @return 结果
     */
	public int updateQualityOrderDetail(QualityOrderDetail qualityOrderDetail);
	
	/**
     * 删除质检明细
     * 
     * @param id 质检明细ID
     * @return 结果
     */
	public int deleteQualityOrderDetailById(String id);
	
	/**
     * 批量删除质检明细
     * 
     * @param iDs 需要删除的数据ID
     * @return 结果
     */
	public int deleteQualityOrderDetailByIds(String[] iDs);
	
}