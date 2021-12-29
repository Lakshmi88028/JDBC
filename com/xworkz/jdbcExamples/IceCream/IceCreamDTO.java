package com.xworkz.jdbcExamples.IceCream;

public class IceCreamDTO {

	private Integer c_id;
	private String c_name;
	private String c_flavour;
	private double c_price;
	

	public IceCreamDTO(Integer c_id, String c_name, String c_flavour, double c_price) {
		super();
		this.c_id = c_id;
		this.c_name = c_name;
		this.c_flavour = c_flavour;
		this.c_price = c_price;
	}
	
	public Integer getC_id() {
		return c_id;
	}
	public String getC_name() {
		return c_name;
	}
	public String getC_flavour() {
		return c_flavour;
	}
	public double getC_price() {
		return c_price;
	}

	@Override
	public String toString() {
		return "IcecreamDTO [c_id=" + c_id + ", c_name=" + c_name + ", c_flavour=" + c_flavour + ", c_price=" + c_price
				+ "]";
	}
}
