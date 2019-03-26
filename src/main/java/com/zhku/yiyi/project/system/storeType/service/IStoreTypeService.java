package com.zhku.yiyi.project.system.storeType.service;

import com.zhku.yiyi.project.system.storeType.domain.StoreType;
import java.util.List;

/**
 * 仓库类型 服务层
 * 
 * @author liujiating
 * @date 2018-12-04
 */
public interface IStoreTypeService 
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
     * 删除仓库类型信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteStoreTypeByIds(String ids);
	
}
