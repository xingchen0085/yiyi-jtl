package com.zhku.yiyi.project.system.goods.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zhku.yiyi.project.system.goods.mapper.GoodsMapper;
import com.zhku.yiyi.project.system.goods.domain.Goods;
import com.zhku.yiyi.project.system.goods.service.IGoodsService;
import com.zhku.yiyi.common.support.Convert;

/**
 * 物品 服务层实现
 * 
 * @author liujiating
 * @date 2018-12-04
 */
@Service
public class GoodsServiceImpl implements IGoodsService 
{
	@Autowired
	private GoodsMapper goodsMapper;

	/**
     * 查询物品信息
     * 
     * @param id 物品ID
     * @return 物品信息
     */
    @Override
	public Goods selectGoodsById(String id)
	{
	    return goodsMapper.selectGoodsById(id);
	}
	
	/**
     * 查询物品列表
     * 
     * @param goods 物品信息
     * @return 物品集合
     */
	@Override
	public List<Goods> selectGoodsList(Goods goods)
	{
	    return goodsMapper.selectGoodsList(goods);
	}
	
    /**
     * 新增物品
     * 
     * @param goods 物品信息
     * @return 结果
     */
	@Override
	public int insertGoods(Goods goods)
	{
	    return goodsMapper.insertGoods(goods);
	}
	
	/**
     * 修改物品
     * 
     * @param goods 物品信息
     * @return 结果
     */
	@Override
	public int updateGoods(Goods goods)
	{
	    return goodsMapper.updateGoods(goods);
	}

	/**
     * 删除物品对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteGoodsByIds(String ids)
	{
		return goodsMapper.deleteGoodsByIds(Convert.toStrArray(ids));
	}
	
}
