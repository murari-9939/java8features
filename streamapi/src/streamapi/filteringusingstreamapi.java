package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class product{
	private int id;
	private String name;
	private float price;
	
	public product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "product [id=" + id + ", name=" + name + ", price=" + price + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getPrice()=" + getPrice() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	} 
	
}
public class filteringusingstreamapi {
	public static void main(String[] args) {
//		filtering whose price is greater than 25000;
		List <product1>list=new ArrayList<product1>();
		for(product1 pro:getProducts()) {
			if(pro.getPrice()>25000f) {
				list.add(pro);
			}
			
		}
		for(product1 pro:list) {
			System.out.println(pro);
		}
//		using stram api
		
	List<product1>list2=	getProducts().stream().filter((pro)->pro.getPrice()>25000f).
		collect(Collectors.toList());
	list.forEach(System.out::println);
		
	}
	private static List<product1> getProducts(){
		List<product1> productlist=new ArrayList<product1>();
		productlist.add(new product1(1,"hp laptop",25000f));
		productlist.add(new product1(2,"dell laptop",3000f));
		productlist.add(new product1(3,"lenvo laptop",28000f));
		productlist.add(new product1(4,"sony laptop",28000f));
		productlist.add(new product1(5,"sony laptop",90000f));
		return productlist;
	}

}
