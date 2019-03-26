package com.zhku.yiyi.project.system.sellOrder.service;

import com.zhku.yiyi.project.system.sellOrder.domain.SellOrder;
import java.util.List;

/**
 * 销售订单头 服务层
 * 
 * @author liujiating
 * @date 2018-12-04
 */
public interface ISellOrderService 
{
	/**
     * 查询销售订单头信息
     * 
     * @param orderNo 销售订单头ID
     * @return 销售订单头信息
     */
	public SellOrder selectSellOrderById(String orderNo);
	
	/**
     * 查询销售订单头列表
     * 
     * @param sellOrder 销售订单头信息
     * @return 销售订单头集合
     */
	public List<SellOrder> selectSellOrderList(SellOrder sellOrder);
	
	/**
     * 新增销售订单头
     * 
     * @param sellOrder 销售订单头信息
     * @return 结果
     */
	public int insertSellOrder(SellOrder sellOrder);
	
	/**
     * 修改销售订单头
     * 
     * @param sellOrder 销售订单头信息
     * @return 结果
     */
	public int updateSellOrder(SellOrder sellOrder);
		
	/**
     * 删除销售订单头信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteSellOrderByIds(String ids);
	
}
