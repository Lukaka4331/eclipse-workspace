package exam05;

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

//定義Animal是抽象的概念
//用多型不需要屬性來記我們是甚麼種類
//定義動作
public abstract class Animal {

	
	//屬性
	//不需要型態(type)
	//用多型不需要屬性來記我們是甚麼種類
	private String name;
//	private int type;//每個數字對應到不同種類的動物
	
	//初始化 Constructor
	
	public Animal(String name) {
		this.name = name;
	}
	
	//定義動作
	//多型-抽象定義
	//這個Animal有甚麼屬性(不用寫清楚)
	//你是一隻動物你就必須有這些功能
	//新增新的function talk()
	public abstract void talk();
	//新增新的function eat()-覓食
	public abstract void eat();
	//新增新的function mating(Animal animal)-繁衍
	//傳入交配對象另一個animal
	public abstract void mating(Animal animal);
	
	//封裝(Encapsulation) getter and setter
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	
	
	
	
}
