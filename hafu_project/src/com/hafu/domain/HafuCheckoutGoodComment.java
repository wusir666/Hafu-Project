package com.hafu.domain;
// Generated 2017-8-10 10:33:21 by Hibernate Tools 5.2.3.Final

/**
 * HafuCheckoutGoodComment generated by hbm2java
 */
public class HafuCheckoutGoodComment implements java.io.Serializable {

	private HafuCheckoutGoodCommentId id;
	private HafuCheckoutComment hafuCheckoutComment;
	private HafuGoodComment hafuGoodComment;
	private int goodnumber;

	public HafuCheckoutGoodComment() {
	}

	public HafuCheckoutGoodComment(HafuCheckoutGoodCommentId id, HafuCheckoutComment hafuCheckoutComment,
			HafuGoodComment hafuGoodComment, int goodnumber) {
		this.id = id;
		this.hafuCheckoutComment = hafuCheckoutComment;
		this.hafuGoodComment = hafuGoodComment;
		this.goodnumber = goodnumber;
	}

	public HafuCheckoutGoodCommentId getId() {
		return this.id;
	}

	public void setId(HafuCheckoutGoodCommentId id) {
		this.id = id;
	}

	public HafuCheckoutComment getHafuCheckoutComment() {
		return this.hafuCheckoutComment;
	}

	public void setHafuCheckoutComment(HafuCheckoutComment hafuCheckoutComment) {
		this.hafuCheckoutComment = hafuCheckoutComment;
	}

	public HafuGoodComment getHafuGoodComment() {
		return this.hafuGoodComment;
	}

	public void setHafuGoodComment(HafuGoodComment hafuGoodComment) {
		this.hafuGoodComment = hafuGoodComment;
	}

	public int getGoodnumber() {
		return this.goodnumber;
	}

	public void setGoodnumber(int goodnumber) {
		this.goodnumber = goodnumber;
	}

}
