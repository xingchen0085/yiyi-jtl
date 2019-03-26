package com.zhku.yiyi.project.system.sellOrderDetail.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zhku.yiyi.project.system.sellOrderDetail.mapper.SellOrderDetailMapper;
import com.zhku.yiyi.project.system.sellOrderDetail.domain.SellOrderDetail;
import com.zhku.yiyi.project.system.sellOrderDetail.service.ISellOrderDetailService;
import com.zhku.yiyi.common.support.Convert;

/**
 * 销售明细 服务层实现
 * 
 * @author liujiating
 * @date 2018-12-04
 */
@Service
public class SellOrderDetailServiceImpl implements ISellOrderDetailService 
{
	@Autowired
	private SellOrderDetailMapper sellOrderDetailMapper;

	/**
     * 查询销售明细信息
     * 
     * @param id 销售明细ID
     * @return 销售明细信息
     */
    @Override
	public SellOrderDetail selectSellOrderDetailById(String id)
	{
	    return sellOrderDetailMapper.selectSellOrderDetailById(id);
	}
	
	/**
     * 查询销售明细列表
     * 
     * @param sellOrderDetail 销售明细信息
     * @return 销售明细集合
     */
	@Override
	public List<SellOrderDetail> selectSellOrderDetailList(SellOrderDetail sellOrderDetail)
	{
	    return sellOrderDetailMapper.selectSellOrderDetailList(sellOrderDetail);
	}
	
    /**
     * 新增销售明细
     * 
     * @param sellOrderDetail 销售明细信息
     * @return 结果
     */
	@Override
	public int insertSellOrderDetail(SellOrderDetail sellOrderDetail)
	{
	    return sellOrderDetailMapper.insertSellOrderDetail(sellOrderDetail);
	}
	
	/**
     * 修改销售明细
     * 
     * @param sellOrderDetail 销售明细信息
     * @return 结果
     */
	@Override
	public int updateSellOrderDetail(SellOrderDetail sellOrderDetail)
	{
	    return sellOrderDetailMapper.updateSellOrderDetail(sellOrderDetail);
	}

	/**
     * 删除销售明细对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteSellOrderDetailByIds(String ids)
	{
		return sellOrderDetailMapper.deleteSellOrderDetailByIds(Convert.toStrArray(ids));
	}
	
}
