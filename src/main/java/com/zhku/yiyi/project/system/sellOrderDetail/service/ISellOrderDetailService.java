package com.zhku.yiyi.project.system.sellOrderDetail.service;

import com.zhku.yiyi.project.system.sellOrderDetail.domain.SellOrderDetail;
import java.util.List;

/**
 * 销售明细 服务层
 * 
 * @author liujiating
 * @date 2018-12-04
 */
public interface ISellOrderDetailService 
{
	/**
     * 查询销售明细信息
     * 
     * @param id 销售明细ID
     * @return 销售明细信息
     */
	public SellOrderDetail selectSellOrderDetailById(String id);
	
	/**
     * 查询销售明细列表
     * 
     * @param sellOrderDetail 销售明细信息
     * @return 销售明细集合
     */
	public List<SellOrderDetail> selectSellOrderDetailList(SellOrderDetail sellOrderDetail);
	
	/**
     * 新增销售明细
     * 
     * @param sellOrderDetail 销售明细信息
     * @return 结果
     */
	public int insertSellOrderDetail(SellOrderDetail sellOrderDetail);
	
	/**
     * 修改销售明细
     * 
     * @param sellOrderDetail 销售明细信息
     * @return 结果
     */
	public int updateSellOrderDetail(SellOrderDetail sellOrderDetail);
		
	/**
     * 删除销售明细信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteSellOrderDetailByIds(String ids);
	
}
