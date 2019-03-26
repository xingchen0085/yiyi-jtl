package com.zhku.yiyi.project.system.ward.domain;

import com.zhku.yiyi.framework.web.domain.BaseEntity;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.util.Date;
/**
 * 病房表 t_ward
 * 
 * @author liujiating
 * @date 2018-12-04
 */
public class Ward extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	/** 病房编号 */
	private String wardNo;
	/** 病房名称 */
	private String wardName;
	/** 所属科室编号 */
	private String mdNo;
	/** 所属科室名称 */
	private String mdName;
	/** 是否已入住 1 是  0否 */
	private String useFlag;

	public void setWardNo(String wardNo) 
	{
		this.wardNo = wardNo;
	}

	public String getWardNo() 
	{
		return wardNo;
	}
	public void setWardName(String wardName) 
	{
		this.wardName = wardName;
	}

	public String getWardName() 
	{
		return wardName;
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
	public void setUseFlag(String useFlag) 
	{
		this.useFlag = useFlag;
	}

	public String getUseFlag() 
	{
		return useFlag;
	}
	
}
