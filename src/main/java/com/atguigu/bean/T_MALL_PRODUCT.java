package com.atguigu.bean;

import java.util.Date;

public class T_MALL_PRODUCT {
//	Id(编号)           PKInteger
//	shp_mch(商品名称)  String(100)
//	shp_tp(商品图片)   String(100)
//	flbh1(分类编号1)   Integer
//	flbh2(分类编号2)   Integer
//	pp_id(品牌id)      Integer
//	chjshj(创建时间)   Date
//	shp_msh(商品描述)  String(1000)
	
	private int id;
	private String shp_mch;
	private String shp_tp;
	private int flbh1;
	private int flbh2;
	private int pp_id;
	private Date chjshj;
	private String shp_msh;
	
	@Override
	public String toString() {
		return "T_MALL_PRODUCT [id=" + id + ", shp_mch=" + shp_mch + ", shp_tp=" + shp_tp + ", flbh1=" + flbh1
				+ ", flbh2=" + flbh2 + ", pp_id=" + pp_id + ", chjshj=" + chjshj + ", shp_msh=" + shp_msh + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getShp_mch() {
		return shp_mch;
	}

	public void setShp_mch(String shp_mch) {
		this.shp_mch = shp_mch;
	}

	public String getShp_tp() {
		return shp_tp;
	}

	public void setShp_tp(String shp_tp) {
		this.shp_tp = shp_tp;
	}

	public int getFlbh1() {
		return flbh1;
	}

	public void setFlbh1(int flbh1) {
		this.flbh1 = flbh1;
	}

	public int getFlbh2() {
		return flbh2;
	}

	public void setFlbh2(int flbh2) {
		this.flbh2 = flbh2;
	}

	public int getPp_id() {
		return pp_id;
	}

	public void setPp_id(int pp_id) {
		this.pp_id = pp_id;
	}

	public Date getChjshj() {
		return chjshj;
	}

	public void setChjshj(Date chjshj) {
		this.chjshj = chjshj;
	}

	public String getShp_msh() {
		return shp_msh;
	}

	public void setShp_msh(String shp_msh) {
		this.shp_msh = shp_msh;
	}

}
