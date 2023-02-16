package project1;

import java.util.HashSet;
import java.util.Set;

public class Car1{
 
	public static   Carservices getchar(String cartype ) {
//		Services car1=null;
	Carservices car1 = null;
		
		
	if(cartype.equalsIgnoreCase("Hatchback")) {
		Hatchback bt= new Hatchback();			
		car1=bt;
		System.out.println("types of car:"+" "+"hatachback");



	}
	else if(cartype.equalsIgnoreCase("suv")) {
//		Suv kp=null;
		Suv hk= new Suv();
		car1=hk;
	System.out.println("types of car"+" "+"suv");
	
	}
	else if(cartype.equalsIgnoreCase("sedan")) {
		Sedan vk = new Sedan();
		System.out.println("types of car"+ "sedan");
		car1=vk;
	}
	else {
		System.out.println("no output");
	}
	return (Carservices) car1;

	
	


	}

		
		
		
	
	

	public static void main(String[] args) {
		
		
//	Carservices  mt= getchar("Hatchback");
	Carservices  mt= getchar("Hatchback");

	Set<Integer>serviset=new HashSet();
	serviset.add(1);
	serviset.add(2);
	serviset.add(3); 
	serviset.add(4);
	serviset.add(5);
	mt.doservice(serviset);
//	mt.doservice(serviset);
		
	

			
		

			




		

	
	}



		

	
}




	
	


		
	











		


	



