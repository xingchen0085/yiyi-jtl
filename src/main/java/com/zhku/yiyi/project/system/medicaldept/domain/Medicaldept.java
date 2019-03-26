package com.zhku.yiyi.project.system.medicaldept.domain;

import com.zhku.yiyi.framework.web.domain.BaseEntity;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.util.Date;
/**
 * 科室分类表 t_medicaldept
 * 
 * @author liujiating
 * @date 2018-12-04
 */
public class Medicaldept extends BaseEntity
{
	private static final long serialVersionUid = 1L;
	/** 父级id */
	private String parentid;
	/** 科室编号 */
	private String mdNo;
	/** 科室名称 */
	private String mdName;
	/** 帐号状态:0正常,1禁用 */
	private String status;

	public void setParentid(String parentid) 
	{
		this.parentid = parentid;
	}

	public String getParentid() 
	{
		return parentid;
	}
	public void setMdNo(String mdNo) 
	{
		this.mdNo = mdNo;
	}

	public String getMdNo() 
	{
		return mdNo;
	}
	public void setMdName(String mdName) 
	{
		this.mdName = mdName;
	}

	public String getMdName() 
	{
		return mdName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
