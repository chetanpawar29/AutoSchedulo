package com.scheduling.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Bus {
	@Id
	private String bid;
	private int bseats;
	private String bstatus;
	public String getBid() {
		return bid;
	}
	public void setBid(String bid) {
		this.bid = bid;
	}
	public int getBseats() {
		return bseats;
	}
	public void setBseats(int bseats) {
		this.bseats = bseats;
	}
	public String getBstatus() {
		return bstatus;
	}
	public void setBstatus(String bstatus) {
		this.bstatus = bstatus;
	}
	public Bus(String bid, int bseats, String bstatus) {
		super();
		this.bid = bid;
		this.bseats = bseats;
		this.bstatus = bstatus;
	}
	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Bus [bid=" + bid + ", bseats=" + bseats + ", bstatus=" + bstatus + "]";
	}
	

}