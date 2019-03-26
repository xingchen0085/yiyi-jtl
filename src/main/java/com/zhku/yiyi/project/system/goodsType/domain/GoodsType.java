package com.zhku.yiyi.project.system.goodsType.domain;

import com.zhku.yiyi.framework.web.domain.BaseEntity;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.util.Date;
/**
 * 物品类型表 t_goods_type
 * 
 * @author liujiating
 * @date 2018-12-04
 */
public class GoodsType extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 分类编号 */
	private String typeNo;
	/** 分类名称 */
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
	public void setstatus(String status) 
	{
		this.status = status;
	}

	public String getstatus() 
	{
		return status;
	}
}
