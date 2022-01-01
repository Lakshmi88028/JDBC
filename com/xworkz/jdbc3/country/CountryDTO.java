package com.xworkz.jdbc3.country;

public class CountryDTO {

	private int c_id;
	private String c_name;
	private int c_code;
	private String continent;
	
	public CountryDTO(int c_id, String c_name, int c_code, String continent) {
		super();
		this.c_id = c_id;
		this.c_name = c_name;
		this.c_code = c_code;
		this.continent = continent;
	}

	public int getC_id() {
		return c_id;
	}

	public String getC_name() {
		return c_name;
	}

	public int getC_code() {
		return c_code;
	}

	public String getContinent() {
		return continent;
	}

	@Override
	public String toString() {
		return "CountryDto [c_id=" + c_id + ", c_name=" + c_name + ", c_code=" + c_code + ", continent=" + continent + "]";
	}
}