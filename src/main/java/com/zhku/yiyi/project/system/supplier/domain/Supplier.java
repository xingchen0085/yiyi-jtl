package com.zhku.yiyi.project.system.supplier.domain;


import com.zhku.yiyi.framework.web.domain.BaseEntity;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.util.Date;
import com.zhku.yiyi.framework.web.domain.BaseEntity;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.util.Date;
/**
 * 供应商表 t_supplier
 * 
 * @author liujiating
 * @date 2018-12-04
 */
public class Supplier extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	/** 供应商编号 */
	private String spNo;
	/** 供应商名称 */
	private String spName;
	/** 供应商地址 */
	private String spAddr;
	/** 供应商分类编号 */
	private String spTypeNo;
	/** 供应商分类名称 */
	private String spTypeName;
	/** 帐号状态:0正常,1禁用 */
	private String status;

	public void setSpNo(String spNo) 
	{
		this.spNo = spNo;
	}

	public String getSpNo() 
	{
		return spNo;
	}
	public void setSpName(String spName) 
	{
		this.spName = spName;
	}

	public String getSpName() 
	{
		return spName;
	}
	public void setSpAddr(String spAddr) 
	{
		this.spAddr = spAddr;
	}

	public String getSpAddr() 
	{
		return spAddr;
	}
	public void setSpTypeNo(String spTypeNo) 
	{
		this.spTypeNo = spTypeNo;
	}

	public String getSpTypeNo() 
	{
		return spTypeNo;
	}
	public void setSpTypeName(String spTypeName) 
	{
		this.spTypeName = spTypeName;
	}

	public String getSpTypeName() 
	{
		return spTypeName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
