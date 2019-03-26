package com.zhku.yiyi.project.system.store.domain;


import com.zhku.yiyi.framework.web.domain.BaseEntity;
import com.zhku.yiyi.framework.web.domain.BaseEntity;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.util.Date;
/**
 * 供应商表 t_store
 * 
 * @author liujiating
 * @date 2018-12-04
 */
public class Store extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	/** 仓库编号 */
	private String stNo;
	/** 仓库名称 */
	private String stName;
	/** 仓库地址 */
	private String stAddr;
	/** 仓库分类编号 */
	private String stTypeNo;
	/** 仓库分类名称 */
	private String stTypeName;
	/** 帐号状态:0正常,1禁用 */
	private String status;

	public void setStNo(String stNo) 
	{
		this.stNo = stNo;
	}

	public String getStNo() 
	{
		return stNo;
	}
	public void setStName(String stName) 
	{
		this.stName = stName;
	}

	public String getStName() 
	{
		return stName;
	}
	public void setStAddr(String stAddr) 
	{
		this.stAddr = stAddr;
	}

	public String getStAddr() 
	{
		return stAddr;
	}
	public void setStTypeNo(String stTypeNo) 
	{
		this.stTypeNo = stTypeNo;
	}

	public String getStTypeNo() 
	{
		return stTypeNo;
	}
	public void setStTypeName(String stTypeName) 
	{
		this.stTypeName = stTypeName;
	}

	public String getStTypeName() 
	{
		return stTypeName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
