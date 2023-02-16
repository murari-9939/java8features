package streamapi;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class createstreamobject {
public static void main(String[] args) {
//	create a stream
	Stream<String> st=Stream.of("a","b","c");
//	displaying the output WITH METHOD REFERENCE
//	st.forEach(System.out::println);
//	
//	another way to displY THE OUTPUT WITH LAMbada expression
	
	st.forEach(p->System.out.println(p + " "));
	
	
//	create  a stream from sources and asls called it stram of collection
	Collection<String> collection=Arrays.asList("a","b","c");
	Stream<String>streamofcollection=collection.stream();
	streamofcollection.forEach(p->System.out.println(p + " "));
	
//	stream object rom aaray
	String[] setArray = {"a","b","c"};
	Stream<String> streams=Arrays.stream( setArray);
	streams.forEach(p->System.out.println(p + " "));
	
	
	
}
	

}
