package exam01;
//銀行帳戶系統
//增加需求:當每一次對帳戶做提款取款，就計算一次，算總共有多少次
//預防以後會有新需求，以利不用重寫程式碼
//getter and setter
//eclipse 幫你寫好 
//path:source->generate getter and setter
public class Account {
	//public 公開 private 私有
//	public int money = 1000;
//	public int count = 0;
	//private : 這個類別以外的部分沒有權限存取
	private int money = 1000;
	private int count = 0;
	
	
	//拿錢(取款)
	public int getMoney() {
//		count++;//新需求:當每一次對帳戶做提款取款，就計算一次，算總共有多少次
//		System.out.println(count);//新需求:顯示帳戶的金額
		return money;
	}
	//存錢(存款)
	public void setMoney(int money) {
		this.money = money;
//		count++;//新需求:當每一次對帳戶做提款取款，就計算一次，算總共有多少次
	}
	
	


	
	
	
}
