package com.zhku.yiyi.project.system.ward.mapper;

import com.zhku.yiyi.project.system.ward.domain.Ward;
import java.util.List;	

/**
 * 病房 数据层
 * 
 * @author liujiating
 * @date 2018-12-04
 */
public interface WardMapper 
{
	/**
     * 查询病房信息
     * 
     * @param id 病房ID
     * @return 病房信息
     */
	public Ward selectWardById(String id);
	
	/**
     * 查询病房列表
     * 
     * @param ward 病房信息
     * @return 病房集合
     */
	public List<Ward> selectWardList(Ward ward);
	
	/**
     * 新增病房
     * 
     * @param ward 病房信息
     * @return 结果
     */
	public int insertWard(Ward ward);
	
	/**
     * 修改病房
     * 
     * @param ward 病房信息
     * @return 结果
     */
	public int updateWard(Ward ward);
	
	/**
     * 删除病房
     * 
     * @param id 病房ID
     * @return 结果
     */
	public int deleteWardById(String id);
	
	/**
     * 批量删除病房
     * 
     * @param iDs 需要删除的数据ID
     * @return 结果
     */
	public int deleteWardByIds(String[] iDs);
	
}