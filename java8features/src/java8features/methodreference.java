package java8features;

import java.util.function.BiFunction;
import java.util.function.Function;

public class methodreference {
	public static int add(int a, int b) {
		return (a+b);
		
	}
	public static void main(String[] args) {
//		method reference to a static method
		Function<Integer,Double> fun=(input)->Math.sqrt(input);
				System.out.println(fun.apply(4));
				
//				lambada expression using method reference
				Function<Integer,Double> fun1=Math::sqrt;
				System.out.println(fun.apply(4));
				
//				lambada expression 
				BiFunction<Integer, Integer, Integer >bifunf=(a,b)->methodreference.add(a,b);
				System.out.println(	bifunf.apply(10, 20));
	}
	

}
