package com.zhku.yiyi.project.system.supplierType.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zhku.yiyi.project.system.supplierType.mapper.SupplierTypeMapper;
import com.zhku.yiyi.project.system.supplierType.domain.SupplierType;
import com.zhku.yiyi.project.system.supplierType.service.ISupplierTypeService;
import com.zhku.yiyi.common.support.Convert;

/**
 * 供应商类型 服务层实现
 * 
 * @author liujiating
 * @date 2018-12-04
 */
@Service
public class SupplierTypeServiceImpl implements ISupplierTypeService 
{
	@Autowired
	private SupplierTypeMapper supplierTypeMapper;

	/**
     * 查询供应商类型信息
     * 
     * @param id 供应商类型ID
     * @return 供应商类型信息
     */
    @Override
	public SupplierType selectSupplierTypeById(String id)
	{
	    return supplierTypeMapper.selectSupplierTypeById(id);
	}
	
	/**
     * 查询供应商类型列表
     * 
     * @param supplierType 供应商类型信息
     * @return 供应商类型集合
     */
	@Override
	public List<SupplierType> selectSupplierTypeList(SupplierType supplierType)
	{
	    return supplierTypeMapper.selectSupplierTypeList(supplierType);
	}
	
    /**
     * 新增供应商类型
     * 
     * @param supplierType 供应商类型信息
     * @return 结果
     */
	@Override
	public int insertSupplierType(SupplierType supplierType)
	{
	    return supplierTypeMapper.insertSupplierType(supplierType);
	}
	
	/**
     * 修改供应商类型
     * 
     * @param supplierType 供应商类型信息
     * @return 结果
     */
	@Override
	public int updateSupplierType(SupplierType supplierType)
	{
	    return supplierTypeMapper.updateSupplierType(supplierType);
	}

	/**
     * 删除供应商类型对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteSupplierTypeByIds(String ids)
	{
		return supplierTypeMapper.deleteSupplierTypeByIds(Convert.toStrArray(ids));
	}
	
}
