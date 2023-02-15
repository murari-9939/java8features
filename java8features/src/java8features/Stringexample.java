package java8features;

public class Stringexample {
	public static void main(String[] args) {
//		 this will  be created in string pool
		String str1 ="Abc";
		String str2 ="Abc";
//		this will be created in the heap because we are created new object
		 String  str3 =new String("Abc");
//		 System.out.println(str1==str2); this will be return true because both object is same
		

//output will be False because both refrences are different one is creted in string pool
//		 and other is creted in heap
		 
//	System.out.println(str1== str3);
//		 output will be true because eqal to method check for cotents
//		 System.out.println(str1.equals(str3));
		 String  str4 =new String("abc");
		 System.out.println(str1.equals(str4)); 
//		output will be false because both the content is different 
		 
		 System.out.println(str1.equalsIgnoreCase(str4)); 
//		 output will be true   
		 
		 
		 
	}

}
