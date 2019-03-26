package com.zhku.yiyi.project.system.supplierGoods.service;

import com.zhku.yiyi.project.system.supplierGoods.domain.SupplierGoods;
import java.util.List;

/**
 * 供应商商品 服务层
 * 
 * @author liujiating
 * @date 2018-12-04
 */
public interface ISupplierGoodsService 
{
	/**
     * 查询供应商商品信息
     * 
     * @param id 供应商商品ID
     * @return 供应商商品信息
     */
	public SupplierGoods selectSupplierGoodsById(String id);
	
	/**
     * 查询供应商商品列表
     * 
     * @param supplierGoods 供应商商品信息
     * @return 供应商商品集合
     */
	public List<SupplierGoods> selectSupplierGoodsList(SupplierGoods supplierGoods);
	
	/**
     * 新增供应商商品
     * 
     * @param supplierGoods 供应商商品信息
     * @return 结果
     */
	public int insertSupplierGoods(SupplierGoods supplierGoods);
	
	/**
     * 修改供应商商品
     * 
     * @param supplierGoods 供应商商品信息
     * @return 结果
     */
	public int updateSupplierGoods(SupplierGoods supplierGoods);
		
	/**
     * 删除供应商商品信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteSupplierGoodsByIds(String ids);
	
}
