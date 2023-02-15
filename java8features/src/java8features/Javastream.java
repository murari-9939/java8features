package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Javastream {
	public static void main(String[] args) {
//		use of findfirst and findAny method
		List<Integer>list = Arrays.asList(1,2,3,4);
		Optional<Integer>element=list.stream().findFirst();
		if(element.isPresent()) {
			System.out.println(element.get());
		}
		else {
			System.out.println("stream is empty");
		}
		
		Optional<Integer>element1=list.stream().findFirst();
		if(element1.isPresent()) {
			System.out.println(element.get());
		}
		else {
			System.out.println("stream is empty");
		}
		
//		now using of count , min,max method
		System.out.println(list.contains(5));
//		System.out.println(list.remove(5));
	}

}
