package java8features;
class Threaddemo implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run method called");
		
	}
	
}

public class Lambadaexpreesionrunnableinterface {
	public static void main(String[] args) {
		Thread thread = new Thread(new Threaddemo() );
		thread.start(); 
		Runnable runnable=()->System.out.println("run method called using lambada");
		Thread Threalambada = new Thread(runnable);
		Threalambada.start();
	}

}
