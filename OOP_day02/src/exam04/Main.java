package exam04;

//import exam03.Animal;
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

//問題2:
//不只一個talk()聊天-需要判斷物種
//可能還有覓食()-需要判斷物種
//可能還有繁衍()-需要判斷物種
//這樣每個function都要用到switch case把它搬進去
//物種越來越多 判斷動物行為的function越來越多
//switch case程式結構非常醜 導致程式過於肥大

//三大致命問題:(導致bug發生)

//1.可讀性 Readability
//每個function()都有一個switch case,有幾個物種就有幾個case
//30個物種的話,就有90個case

//2.維護性 Maintainability
//新增功能過於複雜且繁瑣
//增加新的功能 
//屬性
//private String name;
//private int type;//每個數字對應到不同種類的動物
	//增加一個常數以外
	//還要記得這個function()對應的case
//所以不具直覺性
//不想要自己記得想要程式提醒我們

//3.擴充性 Expandability
//不修改既有程式碼的情況下(例:Animal這個類別)，還可以增加新功能
//寫好Animal類別給其他開發者做使用,想要增加新的物種做擴充時，還要進到Animal類別做新增，顯然很不合理
//自己寫的類別也不希望其他人去做修改
//通常會把自己的類別包程jar檔(java ARchive)給其他開發者=>類別庫(Library)封裝起來不給做更改
//需要有擴充的機制
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal[] animals = new Animal[] {new Animal("狗",Animal.DOG),new Animal("鳥",Animal.BIRD),new Animal("貓",Animal.CAT),new Animal("狐狸",Animal.FOX),new Animal("樹懶",Animal.SLOTH)};
		
		//for each 走訪
		//不同種類的動物會有不同的聊天方式
		
		for(Animal animal:animals) {
			System.out.println(animal.getName()+":");//哪隻動物要講話
			//呼叫talk()判斷甚麼動物種類 來發出不同的溝通方式
			//很直覺的印出動物名字然後叫它講話
			animal.talk();

		}
	}

}
