package exam05;

//多型寫法(Polymorphism)
//同一種生物底下可以有不同型態
//定義一個抽象的概念(Abstract)Animal/代表一種物種的存在
//定義好抽象的概念(Abstract)之後,才去衍伸出具體的型態
//狗是一隻動物,貓是一隻動物
//動物是父類別
//狗跟貓是子類別
//狗跟貓因為繼承了動物，所以也擁有了動物的特性

//Refactoring(重構)

//可讀性&維護性

//新增物種Fox

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//新增一隻貓和一隻狗
		//陣列裡面是一群動物
		
		//用甚麼角度去看非常重要

		//用動物的角度來去看待他們
		//Animal[]animals = new Animal[] {new Cat("喵1"),new Dog("狗1")};  
		
		//新增物種Fox
		Animal[]animals = new Animal[] {new Cat("喵1"),new Dog("狗1"),new Fox("狐狸1")};  
		
		//用貓的角度去看
		//Semi_Cobby(美國短尾貓)
		//這樣就能找到貓特有的函數scratch()
		//宣告貓的陣列
		Cat[] cats= new Cat[] {new Cat("美國短尾貓")};
		for(Cat cat:cats) {
			System.out.print(cat.getName()+":");
			cat.scratch();
		}
		//for each 走訪
		//不同種類的動物會有不同的聊天方式
		
		//用動物的角度來去看待這個陣列的每個元素
		//這個陣列裡面可能有狗、貓不同的元素
		//宣告Animal陣列所以只能以Animal去看待每個元素
		for(Animal animal:animals) {
			System.out.print(animal.getName()+":");//哪隻動物要講話
			//呼叫talk()判斷甚麼動物種類 來發出不同的溝通方式
			//很直覺的印出動物名字然後叫它講話
			animal.talk();
			//新增貓特有的函數scratch()
			//用動物的角度去看是找不到這個函數的
			
			
		}
	}

}