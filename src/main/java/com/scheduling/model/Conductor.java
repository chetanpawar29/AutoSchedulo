package com.scheduling.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Conductor {
	@Id
	private int cid;
	private String cname;
	private String caddress;
	private String cmob;
	private String cemail;
	private String cgender;
	private String cstatus;
	private String cdutyType;
	

	
	public Conductor(int cid, String cname, String caddress, String cmob, String cemail, String cgender,
			String cstatus,String cdutyType ) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.caddress = caddress;
		this.cmob = cmob;
		this.cemail = cemail;
		this.cgender = cgender;
		this.cstatus = cstatus;
		this.cdutyType=cdutyType;
	}
	
	@Override
	public String toString() {
		return "Conductor [cid=" + cid + ", cname=" + cname + ", caddress=" + caddress + ", cmob=" + cmob + ", cemail="
				+ cemail + ", cgender=" + cgender + ", cstatus=" + cstatus + ", cdutyType=" + cdutyType + "]";
	}

	public Conductor() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getCaddress() {
		return caddress;
	}
	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}
	public String getCmob() {
		return cmob;
	}
	public void setCmob(String cmob) {
		this.cmob = cmob;
	}
	public String getCemail() {
		return cemail;
	}
	public void setCemail(String cemail) {
		this.cemail = cemail;
	}
	public String getCgender() {
		return cgender;
	}
	public void setCgender(String cgender) {
		this.cgender = cgender;
	}
	public String getCstatus() {
		return cstatus;
	}
	public void setCstatus(String cstatus) {
		this.cstatus = cstatus;
	}
	public String getCdutyType() {
		return cdutyType;
	}
	public void setCdutyType(String cdutyType) {
		this.cdutyType = cdutyType;
	}
	
	

}