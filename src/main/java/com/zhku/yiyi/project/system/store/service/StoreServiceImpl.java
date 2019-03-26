package com.zhku.yiyi.project.system.store.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zhku.yiyi.project.system.store.mapper.StoreMapper;
import com.zhku.yiyi.project.system.store.domain.Store;
import com.zhku.yiyi.project.system.store.service.IStoreService;
import com.zhku.yiyi.common.support.Convert;

/**
 * 供应商 服务层实现
 * 
 * @author liujiating
 * @date 2018-12-04
 */
@Service
public class StoreServiceImpl implements IStoreService 
{
	@Autowired
	private StoreMapper storeMapper;

	/**
     * 查询供应商信息
     * 
     * @param id 供应商ID
     * @return 供应商信息
     */
    @Override
	public Store selectStoreById(String id)
	{
	    return storeMapper.selectStoreById(id);
	}
	
	/**
     * 查询供应商列表
     * 
     * @param store 供应商信息
     * @return 供应商集合
     */
	@Override
	public List<Store> selectStoreList(Store store)
	{
	    return storeMapper.selectStoreList(store);
	}
	
    /**
     * 新增供应商
     * 
     * @param store 供应商信息
     * @return 结果
     */
	@Override
	public int insertStore(Store store)
	{
	    return storeMapper.insertStore(store);
	}
	
	/**
     * 修改供应商
     * 
     * @param store 供应商信息
     * @return 结果
     */
	@Override
	public int updateStore(Store store)
	{
	    return storeMapper.updateStore(store);
	}

	/**
     * 删除供应商对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteStoreByIds(String ids)
	{
		return storeMapper.deleteStoreByIds(Convert.toStrArray(ids));
	}
	
}
