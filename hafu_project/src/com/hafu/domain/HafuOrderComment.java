package com.hafu.domain;
// Generated 2017-7-21 16:02:03 by Hibernate Tools 5.2.3.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * HafuOrderComment generated by hbm2java
 */
public class HafuOrderComment implements java.io.Serializable {

	private Integer orderid;
	private HafuGoodComment hafuGoodComment;
	private Integer pid;
	private Date orderTime;
	private Integer orderStatus;
	private Set hafuOrderGoodComments = new HashSet(0);

	public HafuOrderComment() {
	}

	public HafuOrderComment(HafuGoodComment hafuGoodComment, Integer pid, Date orderTime, Integer orderStatus,
			Set hafuOrderGoodComments) {
		this.hafuGoodComment = hafuGoodComment;
		this.pid = pid;
		this.orderTime = orderTime;
		this.orderStatus = orderStatus;
		this.hafuOrderGoodComments = hafuOrderGoodComments;
	}

	public Integer getOrderid() {
		return this.orderid;
	}

	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
	}

	public HafuGoodComment getHafuGoodComment() {
		return this.hafuGoodComment;
	}

	public void setHafuGoodComment(HafuGoodComment hafuGoodComment) {
		this.hafuGoodComment = hafuGoodComment;
	}

	public Integer getPid() {
		return this.pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public Date getOrderTime() {
		return this.orderTime;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	public Integer getOrderStatus() {
		return this.orderStatus;
	}

	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Set getHafuOrderGoodComments() {
		return this.hafuOrderGoodComments;
	}

	public void setHafuOrderGoodComments(Set hafuOrderGoodComments) {
		this.hafuOrderGoodComments = hafuOrderGoodComments;
	}

}
