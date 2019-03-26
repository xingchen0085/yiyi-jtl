package com.zhku.yiyi.project.system.sellOrderDetail.domain;

import com.zhku.yiyi.framework.web.domain.BaseEntity;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.math.BigDecimal;
import java.util.Date;
/**
 * 销售明细表 t_sell_order_detail
 * 
 * @author liujiating
 * @date 2018-12-04
 */
public class SellOrderDetail extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 订单号 */
	private String orderNo;
	/** 物品编号 */
	private String goodsNo;
	/** 物品名称 */
	private String goodsName;
	/** 金额 */
	private BigDecimal amount;

	public void setOrderNo(String orderNo) 
	{
		this.orderNo = orderNo;
	}

	public String getOrderNo() 
	{
		return orderNo;
	}
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
	
	
}
