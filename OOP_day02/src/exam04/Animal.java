package exam04;

//thinking
//-------------
//思考動物有甚麼屬性
//名字、種類

//eclipse 幫你寫好 
//--------------
//Constructor
//path:source->generate Constructor using fields

//getter and setter
//path:source->generate getter and setter

public class Animal {
	//為了提升維護性(不想去記說甚麼數字對應到甚麼動物)
	public static final int DOG = 0;
	public static final int BIRD = 1;
	public static final int CAT = 2;
	//---增加需求---
	//多加一隻樹懶
	//多加一隻狐狸
	public static final int FOX = 3;
	public static final int SLOTH = 4;	
	
	//屬性
	private String name;
	private int type;//每個數字對應到不同種類的動物
	
	//初始化 Constructor
	
	public Animal(String name, int type) {
		super();
		this.name = name;
		this.type = type;
	}
	
	//相對應的動作
	
	//新增新的function talk()
	//自己這個Animal類別 判斷甚麼動物種類 來發出不同的溝通方式
	public void talk() {
		switch (getType()) {
		
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
	//新增新的function eat()-覓食
	public void eat() {
		
	}
	
	//新增新的function mating(Animal animal)-繁衍
	//傳入交配對象另一個animal
	public void mating(Animal animal) {
		
	}
	
	
	//封裝(Encapsulation) getter and setter
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
	
	
	
	
	
	
	
}
