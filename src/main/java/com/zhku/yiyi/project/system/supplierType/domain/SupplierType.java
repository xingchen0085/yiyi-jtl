package com.zhku.yiyi.project.system.supplierType.domain;

import com.zhku.yiyi.framework.web.domain.BaseEntity;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.util.Date;
/**
 * 供应商类型表 t_supplier_type
 * 
 * @author liujiating
 * @date 2018-12-04
 */
public class SupplierType extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 分类编号 */
	private String typeNo;
	/**  */
	private String typeName;
	/** 帐号状态:0正常,1禁用 */
	private String status;
	public void setTypeNo(String typeNo) 
	{
		this.typeNo = typeNo;
	}

	public String getTypeNo() 
	{
		return typeNo;
	}
	public void setTypeName(String typeName) 
	{
		this.typeName = typeName;
	}

	public String getTypeName() 
	{
		return typeName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
