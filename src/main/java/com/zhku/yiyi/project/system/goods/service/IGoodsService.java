package com.zhku.yiyi.project.system.goods.service;

import com.zhku.yiyi.project.system.goods.domain.Goods;
import java.util.List;

/**
 * 物品 服务层
 * 
 * @author liujiating
 * @date 2018-12-04
 */
public interface IGoodsService 
{
	/**
     * 查询物品信息
     * 
     * @param id 物品ID
     * @return 物品信息
     */
	public Goods selectGoodsById(String id);
	
	/**
     * 查询物品列表
     * 
     * @param goods 物品信息
     * @return 物品集合
     */
	public List<Goods> selectGoodsList(Goods goods);
	
	/**
     * 新增物品
     * 
     * @param goods 物品信息
     * @return 结果
     */
	public int insertGoods(Goods goods);
	
	/**
     * 修改物品
     * 
     * @param goods 物品信息
     * @return 结果
     */
	public int updateGoods(Goods goods);
		
	/**
     * 删除物品信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteGoodsByIds(String ids);
	
}
