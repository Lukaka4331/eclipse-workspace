package exam01;
//補全代碼:Alt+/
//OOP 
//Class and Object 類別跟物件
//Abstraction 萃取
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//class and object
		//定義資料型態
		//例:學生資訊系統
//		int weight;
//		int height;
//		String id;
//		int grades;
//		String sex;
		//因為這樣定義變數太過繁瑣且麻煩
		//把他們綁在一起成為一個新的資料型態
		//宣告方式跟
		//宣告Student給他變數名稱
		int a = 10;//整數給初始值
		Student student;//object就是變數
		//所有的物件剛被宣告的時候，如果沒有給初始值的話->null
		//new 這個運算值->幫我們開一個記憶體空間,這個記憶體空間是為Student特製化的
		//回傳的型態就是new後面所寫的資料型態
		Student ming = new Student(); //null->instance 實體化
		Student mei = new Student();
	}

}
