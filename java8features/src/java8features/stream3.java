package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class stream3 {
	public static void main(String[] args) {
		List<String>list=Arrays.asList("java", "sql","pyrhon","p");
//		coutn the  number of string start with  "j"
//	long count=	list.stream().filter(x->x.startsWith("j")).count();
//		System.out.println(count);
//		count the empty string more that 3
//		long count=	list.stream().filter(x->x.length()>3).count();
//		System.out.println(count);
		
//		demomstrate the filter method
//		List <String>op =list.stream().filter(s->s.startsWith("j")).collect(Collectors.toList());
//		System.out.println(op);
//		demostrate the sorted method
		List<String>op1=list.stream().sorted().collect(Collectors.toList());
		System.out.println(op1);
		   
		List<String>list1=Arrays.asList("java", "","sql","pyrhon","p");
//		couting empty string
		long cp=list1.stream().filter(x->x.isEmpty()).count();
		System.out.println(cp);
//		counting number of string starts with a
		long cp1=list.stream().filter(x->x.startsWith("a")).count();
		System.out.println(cp1);
//	conveting string with upercase
		List<String>cp2=list1.stream().map(x->x.toUpperCase()).collect(Collectors.toList());
		System.out.println(cp2);
	}

}
