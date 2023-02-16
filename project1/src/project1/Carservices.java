package project1;

import java.util.Set;

public abstract class Carservices implements Services {
	private static final int BSO1 = 1;
	private static final int EF01 = 2;
	private static final int CFO1 = 3;
	private static final int BFO1 = 4;
	private static final int GFO1 = 5;

	

	public  int doservice(Set<Integer>servicelist) {
		
		int service=0;
		for (Integer code: servicelist) {
		switch(code){
		case BSO1:
			service += Basicservices();
			System.out.println("Basisc service "+" "+Basicservices());
//System.out.println("basis"+service);
	
//			System.out.println("total bill"+"service");
			
			break;
		case EF01:
			service += enginefixing();
			System.out.println("engineixing Fixing "+" "+enginefixing());
			
	
			break;
		case CFO1:
			
			service += clutchfixing();
			System.out.println("clutch Fixing "+""+clutchfixing());
			
			
			break;
		case BFO1:
			service += brakefixing();
			System.out.println("breake Fixing:"+" "+brakefixing());
			

			break;
		case GFO1:
			service += gearfixing();;
			System.out.println("Gear Fixing:"+" "+gearfixing());
			
//		System.out.println("gear fixing"+service);
			break;
			
		}

		

		}
//		System.out.println("total biLL:" + service);
		
		if(service>10000) {
//			System.out.println("docleaning"+" "+);
			docleaning();
		}
		else {
			System.out.println("total biLL:" + service);
		}
		
		return service;
		
	}
	
	
}
