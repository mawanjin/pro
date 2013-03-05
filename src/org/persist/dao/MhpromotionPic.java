package org.persist.dao;

// Generated 2013-3-1 15:41:13 by Hibernate Tools 3.4.0.CR1

/**
 * MhpromotionPic generated by hbm2java
 */
public class MhpromotionPic implements java.io.Serializable {

	private MhpromotionPicId id;
	private Mhpromotion mhpromotion;
	private Integer porder;
	private Integer type;

	public MhpromotionPic() {
	}

	public MhpromotionPic(MhpromotionPicId id, Mhpromotion mhpromotion) {
		this.id = id;
		this.mhpromotion = mhpromotion;
	}

	public MhpromotionPic(MhpromotionPicId id, Mhpromotion mhpromotion,
			Integer porder, Integer type) {
		this.id = id;
		this.mhpromotion = mhpromotion;
		this.porder = porder;
		this.type = type;
	}

	public MhpromotionPicId getId() {
		return this.id;
	}

	public void setId(MhpromotionPicId id) {
		this.id = id;
	}

	public Mhpromotion getMhpromotion() {
		return this.mhpromotion;
	}

	public void setMhpromotion(Mhpromotion mhpromotion) {
		this.mhpromotion = mhpromotion;
	}

	public Integer getPorder() {
		return this.porder;
	}

	public void setPorder(Integer porder) {
		this.porder = porder;
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

}