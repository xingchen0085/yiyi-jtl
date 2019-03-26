package com.zhku.yiyi.project.system.mdRegistration.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zhku.yiyi.project.system.mdRegistration.mapper.MdRegistrationMapper;
import com.zhku.yiyi.project.system.mdRegistration.domain.MdRegistration;
import com.zhku.yiyi.project.system.mdRegistration.service.IMdRegistrationService;
import com.zhku.yiyi.common.support.Convert;

/**
 * 科室放号跟踪 服务层实现
 * 
 * @author liujiating
 * @date 2018-12-04
 */
@Service
public class MdRegistrationServiceImpl implements IMdRegistrationService 
{
	@Autowired
	private MdRegistrationMapper mdRegistrationMapper;

	/**
     * 查询科室放号跟踪信息
     * 
     * @param id 科室放号跟踪ID
     * @return 科室放号跟踪信息
     */
    @Override
	public MdRegistration selectMdRegistrationById(String id)
	{
	    return mdRegistrationMapper.selectMdRegistrationById(id);
	}
	
	/**
     * 查询科室放号跟踪列表
     * 
     * @param mdRegistration 科室放号跟踪信息
     * @return 科室放号跟踪集合
     */
	@Override
	public List<MdRegistration> selectMdRegistrationList(MdRegistration mdRegistration)
	{
	    return mdRegistrationMapper.selectMdRegistrationList(mdRegistration);
	}
	
    /**
     * 新增科室放号跟踪
     * 
     * @param mdRegistration 科室放号跟踪信息
     * @return 结果
     */
	@Override
	public int insertMdRegistration(MdRegistration mdRegistration)
	{
	    return mdRegistrationMapper.insertMdRegistration(mdRegistration);
	}
	
	/**
     * 修改科室放号跟踪
     * 
     * @param mdRegistration 科室放号跟踪信息
     * @return 结果
     */
	@Override
	public int updateMdRegistration(MdRegistration mdRegistration)
	{
	    return mdRegistrationMapper.updateMdRegistration(mdRegistration);
	}

	/**
     * 删除科室放号跟踪对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteMdRegistrationByIds(String ids)
	{
		return mdRegistrationMapper.deleteMdRegistrationByIds(Convert.toStrArray(ids));
	}
	
}
