package org.persist.dao;

// Generated 2013-3-1 15:41:13 by Hibernate Tools 3.4.0.CR1

/**
 * MhpromotionCategoryRef generated by hbm2java
 */
public class MhpromotionCategoryRef implements java.io.Serializable {

	private String pid;
	private MhpromotionCategory mhpromotionCategory;
	private Mhpromotion mhpromotion;

	public MhpromotionCategoryRef() {
	}

	public MhpromotionCategoryRef(MhpromotionCategory mhpromotionCategory,
			Mhpromotion mhpromotion) {
		this.mhpromotionCategory = mhpromotionCategory;
		this.mhpromotion = mhpromotion;
	}

	public String getPid() {
		return this.pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public MhpromotionCategory getMhpromotionCategory() {
		return this.mhpromotionCategory;
	}

	public void setMhpromotionCategory(MhpromotionCategory mhpromotionCategory) {
		this.mhpromotionCategory = mhpromotionCategory;
	}

	public Mhpromotion getMhpromotion() {
		return this.mhpromotion;
	}

	public void setMhpromotion(Mhpromotion mhpromotion) {
		this.mhpromotion = mhpromotion;
	}

}