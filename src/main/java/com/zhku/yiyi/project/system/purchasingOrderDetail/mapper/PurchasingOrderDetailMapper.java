package com.zhku.yiyi.project.system.purchasingOrderDetail.mapper;

import com.zhku.yiyi.project.system.purchasingOrderDetail.domain.PurchasingOrderDetail;
import java.util.List;	

/**
 * 采购明细 数据层
 * 
 * @author liujiating
 * @date 2018-12-04
 */
public interface PurchasingOrderDetailMapper 
{
	/**
     * 查询采购明细信息
     * 
     * @param id 采购明细ID
     * @return 采购明细信息
     */
	public PurchasingOrderDetail selectPurchasingOrderDetailById(String id);
	
	/**
     * 查询采购明细列表
     * 
     * @param purchasingOrderDetail 采购明细信息
     * @return 采购明细集合
     */
	public List<PurchasingOrderDetail> selectPurchasingOrderDetailList(PurchasingOrderDetail purchasingOrderDetail);
	
	/**
     * 新增采购明细
     * 
     * @param purchasingOrderDetail 采购明细信息
     * @return 结果
     */
	public int insertPurchasingOrderDetail(PurchasingOrderDetail purchasingOrderDetail);
	
	/**
     * 修改采购明细
     * 
     * @param purchasingOrderDetail 采购明细信息
     * @return 结果
     */
	public int updatePurchasingOrderDetail(PurchasingOrderDetail purchasingOrderDetail);
	
	/**
     * 删除采购明细
     * 
     * @param id 采购明细ID
     * @return 结果
     */
	public int deletePurchasingOrderDetailById(String id);
	
	/**
     * 批量删除采购明细
     * 
     * @param iDs 需要删除的数据ID
     * @return 结果
     */
	public int deletePurchasingOrderDetailByIds(String[] iDs);
	
}