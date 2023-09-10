package exam01;
//Encapsulation 封裝
//不讓其他人隨意更改
//大大增加擴充性及維護性
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//銀行帳戶系統
		//instance(實體化)一個帳戶
		Account account = new Account();
		
		System.out.println("輸出帳戶原有的金額:"+account.getMoney());
		
		//public
		//System.out.println(account.money);
		//不讓使用者隨意宣告自己的錢有多少
		//account.money=15000;
		//System.out.println(account.money);
		
		//存款資訊
		//account.money += 200;
		//account.money += 200;		
		//account.money += 200;		
		//account.money += 200;
		//account.money += 200;		
		//account.money += 200;		
		//account.money += 200;
		//account.money += 200;		
		//account.money += 200;	

		//盜領資訊
		//account.money -= 500;

		//因為定義資料型態時設為public,導致依賴這個money變數
		//每次存取都是一行的指令、一行的時間、一行的步驟
		//所以它不能做多餘的事情
		//所以一開始寫成函數才方便新增功能修改
		
		//private
		//知道自己有多少錢
		//建立類別函數來達到需求		
		
		//存款=查款+200
		account.setMoney(account.getMoney()+200);
		//輸出帳戶存款後的金額
		System.out.println("輸出帳戶存款後的金額:"+account.getMoney());
	}

}
