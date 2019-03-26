package com.zhku.yiyi.project.system.supplierGoods.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zhku.yiyi.project.system.supplierGoods.mapper.SupplierGoodsMapper;
import com.zhku.yiyi.project.system.supplierGoods.domain.SupplierGoods;
import com.zhku.yiyi.project.system.supplierGoods.service.ISupplierGoodsService;
import com.zhku.yiyi.common.support.Convert;

/**
 * 供应商商品 服务层实现
 * 
 * @author liujiating
 * @date 2018-12-04
 */
@Service
public class SupplierGoodsServiceImpl implements ISupplierGoodsService 
{
	@Autowired
	private SupplierGoodsMapper supplierGoodsMapper;

	/**
     * 查询供应商商品信息
     * 
     * @param id 供应商商品ID
     * @return 供应商商品信息
     */
    @Override
	public SupplierGoods selectSupplierGoodsById(String id)
	{
	    return supplierGoodsMapper.selectSupplierGoodsById(id);
	}
	
	/**
     * 查询供应商商品列表
     * 
     * @param supplierGoods 供应商商品信息
     * @return 供应商商品集合
     */
	@Override
	public List<SupplierGoods> selectSupplierGoodsList(SupplierGoods supplierGoods)
	{
	    return supplierGoodsMapper.selectSupplierGoodsList(supplierGoods);
	}
	
    /**
     * 新增供应商商品
     * 
     * @param supplierGoods 供应商商品信息
     * @return 结果
     */
	@Override
	public int insertSupplierGoods(SupplierGoods supplierGoods)
	{
	    return supplierGoodsMapper.insertSupplierGoods(supplierGoods);
	}
	
	/**
     * 修改供应商商品
     * 
     * @param supplierGoods 供应商商品信息
     * @return 结果
     */
	@Override
	public int updateSupplierGoods(SupplierGoods supplierGoods)
	{
	    return supplierGoodsMapper.updateSupplierGoods(supplierGoods);
	}

	/**
     * 删除供应商商品对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteSupplierGoodsByIds(String ids)
	{
		return supplierGoodsMapper.deleteSupplierGoodsByIds(Convert.toStrArray(ids));
	}
	
}
