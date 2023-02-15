package java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Streamdrriver2 {
	

	public static void main(String[] args) {
//		sorting the list by asending by sallary  using stram ap1
		List<Streamexample> list = new ArrayList<Streamexample>();
		Streamexample e1= new Streamexample("abc", 21, 10000);
		Streamexample e2= new Streamexample("pqr", 26, 12000);
		Streamexample e3= new Streamexample("mno", 28, 19000);
		Streamexample e4= new Streamexample("jkl", 22, 17000);
		Streamexample e5= new Streamexample("abc", 23, 15000);
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
//		List<Streamexample>ep =list.stream().sorted(new Comparator<Streamexample>()
//				{
//
//					@Override
//					public int compare(Streamexample o1, Streamexample o2) {
//						// TODO Auto-generated method stub
//						return (int) (o1.getSallary()-o2.getSallary());
//					}}).collect(Collectors.toList());
//		System.out.println(list);
//		
//		now using lambda expression
//		List<Streamexample>ep1 =list.stream().sorted((o1,o2)->(int) 
//				(o1.getSallary()-o2.getSallary())).collect(Collectors.toList());
//
//	System.out.println(ep1);
		
//		now using lambda decending based on the sallary only just chage the
//		refrences of o1,o2
//		List<Streamexample>ep2 =list.stream().sorted((o1,o2)->(int) 
//				(o2.getSallary()-o1.getSallary())).collect(Collectors.toList());
//
//		System.out.println(ep2);	
//	same way we can do with comparetolong method
	List<Streamexample>ep4 =list.stream().sorted(Comparator.comparing(Streamexample::getSallary))			
			.collect(Collectors.toList());
//	 for the decending order
//	
//	List<Streamexample>ep5 =list.stream().sorted(Comparator.comparing(Streamexample::getSallary).reversed())			
//			.collect(Collectors.toList());
	
//	sorting the list in ascending order by age
//	List<Streamexample>ep6 =list.stream().sorted(Comparator.comparingInt(Streamexample::getAge))			
//			.collect(Collectors.toList());
//	System.out.println(ep6);
  	
////	sorting the list in descending order by age we use comparingint methos,for float we will use comparinglong
//	List<Streamexample>ep6 =list.stream().sorted(Comparator.comparingInt(Streamexample::getAge).reversed())			
//			.collect(Collectors.toList());
//	System.out.println(ep6);
	
//	sorting by name in ascending we will use comparing for string
//	List<Streamexample>ep6 =list.stream().sorted(Comparator.comparing(Streamexample::getName))			
//			.collect(Collectors.toList());
//	System.out.println(ep6);
	
//	sorting by name in descending we will use comparing for string
//	List<Streamexample>ep6 =list.stream().sorted(Comparator.comparing(Streamexample::getName).reversed())			
//			.collect(Collectors.toList());
//	System.out.println(ep6);
	
//	filtring with name
//	Streamexample op1=list.stream().filter(x->"abc".equals(x.getName()))
//			.findAny()
//			.orElse(null);
//	System.out.println(op1.getName()+""+op1.getAge());
	
//	write a program to print who is getting minimum sallary
	
//	Streamexample op2=list.stream().min((o1,o2)->(int)(o1.getSallary()-o2.getSallary())).get();
//	System.out.println(op2.getName()+op2.getSallary());
//	Streamexample op3=list.stream().max((o1,o2)->(int)(o1.getSallary()-o2.getSallary())).get();
//	System.out.println(op2.getName()+op3.getSallary());
//	getting sallary in ascendig order
	System.out.println("emp salary order"+list.stream().map((d)->d.getSallary()).sorted()
			.collect(Collectors.toList()));
	System.out.println("emp salary order"+list.stream().flatMap((c)->c.stream()).
			collect(Collectors.toList()));
		
	
	}
  
}
