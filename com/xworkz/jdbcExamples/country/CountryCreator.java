package com.xworkz.jdbcExamples.country;

public class CountryCreator {
	public static void main(String[] args) {
		
		
		CountryDTO country=new CountryDTO(1, "INDIA",91, "Asia");
		CountryDTO country1=new CountryDTO(2,"Africa",27,"jkl");
		
		CountryDAO dao=new CountryDAO();
		boolean save=dao.saveDTO(country);
		boolean save1=dao.saveDTO(country);
		System.out.println(save1);
		
		dao.deleteById(3);
	}
}