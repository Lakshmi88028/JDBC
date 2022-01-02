package com.xworkz.jdbc3.state;

public class StateDTO {
	private int sid;
	private String sname;
	private int scode;
	private String scapital;
	
	public StateDTO(int sid, String sname, int scode, String scapital) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.scode = scode;
		this.scapital = scapital;
	}

	public int getSid() {
		return sid;
	}

	public String getSname() {
		return sname;
	}

	public int getScode() {
		return scode;
	}

	public String getScapital() {
		return scapital;
	}

	@Override
	public String toString() {
		return "StateDto [sid=" + sid + ", sname=" + sname + ", scode=" + scode + ", scapital=" + scapital + "]";
	}
}

