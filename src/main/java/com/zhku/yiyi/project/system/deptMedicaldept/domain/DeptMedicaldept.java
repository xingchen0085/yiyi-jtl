package com.zhku.yiyi.project.system.deptMedicaldept.domain;

import com.zhku.yiyi.framework.web.domain.BaseEntity;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.util.Date;
/**
 * 机构科室关系(机构只能是医院)表 t_dept_medicaldept
 * 
 * @author liujiating
 * @date 2018-12-04
 */
public class DeptMedicaldept extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 机构ID */
	private String deptId;
	/** 科室ID */
	private String medicaldeptId;

	public void setDeptId(String deptId) 
	{
		this.deptId = deptId;
	}

	public String getDeptId() 
	{
		return deptId;
	}
	public void setMedicaldeptId(String medicaldeptId) 
	{
		this.medicaldeptId = medicaldeptId;
	}

	public String getMedicaldeptId() 
	{
		return medicaldeptId;
	}
}
