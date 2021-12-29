package com.xworkz.jdbcExamples.city;

public class CityCreator {

	private static char[] delete;

	public static void main(String[] args) {
		
		CityDTO city = new CityDTO(4,"kotturu",965.0,"mirchi");
		System.out.println(city);
		
		CityDAO dao = new CityDAO();
		boolean saved = dao.saveDTO(city);
		System.out.println(saved);
		dao.deleteById(1);
		System.out.println(delete);
	}
}
