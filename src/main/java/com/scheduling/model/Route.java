package com.scheduling.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component

public class Route {
	@Id
	private int rid;
	private String rsource;
	private String rdest;
	private String rmid;
	private String rstatus;
	private String time;
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getRsource() {
		return rsource;
	}
	public void setRsource(String rsource) {
		this.rsource = rsource;
	}
	public String getRdest() {
		return rdest;
	}
	public void setRdest(String rdest) {
		this.rdest = rdest;
	}
	public String getRmid() {
		return rmid;
	}
	public void setRmid(String rmid) {
		this.rmid = rmid;
	}
	public String getRstatus() {
		return rstatus;
	}
	public void setRstatus(String rstatus) {
		this.rstatus = rstatus;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public Route(int rid, String rsource, String rdest, String rmid, String rstatus, String time) {
		super();
		this.rid = rid;
		this.rsource = rsource;
		this.rdest = rdest;
		this.rmid = rmid;
		this.rstatus = rstatus;
		this.time = time;
	}
	public Route() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Route [rid=" + rid + ", rsource=" + rsource + ", rdest=" + rdest + ", rmid=" + rmid + ", rstatus="
				+ rstatus + ", time=" + time + "]";
	}
	
	

}