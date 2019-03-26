package com.zhku.yiyi.project.system.qualityOrderDetail.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zhku.yiyi.project.system.qualityOrderDetail.mapper.QualityOrderDetailMapper;
import com.zhku.yiyi.project.system.qualityOrderDetail.domain.QualityOrderDetail;
import com.zhku.yiyi.project.system.qualityOrderDetail.service.IQualityOrderDetailService;
import com.zhku.yiyi.common.support.Convert;

/**
 * 质检明细 服务层实现
 * 
 * @author liujiating
 * @date 2018-12-04
 */
@Service
public class QualityOrderDetailServiceImpl implements IQualityOrderDetailService 
{
	@Autowired
	private QualityOrderDetailMapper qualityOrderDetailMapper;

	/**
     * 查询质检明细信息
     * 
     * @param id 质检明细ID
     * @return 质检明细信息
     */
    @Override
	public QualityOrderDetail selectQualityOrderDetailById(String id)
	{
	    return qualityOrderDetailMapper.selectQualityOrderDetailById(id);
	}
	
	/**
     * 查询质检明细列表
     * 
     * @param qualityOrderDetail 质检明细信息
     * @return 质检明细集合
     */
	@Override
	public List<QualityOrderDetail> selectQualityOrderDetailList(QualityOrderDetail qualityOrderDetail)
	{
	    return qualityOrderDetailMapper.selectQualityOrderDetailList(qualityOrderDetail);
	}
	
    /**
     * 新增质检明细
     * 
     * @param qualityOrderDetail 质检明细信息
     * @return 结果
     */
	@Override
	public int insertQualityOrderDetail(QualityOrderDetail qualityOrderDetail)
	{
	    return qualityOrderDetailMapper.insertQualityOrderDetail(qualityOrderDetail);
	}
	
	/**
     * 修改质检明细
     * 
     * @param qualityOrderDetail 质检明细信息
     * @return 结果
     */
	@Override
	public int updateQualityOrderDetail(QualityOrderDetail qualityOrderDetail)
	{
	    return qualityOrderDetailMapper.updateQualityOrderDetail(qualityOrderDetail);
	}

	/**
     * 删除质检明细对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteQualityOrderDetailByIds(String ids)
	{
		return qualityOrderDetailMapper.deleteQualityOrderDetailByIds(Convert.toStrArray(ids));
	}
	
}
