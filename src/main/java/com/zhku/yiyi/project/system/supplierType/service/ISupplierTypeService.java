package com.zhku.yiyi.project.system.supplierType.service;

import com.zhku.yiyi.project.system.supplierType.domain.SupplierType;
import java.util.List;

/**
 * 供应商类型 服务层
 * 
 * @author liujiating
 * @date 2018-12-04
 */
public interface ISupplierTypeService 
{
	/**
     * 查询供应商类型信息
     * 
     * @param id 供应商类型ID
     * @return 供应商类型信息
     */
	public SupplierType selectSupplierTypeById(String id);
	
	/**
     * 查询供应商类型列表
     * 
     * @param supplierType 供应商类型信息
     * @return 供应商类型集合
     */
	public List<SupplierType> selectSupplierTypeList(SupplierType supplierType);
	
	/**
     * 新增供应商类型
     * 
     * @param supplierType 供应商类型信息
     * @return 结果
     */
	public int insertSupplierType(SupplierType supplierType);
	
	/**
     * 修改供应商类型
     * 
     * @param supplierType 供应商类型信息
     * @return 结果
     */
	public int updateSupplierType(SupplierType supplierType);
		
	/**
     * 删除供应商类型信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteSupplierTypeByIds(String ids);
	
}
