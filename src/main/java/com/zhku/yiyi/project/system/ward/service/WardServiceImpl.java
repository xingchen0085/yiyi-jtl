package com.zhku.yiyi.project.system.ward.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zhku.yiyi.project.system.ward.mapper.WardMapper;
import com.zhku.yiyi.project.system.ward.domain.Ward;
import com.zhku.yiyi.project.system.ward.service.IWardService;
import com.zhku.yiyi.common.support.Convert;

/**
 * 病房 服务层实现
 * 
 * @author liujiating
 * @date 2018-12-04
 */
@Service
public class WardServiceImpl implements IWardService 
{
	@Autowired
	private WardMapper wardMapper;

	/**
     * 查询病房信息
     * 
     * @param id 病房ID
     * @return 病房信息
     */
    @Override
	public Ward selectWardById(String id)
	{
	    return wardMapper.selectWardById(id);
	}
	
	/**
     * 查询病房列表
     * 
     * @param ward 病房信息
     * @return 病房集合
     */
	@Override
	public List<Ward> selectWardList(Ward ward)
	{
	    return wardMapper.selectWardList(ward);
	}
	
    /**
     * 新增病房
     * 
     * @param ward 病房信息
     * @return 结果
     */
	@Override
	public int insertWard(Ward ward)
	{
	    return wardMapper.insertWard(ward);
	}
	
	/**
     * 修改病房
     * 
     * @param ward 病房信息
     * @return 结果
     */
	@Override
	public int updateWard(Ward ward)
	{
	    return wardMapper.updateWard(ward);
	}

	/**
     * 删除病房对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteWardByIds(String ids)
	{
		return wardMapper.deleteWardByIds(Convert.toStrArray(ids));
	}
	
}
