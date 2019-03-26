package com.zhku.yiyi.project.system.mdRegistration.mapper;

import com.zhku.yiyi.project.system.mdRegistration.domain.MdRegistration;
import java.util.List;	

/**
 * 科室放号跟踪 数据层
 * 
 * @author liujiating
 * @date 2018-12-04
 */
public interface MdRegistrationMapper 
{
	/**
     * 查询科室放号跟踪信息
     * 
     * @param id 科室放号跟踪ID
     * @return 科室放号跟踪信息
     */
	public MdRegistration selectMdRegistrationById(String id);
	
	/**
     * 查询科室放号跟踪列表
     * 
     * @param mdRegistration 科室放号跟踪信息
     * @return 科室放号跟踪集合
     */
	public List<MdRegistration> selectMdRegistrationList(MdRegistration mdRegistration);
	
	/**
     * 新增科室放号跟踪
     * 
     * @param mdRegistration 科室放号跟踪信息
     * @return 结果
     */
	public int insertMdRegistration(MdRegistration mdRegistration);
	
	/**
     * 修改科室放号跟踪
     * 
     * @param mdRegistration 科室放号跟踪信息
     * @return 结果
     */
	public int updateMdRegistration(MdRegistration mdRegistration);
	
	/**
     * 删除科室放号跟踪
     * 
     * @param id 科室放号跟踪ID
     * @return 结果
     */
	public int deleteMdRegistrationById(String id);
	
	/**
     * 批量删除科室放号跟踪
     * 
     * @param iDs 需要删除的数据ID
     * @return 结果
     */
	public int deleteMdRegistrationByIds(String[] iDs);
	
}