package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class Terminal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int trid;
	private String trname;
	private String trtype;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="orgid",nullable = false)
    private Organization orgid;

	public Terminal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Terminal(int trid, String trname, String trtype, Organization orgid) {
		super();
		this.trid = trid;
		this.trname = trname;
		this.trtype = trtype;
		this.orgid = orgid;
	}

	public int getTrid() {
		return trid;
	}

	public void setTrid(int trid) {
		this.trid = trid;
	}

	public String getTrname() {
		return trname;
	}

	public void setTrname(String trname) {
		this.trname = trname;
	}

	public String getTrtype() {
		return trtype;
	}

	public void setTrtype(String trtype) {
		this.trtype = trtype;
	}

	public Organization getOrgid() {
		return orgid;
	}

	public void setOrgid(Organization orgid) {
		this.orgid = orgid;
	}
	
	
	

	
	
}
