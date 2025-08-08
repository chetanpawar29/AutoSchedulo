package com.scheduling.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Drivers {
	@Id
	private int did;
	private String dname;
	private String daddress;
	private String dmob;
	private String demail;
	private String dgender;
	private String dstatus;
	private String ddutyType;
	
	public String getDdutyType() {
		return ddutyType;
	}
	public void setDdutyType(String ddutyType) {
		this.ddutyType = ddutyType;
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
	public String getDaddress() {
		return daddress;
	}
	public void setDaddress(String daddress) {
		this.daddress = daddress;
	}
	public String getDmob() {
		return dmob;
	}
	public void setDmob(String dmob) {
		this.dmob = dmob;
	}
	public String getDemail() {
		return demail;
	}
	public void setDemail(String demail) {
		this.demail = demail;
	}
	public String getDgender() {
		return dgender;
	}
	public void setDgender(String dgender) {
		this.dgender = dgender;
	}
	public String getDstatus() {
		return dstatus;
	}
	public void setDstatus(String dstatus) {
		this.dstatus = dstatus;
	}
	public Drivers(int did, String dname, String daddress, String dmob, String demail, String dgender, String dstatus, String ddutyType) {
		super();
		this.did = did;
		this.dname = dname;
		this.daddress = daddress;
		this.dmob = dmob;
		this.demail = demail;
		this.dgender = dgender;
		this.dstatus = dstatus;
		this.ddutyType=ddutyType;
	}
	public Drivers() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Drivers [did=" + did + ", dname=" + dname + ", daddress=" + daddress + ", dmob=" + dmob + ", demail="
				+ demail + ", dgender=" + dgender + ", dstatus=" + dstatus + ", ddutyType=" + ddutyType + "]";
	}
	
	
}