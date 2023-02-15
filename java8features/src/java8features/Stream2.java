package java8features;

import java.util.Comparator;
import java.util.stream.Stream;

public class Stream2 {
	public static void main(String[] args) {
//		now using of count , min,max method
		Stream<Integer> stream=Stream.of(10,2,3,4,5,6,7,8,9);
//	Integer integer=	stream.max(Comparator.comparing(Integer::valueOf)).get();
//		System.out.println("min"+integer);
//		
		Integer integer1=	stream.min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("min"+integer1);
	}

}
