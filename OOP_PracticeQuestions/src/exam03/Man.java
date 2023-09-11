package exam03;
//Man : 吃飯時 印出"好好吃" 睡覺時 印出"zzz"

public class Man extends Person{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("好好吃");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("zzz");
		
	}

}
