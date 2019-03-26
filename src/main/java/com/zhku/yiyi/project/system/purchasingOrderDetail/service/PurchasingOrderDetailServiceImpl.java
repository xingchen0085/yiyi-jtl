package com.zhku.yiyi.project.system.purchasingOrderDetail.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zhku.yiyi.project.system.purchasingOrderDetail.mapper.PurchasingOrderDetailMapper;
import com.zhku.yiyi.project.system.purchasingOrderDetail.domain.PurchasingOrderDetail;
import com.zhku.yiyi.project.system.purchasingOrderDetail.service.IPurchasingOrderDetailService;
import com.zhku.yiyi.common.support.Convert;

/**
 * 采购明细 服务层实现
 * 
 * @author liujiating
 * @date 2018-12-04
 */
@Service
public class PurchasingOrderDetailServiceImpl implements IPurchasingOrderDetailService 
{
	@Autowired
	private PurchasingOrderDetailMapper purchasingOrderDetailMapper;

	/**
     * 查询采购明细信息
     * 
     * @param id 采购明细ID
     * @return 采购明细信息
     */
    @Override
	public PurchasingOrderDetail selectPurchasingOrderDetailById(String id)
	{
	    return purchasingOrderDetailMapper.selectPurchasingOrderDetailById(id);
	}
	
	/**
     * 查询采购明细列表
     * 
     * @param purchasingOrderDetail 采购明细信息
     * @return 采购明细集合
     */
	@Override
	public List<PurchasingOrderDetail> selectPurchasingOrderDetailList(PurchasingOrderDetail purchasingOrderDetail)
	{
	    return purchasingOrderDetailMapper.selectPurchasingOrderDetailList(purchasingOrderDetail);
	}
	
    /**
     * 新增采购明细
     * 
     * @param purchasingOrderDetail 采购明细信息
     * @return 结果
     */
	@Override
	public int insertPurchasingOrderDetail(PurchasingOrderDetail purchasingOrderDetail)
	{
	    return purchasingOrderDetailMapper.insertPurchasingOrderDetail(purchasingOrderDetail);
	}
	
	/**
     * 修改采购明细
     * 
     * @param purchasingOrderDetail 采购明细信息
     * @return 结果
     */
	@Override
	public int updatePurchasingOrderDetail(PurchasingOrderDetail purchasingOrderDetail)
	{
	    return purchasingOrderDetailMapper.updatePurchasingOrderDetail(purchasingOrderDetail);
	}

	/**
     * 删除采购明细对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deletePurchasingOrderDetailByIds(String ids)
	{
		return purchasingOrderDetailMapper.deletePurchasingOrderDetailByIds(Convert.toStrArray(ids));
	}
	
}
