package com.xworkz.jdbcExamples.IceCream;

public class IceCreamCreator {
public static void main(String[] args) {
			
			IceCreamDTO ice=new IceCreamDTO(1, "Butterscotch","Butterscotch", 90.0);
			System.out.println(ice);
			IceCreamDTO ice1=new IceCreamDTO(2, "Chocobar","chocolate", 50.0);
			IceCreamDAO dao=new IceCreamDAO();
			IceCreamDTO ice2=new IceCreamDTO(3, "Mangodolly","Mango", 70.0);
			boolean saved= dao.saveDTO(ice);
			boolean saved1 = dao.saveDTO(ice1);
			boolean saved2 = dao.saveDTO(ice2);
			System.out.println(saved);
			
			dao.deleteById(1);
		}
		}
