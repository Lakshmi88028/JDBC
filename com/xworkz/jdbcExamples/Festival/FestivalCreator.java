package com.xworkz.jdbcExamples.Festival;

public class FestivalCreator {

	public static void main(String[] args) {
		FestivalDTO festival=new FestivalDTO(2, "sankranti", "14th jan", "Karanataka");
		FestivalDAO dao=new FestivalDAO();
		boolean save=dao.saveDTO(festival);
		System.out.println(save);
		
		
		FestivalDTO festival1=new FestivalDTO(3, "Dasara", "5th oct ", "Karanataka");
		boolean save1=dao.saveDTO(festival1);
		System.out.println(save1);
		
		dao.deleteById(2);
		
	}
}