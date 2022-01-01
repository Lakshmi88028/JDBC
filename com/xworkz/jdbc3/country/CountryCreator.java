package com.xworkz.jdbc3.country;

public class CountryCreator {

	public static void main(String[] args) {
		
		CountryDTO dto = new CountryDTO(1, "India", 91, "Asia");
		
		CountryDAO dao = new CountryDAO();
		
		//System.out.println(dao.save(dto));
		
		//dao.delete(1);
		
		dao.displayById(1);
		
		dao.displayAll();
		
		dao.displayTotalNoOfRecords();
	}
}