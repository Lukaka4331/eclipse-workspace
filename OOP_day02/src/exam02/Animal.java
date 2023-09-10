package exam02;
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
	
	private String name;
	private int type;//每個數字對應到不同種類的動物
	
	//初始化 Constructor
	
	public Animal(String name, int type) {
		super();
		this.name = name;
		this.type = type;
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
