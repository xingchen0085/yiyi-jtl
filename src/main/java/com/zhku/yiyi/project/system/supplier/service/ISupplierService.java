package com.zhku.yiyi.project.system.supplier.service;

import com.zhku.yiyi.project.system.supplier.domain.Supplier;
import java.util.List;

/**
 * 供应商 服务层
 * 
 * @author liujiating
 * @date 2018-12-04
 */
public interface ISupplierService 
{
	/**
     * 查询供应商信息
     * 
     * @param id 供应商ID
     * @return 供应商信息
     */
	public Supplier selectSupplierById(String id);
	
	/**
     * 查询供应商列表
     * 
     * @param supplier 供应商信息
     * @return 供应商集合
     */
	public List<Supplier> selectSupplierList(Supplier supplier);
	
	/**
     * 新增供应商
     * 
     * @param supplier 供应商信息
     * @return 结果
     */
	public int insertSupplier(Supplier supplier);
	
	/**
     * 修改供应商
     * 
     * @param supplier 供应商信息
     * @return 结果
     */
	public int updateSupplier(Supplier supplier);
		
	/**
     * 删除供应商信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteSupplierByIds(String ids);
	
}
