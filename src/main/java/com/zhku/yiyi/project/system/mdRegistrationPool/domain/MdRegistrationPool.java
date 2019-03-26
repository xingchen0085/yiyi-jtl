package com.zhku.yiyi.project.system.mdRegistrationPool.domain;


import com.zhku.yiyi.framework.web.domain.BaseEntity;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.util.Date;

/**
 * 科室放号池,设置挂号放号表 t_md_registration_pool
 * 
 * @author liujiating
 * @date 2018-12-04
 */
public class MdRegistrationPool extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 科室编号 */
	private String mdNo;
	/** 科室名称 */
	private String mdName;
	/** 总号数 */
	private Long totalNum;
	/** 是否余号 1是  0否 */
	private String hasFlag;
	/** 帐号状态:0正常,1禁用 */
	private String status;

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
	public void setTotalNum(Long totalNum) 
	{
		this.totalNum = totalNum;
	}

	public Long getTotalNum() 
	{
		return totalNum;
	}
	public void setHasFlag(String hasFlag) 
	{
		this.hasFlag = hasFlag;
	}

	public String getHasFlag() 
	{
		return hasFlag;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
