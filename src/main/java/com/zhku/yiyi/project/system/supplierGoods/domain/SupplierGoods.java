package com.zhku.yiyi.project.system.supplierGoods.domain;

import com.zhku.yiyi.framework.web.domain.BaseEntity;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.math.BigDecimal;
import java.util.Date;
/**
 * 供应商商品表 t_supplier_goods
 * 
 * @author liujiating
 * @date 2018-12-04
 */
public class SupplierGoods extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 物品编号 */
	private String goodsNo;
	/** 物品名称 */
	private String goodsName;
	/** 金额 */
	private BigDecimal amount;
	/** 折扣 0 - 100 例30表示3折 */
	private Integer discount;
	/** 帐号状态:0正常,1禁用 */
	private String status;

	public void setGoodsNo(String goodsNo) 
	{
		this.goodsNo = goodsNo;
	}

	public String getGoodsNo() 
	{
		return goodsNo;
	}
	public void setGoodsName(String goodsName) 
	{
		this.goodsName = goodsName;
	}

	public String getGoodsName() 
	{
		return goodsName;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Integer getDiscount() {
		return discount;
	}

	public void setDiscount(Integer discount) {
		this.discount = discount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
