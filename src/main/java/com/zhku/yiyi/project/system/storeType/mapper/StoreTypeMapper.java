package com.zhku.yiyi.project.system.storeType.mapper;

import com.zhku.yiyi.project.system.storeType.domain.StoreType;
import java.util.List;	

/**
 * 仓库类型 数据层
 * 
 * @author liujiating
 * @date 2018-12-04
 */
public interface StoreTypeMapper 
{
	/**
     * 查询仓库类型信息
     * 
     * @param id 仓库类型ID
     * @return 仓库类型信息
     */
	public StoreType selectStoreTypeById(String id);
	
	/**
     * 查询仓库类型列表
     * 
     * @param storeType 仓库类型信息
     * @return 仓库类型集合
     */
	public List<StoreType> selectStoreTypeList(StoreType storeType);
	
	/**
     * 新增仓库类型
     * 
     * @param storeType 仓库类型信息
     * @return 结果
     */
	public int insertStoreType(StoreType storeType);
	
	/**
     * 修改仓库类型
     * 
     * @param storeType 仓库类型信息
     * @return 结果
     */
	public int updateStoreType(StoreType storeType);
	
	/**
     * 删除仓库类型
     * 
     * @param id 仓库类型ID
     * @return 结果
     */
	public int deleteStoreTypeById(String id);
	
	/**
     * 批量删除仓库类型
     * 
     * @param iDs 需要删除的数据ID
     * @return 结果
     */
	public int deleteStoreTypeByIds(String[] iDs);
	
}