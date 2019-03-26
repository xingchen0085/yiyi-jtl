package com.zhku.yiyi.project.system.purchasingOrder.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zhku.yiyi.project.system.purchasingOrder.mapper.PurchasingOrderMapper;
import com.zhku.yiyi.project.system.purchasingOrder.domain.PurchasingOrder;
import com.zhku.yiyi.project.system.purchasingOrder.service.IPurchasingOrderService;
import com.zhku.yiyi.common.support.Convert;

/**
 * 采购订单头 服务层实现
 * 
 * @author liujiating
 * @date 2018-12-04
 */
@Service
public class PurchasingOrderServiceImpl implements IPurchasingOrderService 
{
	@Autowired
	private PurchasingOrderMapper purchasingOrderMapper;

	/**
     * 查询采购订单头信息
     * 
     * @param orderNo 采购订单头ID
     * @return 采购订单头信息
     */
    @Override
	public PurchasingOrder selectPurchasingOrderById(String orderNo)
	{
	    return purchasingOrderMapper.selectPurchasingOrderById(orderNo);
	}
	
	/**
     * 查询采购订单头列表
     * 
     * @param purchasingOrder 采购订单头信息
     * @return 采购订单头集合
     */
	@Override
	public List<PurchasingOrder> selectPurchasingOrderList(PurchasingOrder purchasingOrder)
	{
	    return purchasingOrderMapper.selectPurchasingOrderList(purchasingOrder);
	}
	
    /**
     * 新增采购订单头
     * 
     * @param purchasingOrder 采购订单头信息
     * @return 结果
     */
	@Override
	public int insertPurchasingOrder(PurchasingOrder purchasingOrder)
	{
	    return purchasingOrderMapper.insertPurchasingOrder(purchasingOrder);
	}
	
	/**
     * 修改采购订单头
     * 
     * @param purchasingOrder 采购订单头信息
     * @return 结果
     */
	@Override
	public int updatePurchasingOrder(PurchasingOrder purchasingOrder)
	{
	    return purchasingOrderMapper.updatePurchasingOrder(purchasingOrder);
	}

	/**
     * 删除采购订单头对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deletePurchasingOrderByIds(String ids)
	{
		return purchasingOrderMapper.deletePurchasingOrderByIds(Convert.toStrArray(ids));
	}
	
}
