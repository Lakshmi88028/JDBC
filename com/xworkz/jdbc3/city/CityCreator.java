package com.xworkz.jdbc3.city;

public class CityCreator {
public static void main(String[] args) {
		
		CityDTO dto = new CityDTO(5,"Harapanahalli",968.0,"dontknow");
		System.out.println(dto);
		CityDAO dao = new CityDAO();
		dao.delete(3);
		dao.displatAll();
		dao.displayById(1);
		dao.displayTotalNoOfRecords();
		
		
		
	}
}
