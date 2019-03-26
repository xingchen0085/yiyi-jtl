package com.zhku.yiyi.project.system.staff.domain;

import com.zhku.yiyi.framework.web.domain.BaseEntity;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.util.Date;
/**
 * 人员管理表 t_staff
 * 
 * @author liujiating
 * @date 2018-12-04
 */
public class Staff extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	/** 人员编号 */
	private String staffNo;
	/** 姓名 */
	private String staffName;
	/** 年龄 */
	private Integer age;
	/** 性别 1男   2 女 */
	private String sex;
	/** 所属机构ID */
	private String deptId;
	/** 所属机构名称 */
	private String deptName;
	/** 职能ID */
	private String ccId;
	/** 职能名称 */
	private String ccName;
	/** 帐号状态:0正常,1禁用 */
	private String status;
	
	
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setStaffNo(String staffNo) 
	{
		this.staffNo = staffNo;
	}

	public String getStaffNo() 
	{
		return staffNo;
	}
	public void setStaffName(String staffName) 
	{
		this.staffName = staffName;
	}

	public String getStaffName() 
	{
		return staffName;
	}
	
	public void setDeptId(String deptId) 
	{
		this.deptId = deptId;
	}

	public String getDeptId() 
	{
		return deptId;
	}
	public void setDeptName(String deptName) 
	{
		this.deptName = deptName;
	}

	public String getDeptName() 
	{
		return deptName;
	}
	public void setCcId(String ccId) 
	{
		this.ccId = ccId;
	}

	public String getCcId() 
	{
		return ccId;
	}
	public void setCcName(String ccName) 
	{
		this.ccName = ccName;
	}

	public String getCcName() 
	{
		return ccName;
	}
}
