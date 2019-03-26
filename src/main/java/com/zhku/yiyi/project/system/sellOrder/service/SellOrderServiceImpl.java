package com.zhku.yiyi.project.system.sellOrder.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zhku.yiyi.project.system.sellOrder.mapper.SellOrderMapper;
import com.zhku.yiyi.project.system.sellOrder.domain.SellOrder;
import com.zhku.yiyi.project.system.sellOrder.service.ISellOrderService;
import com.zhku.yiyi.common.support.Convert;

/**
 * 销售订单头 服务层实现
 * 
 * @author liujiating
 * @date 2018-12-04
 */
@Service
public class SellOrderServiceImpl implements ISellOrderService 
{
	@Autowired
	private SellOrderMapper sellOrderMapper;

	/**
     * 查询销售订单头信息
     * 
     * @param orderNo 销售订单头ID
     * @return 销售订单头信息
     */
    @Override
	public SellOrder selectSellOrderById(String orderNo)
	{
	    return sellOrderMapper.selectSellOrderById(orderNo);
	}
	
	/**
     * 查询销售订单头列表
     * 
     * @param sellOrder 销售订单头信息
     * @return 销售订单头集合
     */
	@Override
	public List<SellOrder> selectSellOrderList(SellOrder sellOrder)
	{
	    return sellOrderMapper.selectSellOrderList(sellOrder);
	}
	
    /**
     * 新增销售订单头
     * 
     * @param sellOrder 销售订单头信息
     * @return 结果
     */
	@Override
	public int insertSellOrder(SellOrder sellOrder)
	{
	    return sellOrderMapper.insertSellOrder(sellOrder);
	}
	
	/**
     * 修改销售订单头
     * 
     * @param sellOrder 销售订单头信息
     * @return 结果
     */
	@Override
	public int updateSellOrder(SellOrder sellOrder)
	{
	    return sellOrderMapper.updateSellOrder(sellOrder);
	}

	/**
     * 删除销售订单头对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteSellOrderByIds(String ids)
	{
		return sellOrderMapper.deleteSellOrderByIds(Convert.toStrArray(ids));
	}
	
}
