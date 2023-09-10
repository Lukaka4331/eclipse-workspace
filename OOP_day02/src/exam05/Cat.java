package exam05;

public class Cat extends Animal{

	public Cat(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void talk() {
		// TODO Auto-generated method stub
		System.out.println("喵喵");		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("喵喵");				
	}

	@Override
	public void mating(Animal animal) {
		// TODO Auto-generated method stub
		System.out.println("喵喵");				
	}
	
	//新增貓特有的函數scratch()
	
	public void scratch() {
		System.out.println("抓");	
	}
}
