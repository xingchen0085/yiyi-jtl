package com.zhku.yiyi.project.system.goodsType.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zhku.yiyi.project.system.goodsType.mapper.GoodsTypeMapper;
import com.zhku.yiyi.project.system.goodsType.domain.GoodsType;
import com.zhku.yiyi.project.system.goodsType.service.IGoodsTypeService;
import com.zhku.yiyi.common.support.Convert;

/**
 * 物品类型 服务层实现
 * 
 * @author liujiating
 * @date 2018-12-04
 */
@Service
public class GoodsTypeServiceImpl implements IGoodsTypeService 
{
	@Autowired
	private GoodsTypeMapper goodsTypeMapper;

	/**
     * 查询物品类型信息
     * 
     * @param id 物品类型ID
     * @return 物品类型信息
     */
    @Override
	public GoodsType selectGoodsTypeById(String id)
	{
	    return goodsTypeMapper.selectGoodsTypeById(id);
	}
	
	/**
     * 查询物品类型列表
     * 
     * @param goodsType 物品类型信息
     * @return 物品类型集合
     */
	@Override
	public List<GoodsType> selectGoodsTypeList(GoodsType goodsType)
	{
	    return goodsTypeMapper.selectGoodsTypeList(goodsType);
	}
	
    /**
     * 新增物品类型
     * 
     * @param goodsType 物品类型信息
     * @return 结果
     */
	@Override
	public int insertGoodsType(GoodsType goodsType)
	{
	    return goodsTypeMapper.insertGoodsType(goodsType);
	}
	
	/**
     * 修改物品类型
     * 
     * @param goodsType 物品类型信息
     * @return 结果
     */
	@Override
	public int updateGoodsType(GoodsType goodsType)
	{
	    return goodsTypeMapper.updateGoodsType(goodsType);
	}

	/**
     * 删除物品类型对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteGoodsTypeByIds(String ids)
	{
		return goodsTypeMapper.deleteGoodsTypeByIds(Convert.toStrArray(ids));
	}
	
}
