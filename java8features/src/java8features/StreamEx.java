package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx {
	public static void main(String[] args) {
		List<Integer>list = Arrays.asList(1,2,3,3,4,7,8);
//		list.stream().forEach(val->System.out.println("list vla="+val));
//		printing the value which is greater than 3
//		list.stream().filter(val-> val>3).forEach(val->System.out.println("list vla="+val));
		
//		List<Integer>op=list.stream().map(x->x*x).collect(Collectors.toList());
//		System.out.println(op);
//		demostrate the for each method
		
//		distinct
//		list.stream().distinct().forEach(System.out::println);
		long  op4=list.stream().distinct().count();
		System.out.println(op4);
		
	}

}
