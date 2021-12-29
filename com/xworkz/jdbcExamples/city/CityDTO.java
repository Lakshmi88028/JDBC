package com.xworkz.jdbcExamples.city;

import java.io.Serializable;

public class CityDTO implements Serializable{
private Integer c_id;
private String c_name;
private double c_population;
private String c_famousFor;
public CityDTO(Integer c_id, String c_name, double c_population, String c_famousFor) {
	super();
	this.c_id = c_id;
	this.c_name = c_name;
	this.c_population = c_population;
	this.c_famousFor = c_famousFor;
}
/**
 * @return the c_id
 */
public Integer getC_id() {
	return c_id;
}
/**
 * @return the c_name
 */
public String getC_name() {
	return c_name;
}
/**
 * @return the c_population
 */
public double getC_population() {
	return c_population;
}
/**
 * @return the c_famousFor
 */
public String getC_famousFor() {
	return c_famousFor;
}
@Override
public String toString() {
	return "CityDTO [c_id=" + c_id + ", c_name=" + c_name + ", c_population=" + c_population + ", c_famousFor="
			+ c_famousFor + "]";
}


}
