package com.xworkz.jdbc3.Festival;

public class FestivalDTO {

	private int f_id;
	private String f_name;
	private String f_date;
	private String f_state;
	
	public FestivalDTO(int f_id, String f_name, String f_date, String f_state) {
		super();
		this.f_id = f_id;
		this.f_name = f_name;
		this.f_date = f_date;
		this.f_state = f_state;
	}

	public int getF_id() {
		return f_id;
	}

	public String getF_name() {
		return f_name;
	}

	public String getF_date() {
		return f_date;
	}

	public String getF_state() {
		return f_state;
	}

	@Override
	public String toString() {
		return "FestivalDto [f_id=" + f_id + ", f_name=" + f_name + ", f_date=" + f_date + ", f_state=" + f_state + "]";
	}
}
