package com.zhku.yiyi.project.system.goods.domain;

import com.zhku.yiyi.framework.web.domain.BaseEntity;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.util.Date;
/**
 * 物品表 t_goods
 * 
 * @author liujiating
 * @date 2018-12-04
 */
public class Goods extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 主键ID */
	private String id;
	/** 物品编号 */
	private String goodsNo;
	/** 物品名称 */
	private String goodsName;
	/** 物品分类 */
	private String goodsType;
	/** 帐号状态:0正常,1禁用 */
	private String status;
	/** 创建者 */
	private String createBy;
	/** 创建时间 */
	private Date createTime;
	/** 更新者 */
	private String updateBy;
	/** 更新时间 */
	private Date updateTime;
	/**  */
	private String remark;

	public void setID(String id)
	{
		this.id = id;
	}

	public String getID() 
	{
		return id;
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
	public void setGoodsType(String goodsType) 
	{
		this.goodsType = goodsType;
	}

	public String getGoodsType() 
	{
		return goodsType;
	}
	public void setSTATUS(String status)
	{
		this.status = status;
	}

	public String getSTATUS() 
	{
		return status;
	}
	public void setCreateBy(String createBy) 
	{
		this.createBy = createBy;
	}

	public String getCreateBy() 
	{
		return createBy;
	}
	public void setCreateTime(Date createTime) 
	{
		this.createTime = createTime;
	}

	public Date getCreateTime() 
	{
		return createTime;
	}
	public void setUpdateBy(String updateBy) 
	{
		this.updateBy = updateBy;
	}

	public String getUpdateBy() 
	{
		return updateBy;
	}
	public void setUpdateTime(Date updateTime) 
	{
		this.updateTime = updateTime;
	}

	public Date getUpdateTime() 
	{
		return updateTime;
	}
	public void setREMARK(String remark)
	{
		this.remark = remark;
	}

	public String getREMARK() 
	{
		return remark;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getID())
            .append("goodsNo", getGoodsNo())
            .append("goodsName", getGoodsName())
            .append("goodsType", getGoodsType())
            .append("status", getSTATUS())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getREMARK())
            .toString();
    }
}
