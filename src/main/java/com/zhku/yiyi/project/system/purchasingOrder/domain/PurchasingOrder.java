package com.zhku.yiyi.project.system.purchasingOrder.domain;

import com.zhku.yiyi.framework.web.domain.BaseEntity;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.math.BigDecimal;
import java.util.Date;
/**
 * 采购订单头表 t_purchasing_order
 * 
 * @author liujiating
 * @date 2018-12-04
 */
public class PurchasingOrder extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 订单号 */
	private String orderNo;
	/** 采购方机构ID */
	private String purshInDeptId;
	/** 采购方机构名称 */
	private String purshInDeptName;
	/** 供应商ID */
	private String supplierId;
	/** 供应商名称 */
	private String supplierName;
	/** 总金额 */
	private BigDecimal totalAmount;
	/** 订单状态 1 新建 2 审核通过 3审核失败 4采购中 5 采购成功6 采购失败 7入库成功 */
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
	public void setPurshInDeptId(String purshInDeptId) 
	{
		this.purshInDeptId = purshInDeptId;
	}

	public String getPurshInDeptId() 
	{
		return purshInDeptId;
	}
	public void setPurshInDeptName(String purshInDeptName) 
	{
		this.purshInDeptName = purshInDeptName;
	}

	public String getPurshInDeptName() 
	{
		return purshInDeptName;
	}
	public void setSupplierId(String supplierId) 
	{
		this.supplierId = supplierId;
	}

	public String getSupplierId() 
	{
		return supplierId;
	}
	public void setSupplierName(String supplierName) 
	{
		this.supplierName = supplierName;
	}

	public String getSupplierName() 
	{
		return supplierName;
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
