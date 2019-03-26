package com.zhku.yiyi.project.system.mdRegistration.domain;

import com.zhku.yiyi.framework.web.domain.BaseEntity;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.util.Date;
/**
 * 科室放号跟踪表 t_md_registration
 * 
 * @author liujiating
 * @date 2018-12-04
 */
public class MdRegistration extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	/** 科室编号 */
	private String mdNo;
	/** 科室名称 */
	private String mdName;
	/** 当前日期 */
	private Date currDate;
	/** 放号池ID */
	private String registrationPool;
	/** 当前最大号数 */
	private Long currMaxNum;
	/** 剩余号数 */
	private Long hasNum;
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
	public void setCurrDate(Date currDate) 
	{
		this.currDate = currDate;
	}

	public Date getCurrDate() 
	{
		return currDate;
	}
	public void setRegistrationPool(String registrationPool) 
	{
		this.registrationPool = registrationPool;
	}

	public String getRegistrationPool() 
	{
		return registrationPool;
	}
	public void setCurrMaxNum(Long currMaxNum) 
	{
		this.currMaxNum = currMaxNum;
	}

	public Long getCurrMaxNum() 
	{
		return currMaxNum;
	}
	public void setHasNum(Long hasNum) 
	{
		this.hasNum = hasNum;
	}

	public Long getHasNum() 
	{
		return hasNum;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
