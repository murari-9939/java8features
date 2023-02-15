package java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streammaindreiver {
	public static void main(String[] args) {
		List<Streamexample> lists = new ArrayList<Streamexample>();
		Streamexample e1= new Streamexample("abc", 21, 10000);
		Streamexample e2= new Streamexample("pqr", 26, 12000);
		Streamexample e3= new Streamexample("mno", 28, 19000);
		Streamexample e4= new Streamexample("jkl", 22, 17000);
		Streamexample e5= new Streamexample("abc", 23, 15000);
		lists.add(e1);
		lists.add(e2);
		lists.add(e3);
		lists.add(e4);
		lists.add(e5);
//		System.out.println(lists);
//		 List<Streamexample>list3= lists.stream().map(e-> {
//			if(e.getAge()>25) {
//				e.setSallary(e.getSallary() *1.10);
//			}
//			return e;
//		}).collect(Collectors.toList());
//		System.out.println(list3);
		
//		
//		filtring  with sallary stream api
		List<Streamexample> list4 =lists.stream().filter((e)->
		e.getSallary()>12000).
				collect(Collectors.toList());
		System.out.println(list4);
//		listing the emp with name;
		List<Streamexample> list5 =lists.stream().filter((e)->
		e.getName()=="abc").
				collect(Collectors.toList());
		System.out.println(list5);
		
		
		
	
		
		
		
	}

	

}
