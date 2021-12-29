package com.xworkz.jdbcExamples.country;

public class CountryDTO {

	private Integer c_id;
	private String c_name;
	private Integer c_code;
	private String continent;
	
	public CountryDTO(Integer c_id, String c_name, Integer c_code, String continent) {
		super();
		this.c_id = c_id;
		this.c_name = c_name;
		this.c_code = c_code;
		this.continent = continent;
	}

	public Integer getC_id() {
		return c_id;
	}

	public String getC_name() {
		return c_name;
	}

	public Integer getC_code() {
		return c_code;
	}

	public String getContinent() {
		return continent;
	}

	@Override
	public String toString() {
		return "CountryDTO [c_id=" + c_id + ", c_name=" + c_name + ", c_code=" + c_code + ", continent=" + continent
				+ "]";
	}
	
}