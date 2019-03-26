package com.zhku.yiyi.project.system.storeType.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zhku.yiyi.project.system.storeType.mapper.StoreTypeMapper;
import com.zhku.yiyi.project.system.storeType.domain.StoreType;
import com.zhku.yiyi.project.system.storeType.service.IStoreTypeService;
import com.zhku.yiyi.common.support.Convert;

/**
 * 仓库类型 服务层实现
 * 
 * @author liujiating
 * @date 2018-12-04
 */
@Service
public class StoreTypeServiceImpl implements IStoreTypeService 
{
	@Autowired
	private StoreTypeMapper storeTypeMapper;

	/**
     * 查询仓库类型信息
     * 
     * @param id 仓库类型ID
     * @return 仓库类型信息
     */
    @Override
	public StoreType selectStoreTypeById(String id)
	{
	    return storeTypeMapper.selectStoreTypeById(id);
	}
	
	/**
     * 查询仓库类型列表
     * 
     * @param storeType 仓库类型信息
     * @return 仓库类型集合
     */
	@Override
	public List<StoreType> selectStoreTypeList(StoreType storeType)
	{
	    return storeTypeMapper.selectStoreTypeList(storeType);
	}
	
    /**
     * 新增仓库类型
     * 
     * @param storeType 仓库类型信息
     * @return 结果
     */
	@Override
	public int insertStoreType(StoreType storeType)
	{
	    return storeTypeMapper.insertStoreType(storeType);
	}
	
	/**
     * 修改仓库类型
     * 
     * @param storeType 仓库类型信息
     * @return 结果
     */
	@Override
	public int updateStoreType(StoreType storeType)
	{
	    return storeTypeMapper.updateStoreType(storeType);
	}

	/**
     * 删除仓库类型对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteStoreTypeByIds(String ids)
	{
		return storeTypeMapper.deleteStoreTypeByIds(Convert.toStrArray(ids));
	}
	
}
