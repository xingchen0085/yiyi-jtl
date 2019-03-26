package com.zhku.yiyi.project.system.store.service;

import com.zhku.yiyi.project.system.store.domain.Store;
import java.util.List;

/**
 * 供应商 服务层
 * 
 * @author liujiating
 * @date 2018-12-04
 */
public interface IStoreService 
{
	/**
     * 查询供应商信息
     * 
     * @param id 供应商ID
     * @return 供应商信息
     */
	public Store selectStoreById(String id);
	
	/**
     * 查询供应商列表
     * 
     * @param store 供应商信息
     * @return 供应商集合
     */
	public List<Store> selectStoreList(Store store);
	
	/**
     * 新增供应商
     * 
     * @param store 供应商信息
     * @return 结果
     */
	public int insertStore(Store store);
	
	/**
     * 修改供应商
     * 
     * @param store 供应商信息
     * @return 结果
     */
	public int updateStore(Store store);
		
	/**
     * 删除供应商信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteStoreByIds(String ids);
	
}
