package exam03;
//Woman: 吃飯時 印出"Orzz" 睡覺時 印出":)"	

public class Woman extends Person{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Orzz");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println(":)");
	}

}
