package exam05;
//狗是一隻Animal
//繼承就是 is a
//Dog is a Animal
//繼承Animal就必須實做剛剛的抽象函數
//我不要自己記得我要系統來提醒我
public class Dog extends Animal{

	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void talk() {
		// TODO Auto-generated method stub
		System.out.println("汪汪");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("汪汪");
	}

	@Override
	public void mating(Animal animal) {
		// TODO Auto-generated method stub
		System.out.println("汪汪");
	}
	
}
