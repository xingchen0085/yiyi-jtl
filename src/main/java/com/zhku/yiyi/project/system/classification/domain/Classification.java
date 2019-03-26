package com.zhku.yiyi.project.system.classification.domain;

import com.zhku.yiyi.framework.web.domain.BaseEntity;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.util.Date;

/**
 * 职能分类表 t_classification
 * 
 * @author liujiating
 * @date 2018-12-04
 */
public class Classification extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	/** 职能名称 */
	private String ccName;
	/** 帐号状态:0正常,1禁用 */
	private String status;

	public void setCcName(String ccName) 
	{
		this.ccName = ccName;
	}

	public String getCcName() 
	{
		return ccName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
