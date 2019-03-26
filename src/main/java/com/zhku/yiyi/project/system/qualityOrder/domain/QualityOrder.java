package com.zhku.yiyi.project.system.qualityOrder.domain;
import com.zhku.yiyi.framework.web.domain.BaseEntity;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.math.BigDecimal;
import java.util.Date;
    
/**
 * 质检订单头表 t_quality_order
 * 
 * @author liujiating
 * @date 2018-12-04
 */
public class QualityOrder extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 订单号 */
	private String orderNo;
	/** 订单类型 1采购订单 2销售订单 */
	private String orderType;
	/** 总金额 */
	private BigDecimal totalAmount;
	/** 订单状态 1 新建 2 审核通过 3审核失败 4采购/销售中 5 采购/销售成功6 采购/销售失败 7入库/出库成功 */
	private String orderState;
	/** 采购人 */
	private String purchasingBy;
	/** 审核人 */
	private String auditBy;

	public void setOrderNo(String orderNo) 
	{
		this.orderNo = orderNo;
	}

	public String getOrderNo() 
	{
		return orderNo;
	}
	public void setOrderType(String orderType) 
	{
		this.orderType = orderType;
	}

	public String getOrderType() 
	{
		return orderType;
	}
	public void setTotalAmount(BigDecimal totalAmount) 
	{
		this.totalAmount = totalAmount;
	}

	public BigDecimal getTotalAmount() 
	{
		return totalAmount;
	}
	public void setOrderState(String orderState) 
	{
		this.orderState = orderState;
	}

	public String getOrderState() 
	{
		return orderState;
	}
	public void setPurchasingBy(String purchasingBy) 
	{
		this.purchasingBy = purchasingBy;
	}

	public String getPurchasingBy() 
	{
		return purchasingBy;
	}
	public void setAuditBy(String auditBy) 
	{
		this.auditBy = auditBy;
	}

	public String getAuditBy() 
	{
		return auditBy;
	}
	
}
