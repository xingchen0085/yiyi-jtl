package com.zhku.yiyi.project.system.mdRegistrationPool.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zhku.yiyi.project.system.mdRegistrationPool.mapper.MdRegistrationPoolMapper;
import com.zhku.yiyi.project.system.mdRegistrationPool.domain.MdRegistrationPool;
import com.zhku.yiyi.project.system.mdRegistrationPool.service.IMdRegistrationPoolService;
import com.zhku.yiyi.common.support.Convert;

/**
 * 科室放号池,设置挂号放号 服务层实现
 * 
 * @author liujiating
 * @date 2018-12-04
 */
@Service
public class MdRegistrationPoolServiceImpl implements IMdRegistrationPoolService 
{
	@Autowired
	private MdRegistrationPoolMapper mdRegistrationPoolMapper;

	/**
     * 查询科室放号池,设置挂号放号信息
     * 
     * @param mdNo 科室放号池,设置挂号放号ID
     * @return 科室放号池,设置挂号放号信息
     */
    @Override
	public MdRegistrationPool selectMdRegistrationPoolById(String mdNo)
	{
	    return mdRegistrationPoolMapper.selectMdRegistrationPoolById(mdNo);
	}
	
	/**
     * 查询科室放号池,设置挂号放号列表
     * 
     * @param mdRegistrationPool 科室放号池,设置挂号放号信息
     * @return 科室放号池,设置挂号放号集合
     */
	@Override
	public List<MdRegistrationPool> selectMdRegistrationPoolList(MdRegistrationPool mdRegistrationPool)
	{
	    return mdRegistrationPoolMapper.selectMdRegistrationPoolList(mdRegistrationPool);
	}
	
    /**
     * 新增科室放号池,设置挂号放号
     * 
     * @param mdRegistrationPool 科室放号池,设置挂号放号信息
     * @return 结果
     */
	@Override
	public int insertMdRegistrationPool(MdRegistrationPool mdRegistrationPool)
	{
	    return mdRegistrationPoolMapper.insertMdRegistrationPool(mdRegistrationPool);
	}
	
	/**
     * 修改科室放号池,设置挂号放号
     * 
     * @param mdRegistrationPool 科室放号池,设置挂号放号信息
     * @return 结果
     */
	@Override
	public int updateMdRegistrationPool(MdRegistrationPool mdRegistrationPool)
	{
	    return mdRegistrationPoolMapper.updateMdRegistrationPool(mdRegistrationPool);
	}

	/**
     * 删除科室放号池,设置挂号放号对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteMdRegistrationPoolByIds(String ids)
	{
		return mdRegistrationPoolMapper.deleteMdRegistrationPoolByIds(Convert.toStrArray(ids));
	}
	
}
