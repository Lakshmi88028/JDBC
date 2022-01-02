package com.xworkz.jdbc3.state;

public class StateCreator {

	public static void main(String[] args) {
		
		StateDTO dto = new StateDTO(1, "Karnataka", 29, "Bengaluru");
		
		StateDAO dao = new StateDAO();
		
		//System.out.println(dao.save(dto));
		
		//dao.delete(6);
		
		dao.displayById(1);
		
		dao.displayAll();
		
		dao.displayTotalNoOfRecords();
	}
}