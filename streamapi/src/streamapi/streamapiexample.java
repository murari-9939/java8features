package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class streamapiexample {
	 
	 public static void main(String[] args) {
		   // Adding Products
		  List < product1 > productsList = new ArrayList < product1 > ();
	        productsList.add(new product1(1, "HP Laptop", 25000f));
	        productsList.add(new product1(2, "Dell Laptop", 30000f));
	        productsList.add(new product1(3, "Lenevo Laptop", 28000f));
	        productsList.add(new product1(4, "Sony Laptop", 28000f));
	        productsList.add(new product1(5, "Apple Laptop", 90000f));
//	        System.out.println(productsList);
	        // filtering data of list
	        List <Float > productPriceList = productsList.stream().filter((product1) -> product1.getPrice() > 25000)
	            .map((product1) -> product1.getPrice()).collect(Collectors.toList());
	        // displaying data
//	        productPriceList.forEach((price) -> System.out.println(price));
	        productsList.stream().filter(product1 -> product1.getPrice() == 30000)
            .forEach(product1 -> System.out.println(product1.getPrice()));
	        // Using Collectors's method to sum the prices.  
	        double totalPrice3 = productsList.stream()
	            .collect(Collectors.summingDouble(product1 -> product1.getPrice()));
	        System.out.println(totalPrice3);
	        // max() method to get max Product price
	        product1 productA = productsList.stream()
	            .max((product1, product2) -> product1.getPrice() > product2.getPrice() ? 1 : -1).get();

	        System.out.println(productA.getPrice());
	        // min() method to get min Product price
	        product1 productB = productsList.stream()
	            .max((product1, product2) -> product1.getPrice() < product2.getPrice() ? 1 : -1).get();
	        System.out.println(productB.getPrice());
	       
	}
	 
	 
}
