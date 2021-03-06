package com.zhku.yiyi.project.system.mdRegistrationPool.mapper;

import com.zhku.yiyi.project.system.mdRegistrationPool.domain.MdRegistrationPool;
import java.util.List;	

/**
 * 科室放号池,设置挂号放号 数据层
 * 
 * @author liujiating
 * @date 2018-12-04
 */
public interface MdRegistrationPoolMapper 
{
	/**
     * 查询科室放号池,设置挂号放号信息
     * 
     * @param mdNo 科室放号池,设置挂号放号ID
     * @return 科室放号池,设置挂号放号信息
     */
	public MdRegistrationPool selectMdRegistrationPoolById(String mdNo);
	
	/**
     * 查询科室放号池,设置挂号放号列表
     * 
     * @param mdRegistrationPool 科室放号池,设置挂号放号信息
     * @return 科室放号池,设置挂号放号集合
     */
	public List<MdRegistrationPool> selectMdRegistrationPoolList(MdRegistrationPool mdRegistrationPool);
	
	/**
     * 新增科室放号池,设置挂号放号
     * 
     * @param mdRegistrationPool 科室放号池,设置挂号放号信息
     * @return 结果
     */
	public int insertMdRegistrationPool(MdRegistrationPool mdRegistrationPool);
	
	/**
     * 修改科室放号池,设置挂号放号
     * 
     * @param mdRegistrationPool 科室放号池,设置挂号放号信息
     * @return 结果
     */
	public int updateMdRegistrationPool(MdRegistrationPool mdRegistrationPool);
	
	/**
     * 删除科室放号池,设置挂号放号
     * 
     * @param mdNo 科室放号池,设置挂号放号ID
     * @return 结果
     */
	public int deleteMdRegistrationPoolById(String mdNo);
	
	/**
     * 批量删除科室放号池,设置挂号放号
     * 
     * @param mdNos 需要删除的数据ID
     * @return 结果
     */
	public int deleteMdRegistrationPoolByIds(String[] mdNos);
	
}