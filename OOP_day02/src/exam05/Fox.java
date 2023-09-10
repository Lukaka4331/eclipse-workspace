package exam05;
//新增物種Fox
//系統會提醒你實作
//實作talk(),eat(),mating(Animal animal)
public class Fox extends Animal{

	public Fox(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void talk() {
		// TODO Auto-generated method stub
		System.out.println("狐狸叫");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("狐狸叫");		
	}

	@Override
	public void mating(Animal animal) {
		// TODO Auto-generated method stub
		System.out.println("狐狸叫");		
	}

}
