package com.zhku.yiyi.project.system.qualityOrder.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zhku.yiyi.project.system.qualityOrder.mapper.QualityOrderMapper;
import com.zhku.yiyi.project.system.qualityOrder.domain.QualityOrder;
import com.zhku.yiyi.project.system.qualityOrder.service.IQualityOrderService;
import com.zhku.yiyi.common.support.Convert;

/**
 * 质检订单头 服务层实现
 * 
 * @author liujiating
 * @date 2018-12-04
 */
@Service
public class QualityOrderServiceImpl implements IQualityOrderService 
{
	@Autowired
	private QualityOrderMapper qualityOrderMapper;

	/**
     * 查询质检订单头信息
     * 
     * @param orderNo 质检订单头ID
     * @return 质检订单头信息
     */
    @Override
	public QualityOrder selectQualityOrderById(String orderNo)
	{
	    return qualityOrderMapper.selectQualityOrderById(orderNo);
	}
	
	/**
     * 查询质检订单头列表
     * 
     * @param qualityOrder 质检订单头信息
     * @return 质检订单头集合
     */
	@Override
	public List<QualityOrder> selectQualityOrderList(QualityOrder qualityOrder)
	{
	    return qualityOrderMapper.selectQualityOrderList(qualityOrder);
	}
	
    /**
     * 新增质检订单头
     * 
     * @param qualityOrder 质检订单头信息
     * @return 结果
     */
	@Override
	public int insertQualityOrder(QualityOrder qualityOrder)
	{
	    return qualityOrderMapper.insertQualityOrder(qualityOrder);
	}
	
	/**
     * 修改质检订单头
     * 
     * @param qualityOrder 质检订单头信息
     * @return 结果
     */
	@Override
	public int updateQualityOrder(QualityOrder qualityOrder)
	{
	    return qualityOrderMapper.updateQualityOrder(qualityOrder);
	}

	/**
     * 删除质检订单头对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteQualityOrderByIds(String ids)
	{
		return qualityOrderMapper.deleteQualityOrderByIds(Convert.toStrArray(ids));
	}
	
}
