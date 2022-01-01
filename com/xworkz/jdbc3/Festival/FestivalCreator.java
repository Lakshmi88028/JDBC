package com.xworkz.jdbc3.Festival;

public class FestivalCreator {

	public static void main(String[] args) {
		
		FestivalDTO dto = new FestivalDTO(1, "sankranti", "14th jan", "Karanataka");
		
		FestivalDAO dao = new FestivalDAO();
		
		//System.out.println(dao.save(dto));
		
		//dao.delete(1);
		
		dao.displayById(1);
		
		dao.displayAll();
		
		dao.displayTotalNoOfRecords();
	}
}