package com.zhku.yiyi.project.system.purchasingOrder.service;

import com.zhku.yiyi.project.system.purchasingOrder.domain.PurchasingOrder;
import java.util.List;

/**
 * 采购订单头 服务层
 * 
 * @author liujiating
 * @date 2018-12-04
 */
public interface IPurchasingOrderService 
{
	/**
     * 查询采购订单头信息
     * 
     * @param orderNo 采购订单头ID
     * @return 采购订单头信息
     */
	public PurchasingOrder selectPurchasingOrderById(String orderNo);
	
	/**
     * 查询采购订单头列表
     * 
     * @param purchasingOrder 采购订单头信息
     * @return 采购订单头集合
     */
	public List<PurchasingOrder> selectPurchasingOrderList(PurchasingOrder purchasingOrder);
	
	/**
     * 新增采购订单头
     * 
     * @param purchasingOrder 采购订单头信息
     * @return 结果
     */
	public int insertPurchasingOrder(PurchasingOrder purchasingOrder);
	
	/**
     * 修改采购订单头
     * 
     * @param purchasingOrder 采购订单头信息
     * @return 结果
     */
	public int updatePurchasingOrder(PurchasingOrder purchasingOrder);
		
	/**
     * 删除采购订单头信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deletePurchasingOrderByIds(String ids);
	
}
