package java8features;

interface addable{
	int addition(int a, int b);
}

class Addexaple implements addable{

	@Override
	public int addition(int a, int b) {
		// TODO Auto-generated method stub
		return (a+b);
	}
	
}
public class Passingparameter {
	public static void main(String[] args) {
//		copiller by deault take int 
//		addable add=(int a, int b)-> (a+b);
		addable add=(int a, int b)-> (a+b);
	int res=	add.addition(14, 14);
	System.out.println(res);
		
		
	}

}
