package exam02;
//案例1:(不用多型(Polymorphism))
//有一群動物在聊天，但是他們都發出不同的聲音來溝通
//鳥會吱吱叫
//狗會汪汪叫
//貓會喵喵叫
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal[] animals = new Animal[] {new Animal("狗",Animal.DOG),new Animal("鳥",Animal.BIRD),new Animal("貓",Animal.CAT)};
		
		//for each 走訪
		//不同種類的動物會有不同的聊天方式
		
		for(Animal animal:animals) {
			System.out.println(animal.getName()+":");//哪隻動物要講話
			//甚麼動物種類 來發出不同的溝通方式
			
			switch (animal.getType()) {
			
			case Animal.DOG:
				System.out.println("汪汪叫");	
				break;
			case Animal.BIRD:
				System.out.println("吱吱叫");
				break;	
			case Animal.CAT:
				System.out.println("喵喵叫");				
				break;
			default:
				break;
			}
		}
	}

}
