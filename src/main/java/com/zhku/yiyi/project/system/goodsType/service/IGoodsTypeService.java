package com.zhku.yiyi.project.system.goodsType.service;

import com.zhku.yiyi.project.system.goodsType.domain.GoodsType;
import java.util.List;

/**
 * 物品类型 服务层
 * 
 * @author liujiating
 * @date 2018-12-04
 */
public interface IGoodsTypeService 
{
	/**
     * 查询物品类型信息
     * 
     * @param id 物品类型ID
     * @return 物品类型信息
     */
	public GoodsType selectGoodsTypeById(String id);
	
	/**
     * 查询物品类型列表
     * 
     * @param goodsType 物品类型信息
     * @return 物品类型集合
     */
	public List<GoodsType> selectGoodsTypeList(GoodsType goodsType);
	
	/**
     * 新增物品类型
     * 
     * @param goodsType 物品类型信息
     * @return 结果
     */
	public int insertGoodsType(GoodsType goodsType);
	
	/**
     * 修改物品类型
     * 
     * @param goodsType 物品类型信息
     * @return 结果
     */
	public int updateGoodsType(GoodsType goodsType);
		
	/**
     * 删除物品类型信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteGoodsTypeByIds(String ids);
	
}
