package streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Streamlistsort {
	public static void main(String[] args) {
		List<String > list= new ArrayList<String>();
		list.add("banaba");
		list.add("Apple");
		list.add("mango");
		list.add("orange");
//		srot the list in asending order first we have to convert the list in stram obj
	List<String>sortedList=	list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
	System.out.println(sortedList);
//	using lambada expression
	List<String>sorted1=list.stream().sorted((o1, o2) ->o1.compareTo(o2)).
			collect(Collectors.toList());
	System.out.println(sorted1);
//	another method
	List<String>sorted2=list.stream().sorted().
			collect(Collectors.toList());
	System.out.println(sorted2);
	
//	sorting the list in decending order
//	only we have to change the  natural order to reverse order
	List<String>sortedList3=	list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	System.out.println(sortedList3);
//	in lambada expression we have to just swap the referemces of o1, o2
	List<String>sorted4=list.stream().sorted((o1, o2) ->o2.compareTo(o1)).
			collect(Collectors.toList());
	System.out.println(sorted4);
	
	
	}

}
