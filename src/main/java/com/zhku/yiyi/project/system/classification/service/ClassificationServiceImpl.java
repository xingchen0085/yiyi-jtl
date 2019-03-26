package com.zhku.yiyi.project.system.classification.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zhku.yiyi.project.system.classification.mapper.ClassificationMapper;
import com.zhku.yiyi.project.system.classification.domain.Classification;
import com.zhku.yiyi.project.system.classification.service.IClassificationService;
import com.zhku.yiyi.common.support.Convert;

/**
 * 职能分类 服务层实现
 * 
 * @author liujiating
 * @date 2018-12-04
 */
@Service
public class ClassificationServiceImpl implements IClassificationService 
{
	@Autowired
	private ClassificationMapper classificationMapper;

	/**
     * 查询职能分类信息
     * 
     * @param id 职能分类ID
     * @return 职能分类信息
     */
    @Override
	public Classification selectClassificationById(String id)
	{
	    return classificationMapper.selectClassificationById(id);
	}
	
	/**
     * 查询职能分类列表
     * 
     * @param classification 职能分类信息
     * @return 职能分类集合
     */
	@Override
	public List<Classification> selectClassificationList(Classification classification)
	{
	    return classificationMapper.selectClassificationList(classification);
	}
	
    /**
     * 新增职能分类
     * 
     * @param classification 职能分类信息
     * @return 结果
     */
	@Override
	public int insertClassification(Classification classification)
	{
	    return classificationMapper.insertClassification(classification);
	}
	
	/**
     * 修改职能分类
     * 
     * @param classification 职能分类信息
     * @return 结果
     */
	@Override
	public int updateClassification(Classification classification)
	{
	    return classificationMapper.updateClassification(classification);
	}

	/**
     * 删除职能分类对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteClassificationByIds(String ids)
	{
		return classificationMapper.deleteClassificationByIds(Convert.toStrArray(ids));
	}
	
}
