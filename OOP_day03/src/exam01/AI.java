package exam01;

public abstract class AI extends Player{
	public AI() {
		// TODO Auto-generated constructor stub
		amount++;
	}

	private static int amount=0;
	
//	public AI() {
//		// TODO Auto-generated constructor stub
//		amount++;
//	}
	

	@Override
	protected String nameSelf() {
		// TODO Auto-generated method stub
		return "AI"+String.valueOf(amount++);
	}



}
