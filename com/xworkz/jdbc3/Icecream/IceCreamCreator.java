package com.xworkz.jdbc3.Icecream;

public class IceCreamCreator {
	
		public static void main(String[] args) {
			
			IceCreamDTO dto = new IceCreamDTO(1, "Butterscotch","Butterscotch", 90.0);
			
			IceCreamDAO dao = new IceCreamDAO();
		
			//System.out.println(dao.save(dto));
			
			//dao.delete(1);
			
			dao.displayById(1);
			
			dao.displayAll();
			
			dao.displayTotalNoOfRecords();
		}
	}

