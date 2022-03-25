package com.example.demo.dto;



import org.springframework.stereotype.Component;

import com.example.demo.entity.Organization;

@Component
public class TerminalDto {
	
	
	private int trid;
	private String trname;
	private String trtype;
	
	private int orgid;

	
    public int getOrgid() {
		return orgid;
	}

	public void setOrgid(int orgid) {
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


	
	

}
