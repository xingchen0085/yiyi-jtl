package com.zhku.yiyi.project.system.supplier.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zhku.yiyi.project.system.supplier.mapper.SupplierMapper;
import com.zhku.yiyi.project.system.supplier.domain.Supplier;
import com.zhku.yiyi.project.system.supplier.service.ISupplierService;
import com.zhku.yiyi.common.support.Convert;

/**
 * 供应商 服务层实现
 * 
 * @author liujiating
 * @date 2018-12-04
 */
@Service
public class SupplierServiceImpl implements ISupplierService 
{
	@Autowired
	private SupplierMapper supplierMapper;

	/**
     * 查询供应商信息
     * 
     * @param id 供应商ID
     * @return 供应商信息
     */
    @Override
	public Supplier selectSupplierById(String id)
	{
	    return supplierMapper.selectSupplierById(id);
	}
	
	/**
     * 查询供应商列表
     * 
     * @param supplier 供应商信息
     * @return 供应商集合
     */
	@Override
	public List<Supplier> selectSupplierList(Supplier supplier)
	{
	    return supplierMapper.selectSupplierList(supplier);
	}
	
    /**
     * 新增供应商
     * 
     * @param supplier 供应商信息
     * @return 结果
     */
	@Override
	public int insertSupplier(Supplier supplier)
	{
	    return supplierMapper.insertSupplier(supplier);
	}
	
	/**
     * 修改供应商
     * 
     * @param supplier 供应商信息
     * @return 结果
     */
	@Override
	public int updateSupplier(Supplier supplier)
	{
	    return supplierMapper.updateSupplier(supplier);
	}

	/**
     * 删除供应商对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteSupplierByIds(String ids)
	{
		return supplierMapper.deleteSupplierByIds(Convert.toStrArray(ids));
	}
	
}
