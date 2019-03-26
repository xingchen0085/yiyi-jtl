package com.zhku.yiyi.project.system.sellOrder.domain;

import com.zhku.yiyi.framework.web.domain.BaseEntity;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.math.BigDecimal;
import java.util.Date;
/**
 * 销售订单头表 t_sell_order
 * 
 * @author liujiating
 * @date 2018-12-04
 */
public class SellOrder extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 订单号 */
	private String orderNo;
	/** 销售方机构ID */
	private String sellDeptId;
	/** 销售方机构名称 */
	private String sellDeptName;
	/** 总金额 */
	private BigDecimal totalAmount;
	/** 订单状态 1 新建 2 审核通过 3审核失败 4采购中 5 采购成功6 采购失败 7入库成功 */
	private String orderState;
	/** 客户 */
	private String buyBy;
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
	public void setSellDeptId(String sellDeptId) 
	{
		this.sellDeptId = sellDeptId;
	}

	public String getSellDeptId() 
	{
		return sellDeptId;
	}
	public void setSellDeptName(String sellDeptName) 
	{
		this.sellDeptName = sellDeptName;
	}

	public String getSellDeptName() 
	{
		return sellDeptName;
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
	public void setBuyBy(String buyBy) 
	{
		this.buyBy = buyBy;
	}

	public String getBuyBy() 
	{
		return buyBy;
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
