package exam03;

import java.util.Scanner;
/*學習目標: 多型 繼承 ArrayList

--多型--

撰寫一個 Human 類別 代表人
	在這裡我們有兩個衍伸類別 Man 與 Woman
	他們用不同的規則活著：
	Man : 吃飯時 印出"好好吃" 睡覺時 印出"zzz"
	Woman: 吃飯時 印出"Orzz" 睡覺時 印出":)"
	
	(印出代表用System.our.println(...))

使用者會輸入一個字串 代表 男人與女人 的順序 ( b -> 男 g -> 女 大小寫皆可)
像是: bgGGBgb 代表 男人有3位 女人有4位 照這個順序排列 (左到右)

之後照著順序印出所有人 吃飯 及 睡覺 的情況
 * 
 */
public class Main {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person man = new Man();
		Person woman = new Woman();
		
		String str= scn.nextLine();
		int length = str.length();
		Person[]person = new Person[length];
		
		for(int i=0;i<length;i++) {
			//判斷字串裡的字元性別
			//toLowerCase() return 給定字符的小寫 or return 字符本身 (a->A , A) 
			//charAt()代表return這個字串裡面的資料的值是多少
			char gender = Character.toUpperCase(str.charAt(i));
			//只需判斷小寫,透過toLowerCase()作轉換
			if(gender == 'B') {
				person[i] = man;
			}
			else if(gender == 'G'){
				person[i] = woman;
			}
			
		}
		//先吃飯
		for(Person person_output:person) {
			person_output.eat();
		}
		//後睡覺
		for(Person person_output:person) {
			person_output.sleep();
		}		
		
		
	}

}
