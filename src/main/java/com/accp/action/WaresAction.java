package com.accp.action;

import java.util.Date;

public class WaresAction {
	private Integer wareid;
	private Integer userID;
	private String warname;
	private Float startprice;
	private Float floorprice;
	private Date starttime;
	private Date endtime;
	private String src;
	private String depict;
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
	public String getWarname() {
		return warname;
	}
	public void setWarname(String warname) {
		this.warname = warname;
	}
	public Float getStartprice() {
		return startprice;
	}
	public void setStartprice(Float startprice) {
		this.startprice = startprice;
	}
	public Float getFloorprice() {
		return floorprice;
	}
	public void setFloorprice(Float floorprice) {
		this.floorprice = floorprice;
	}
	public Date getStarttime() {
		return starttime;
	}
	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}
	public Date getEndtime() {
		return endtime;
	}
	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}
	public String getSrc() {
		return src;
	}
	public void setSrc(String src) {
		this.src = src;
	}
	public String getDepict() {
		return depict;
	}
	public void setDepict(String depict) {
		this.depict = depict;
	}
	
}
