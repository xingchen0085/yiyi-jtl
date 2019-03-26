package com.zhku.yiyi.project.system.supplierGoods.mapper;

import com.zhku.yiyi.project.system.supplierGoods.domain.SupplierGoods;
import java.util.List;	

/**
 * 供应商商品 数据层
 * 
 * @author liujiating
 * @date 2018-12-04
 */
public interface SupplierGoodsMapper 
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
     * 删除供应商商品
     * 
     * @param id 供应商商品ID
     * @return 结果
     */
	public int deleteSupplierGoodsById(String id);
	
	/**
     * 批量删除供应商商品
     * 
     * @param iDs 需要删除的数据ID
     * @return 结果
     */
	public int deleteSupplierGoodsByIds(String[] iDs);
	
}