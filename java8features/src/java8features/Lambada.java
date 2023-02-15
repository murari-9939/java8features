package java8features;
interface shape{
	void draw();
}
	 class Rectangle implements shape{

		@Override
		public void draw() {
			// TODO Auto-generated method stub
			System.out.println("rectangle class");
		}
		
	}
	 class square implements shape{

		@Override
		public void draw() {
			// TODO Auto-generated method stub
			System.out.println("square class");
		}
		 
	 }
	 class circle implements shape{

		@Override
		public void draw() {
			// TODO Auto-generated method stub
			System.out.println("cicle class");
		}
		 
	 }
public class Lambada {
	public static void main(String[] args) {
//		how to create lambada expression basically first take method
//
//		@Override
//		public void draw() {
//			// TODO Auto-generated method stub
//			System.out.println("rectangle class");
//		}
//		we have to take reference variable of functional interface in this case we shape is our
//		reference shape  rectagle = shape rectangle=()-> 
//		
//		System.out.println("rectangle class");
//		rectangle.draw();
//		we have remove public and retrun type like this
		
		
	shape rectangle=()-> 
			
			System.out.println("rectangle class");
//			rectangle.draw();
			
//			lambada expreesion for another class same way we can create for another class
			
			shape square =()->System.out.println("square class");
			square.draw();
//			
//	now we will see that lambada expression as a method parameter
//			print(rectangle); same way you can use for another class
//			or we can also write like this
//			print(()->System.out.println("square class"));
//	  private static void Print(Shape shape) {
//		shape.draw();
//	}
	
	       
	}
	

}
