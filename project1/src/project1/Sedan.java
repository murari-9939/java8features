package project1;

public class Sedan extends Carservices {

	private  static final int BSO1=1;
	private  static final int EFO1 = 2;
	private static final int CFO1 = 3;
	private  static final int BFO1 = 4;
	private static final  int GF01 = 5;

	@Override
	public int Basicservices() {
		// TODO Auto-generated method stub
		System.out.println("types of car:"+"sedan"+" "+" cahrge For basic service:");
		return 4000 ;
	}

	@Override
	public int enginefixing() {
	
		// TODO Auto-generated method stub
		return 8000;
	}

	@Override
	public int clutchfixing() {
		// TODO Auto-generated method stub
		return 4000;
	}

	@Override
	public int brakefixing() {
		// TODO Auto-generated method stub
		return 1500;
	}

	@Override
	public int gearfixing() {
		// TODO Auto-generated method stub
		return 6000;
	}

	@Override
	public int docleaning() {
		// TODO Auto-generated method stub
		return 0;
	}



	
	
	}
	
	

