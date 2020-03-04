package com.accp.pojo;

import java.util.Date;

public class Auction {
	private Integer aid;
	private Integer wareid;
	private Integer userID;
	private Float price;
	private Date time;
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public Integer getWareid() {
		return wareid;
	}
	public void setWareid(Integer wareid) {
		this.wareid = wareid;
	}
	public Integer getUserID() {
		return userID;
	}
	public void setUserID(Integer userID) {
		this.userID = userID;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	
}
