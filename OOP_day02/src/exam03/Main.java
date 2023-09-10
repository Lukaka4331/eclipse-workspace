package exam03;

//import exam02.Animal;

//程式邏輯:
//每次聊天取得動物的種類 animal.getType() 
//判斷種類 Animal.DOG Animal.BIRD Animal.CAT
//並進行相對應的動作

//案例1:(不用多型(Polymorphism))
//有一群動物在聊天，但是他們都發出不同的聲音來溝通
//鳥會吱吱叫
//狗會汪汪叫
//貓會喵喵叫

//承接案例1:
//加需求
//再來要多加一隻樹懶
//還要多一隻狐狸

//問題1:
//每次新增新的物種的時候
//程式碼相對的地方就需要改寫

//改良方式:
//把switch case判斷搬到Animal類別裡面

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal[] animals = new Animal[] {new Animal("狗",Animal.DOG),new Animal("鳥",Animal.BIRD),new Animal("貓",Animal.CAT),new Animal("狐狸",Animal.FOX),new Animal("樹懶",Animal.SLOTH)};
		
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
			case Animal.FOX:
				System.out.println("狐狸叫");				
				break;
			case Animal.SLOTH:
				System.out.println("樹懶叫");				
				break;				
			default:
				break;
			}
		}
	}

}
