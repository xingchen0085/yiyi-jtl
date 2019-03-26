package com.zhku.yiyi.project.system.qualityOrder.mapper;

import com.zhku.yiyi.project.system.qualityOrder.domain.QualityOrder;
import java.util.List;	

/**
 * 质检订单头 数据层
 * 
 * @author liujiating
 * @date 2018-12-04
 */
public interface QualityOrderMapper 
{
	/**
     * 查询质检订单头信息
     * 
     * @param orderNo 质检订单头ID
     * @return 质检订单头信息
     */
	public QualityOrder selectQualityOrderById(String orderNo);
	
	/**
     * 查询质检订单头列表
     * 
     * @param qualityOrder 质检订单头信息
     * @return 质检订单头集合
     */
	public List<QualityOrder> selectQualityOrderList(QualityOrder qualityOrder);
	
	/**
     * 新增质检订单头
     * 
     * @param qualityOrder 质检订单头信息
     * @return 结果
     */
	public int insertQualityOrder(QualityOrder qualityOrder);
	
	/**
     * 修改质检订单头
     * 
     * @param qualityOrder 质检订单头信息
     * @return 结果
     */
	public int updateQualityOrder(QualityOrder qualityOrder);
	
	/**
     * 删除质检订单头
     * 
     * @param orderNo 质检订单头ID
     * @return 结果
     */
	public int deleteQualityOrderById(String orderNo);
	
	/**
     * 批量删除质检订单头
     * 
     * @param orderNos 需要删除的数据ID
     * @return 结果
     */
	public int deleteQualityOrderByIds(String[] orderNos);
	
}