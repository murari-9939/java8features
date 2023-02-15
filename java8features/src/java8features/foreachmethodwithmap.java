package java8features;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class foreachmethodwithmap {
	public static void main(String[] args) {
//		for each method with map
		Map<Integer, Person>map=new HashMap<Integer,Person>();
		map.put(1, new Person("ramesh",29));
		map.put(2, new Person("tony",32));
		map.put(3, new Person("tom",35));
//		use for each loop
//		for(Entry<Integer, Person>enter:map.entrySet()) {
//			System.out.println(enter.getKey());
//			System.out.println(enter.getValue().getName());
//	}
//			use for each method
			map.forEach((k,v)->{
				System.out.println(k);
				System.out.println(v.getName());
			});
			
			
		}
	}


