package com.zhku.yiyi.project.system.classification.mapper;

import com.zhku.yiyi.project.system.classification.domain.Classification;
import java.util.List;	

/**
 * 职能分类 数据层
 * 
 * @author liujiating
 * @date 2018-12-04
 */
public interface ClassificationMapper 
{
	/**
     * 查询职能分类信息
     * 
     * @param id 职能分类ID
     * @return 职能分类信息
     */
	public Classification selectClassificationById(String id);
	
	/**
     * 查询职能分类列表
     * 
     * @param classification 职能分类信息
     * @return 职能分类集合
     */
	public List<Classification> selectClassificationList(Classification classification);
	
	/**
     * 新增职能分类
     * 
     * @param classification 职能分类信息
     * @return 结果
     */
	public int insertClassification(Classification classification);
	
	/**
     * 修改职能分类
     * 
     * @param classification 职能分类信息
     * @return 结果
     */
	public int updateClassification(Classification classification);
	
	/**
     * 删除职能分类
     * 
     * @param id 职能分类ID
     * @return 结果
     */
	public int deleteClassificationById(String id);
	
	/**
     * 批量删除职能分类
     * 
     * @param iDs 需要删除的数据ID
     * @return 结果
     */
	public int deleteClassificationByIds(String[] iDs);
	
}