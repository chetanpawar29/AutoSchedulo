package com.scheduling.model;

import javax.persistence.Entity;
import javax.persistence.*;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Schedule 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int sid;
	private int did;
	private String dname;
		
	private int cid;
	private String cname;

	private String bid;
	private String time;
	private int rid;
	private String rsource;
	private String rdest;
	private String rmid;
	private String sDate;
	private String cdutyType;
	private String ddutyType;
	
	public String getDdutyType() {
		return ddutyType;
	}
	public void setDdutyType(String ddutyType) {
		this.ddutyType = ddutyType;
	}
	public String getCdutyType() {
		return cdutyType;
	}
	public void setCdutyType(String cdutyType) {
		this.cdutyType = cdutyType;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getBid() {
		return bid;
	}
	public void setBid(String bid) {
		this.bid = bid;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
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
	public String getsDate() {
		return sDate;
	}
	public void setsDate(String sDate) {
		this.sDate = sDate;
	}
	public Schedule(int sid, int did, String dname, int cid, String cname, String bid, String time, int rid,
			String rsource, String rdest, String rmid, String sDate, String cdutyType, String ddutyType) {
		super();
		this.sid = sid;
		this.did = did;
		this.dname = dname;
		this.cid = cid;
		this.cname = cname;
		this.bid = bid;
		this.time = time;
		this.rid = rid;
		this.rsource = rsource;
		this.rdest = rdest;
		this.rmid = rmid;
		this.sDate = sDate;
		this.cdutyType=cdutyType;
		this.ddutyType=ddutyType;
	}
	public Schedule() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Schedule [sid=" + sid + ", did=" + did + ", dname=" + dname + ", cid=" + cid + ", cname=" + cname
				+ ", bid=" + bid + ", time=" + time + ", rid=" + rid + ", rsource=" + rsource + ", rdest=" + rdest
				+ ", rmid=" + rmid + ", sDate=" + sDate + ", cdutyType=" + cdutyType + ", ddutyType=" + ddutyType + "]";
	}
	
	
	
	
}
