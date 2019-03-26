package com.zhku.yiyi.project.system.qualityOrder.service;

import com.zhku.yiyi.project.system.qualityOrder.domain.QualityOrder;
import java.util.List;

/**
 * 质检订单头 服务层
 * 
 * @author liujiating
 * @date 2018-12-04
 */
public interface IQualityOrderService 
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
     * 删除质检订单头信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteQualityOrderByIds(String ids);
	
}
