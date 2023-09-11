package exam01;
/*  @@@*
 * 	@@***
 *  @*****
 *  *******  
 *     1
 *    121
 *   12321 
 *  1234321
 * */
import java.util.Scanner;
public class Main {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = scn.nextInt();
		
		//輸出星號正三角形
		//  @@@*
		//  @@***
		//  @*****
		//  *******  
		//第一個for loop輸出有幾行
		for(int i=1;i<=n;i++) {
			//第二個for loop輸出空白
			for(int j=1;j<=n-i;j++) {
				//測試有無印出
				//System.out.print("@");
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}		
		
		//輸出數字正三角形
		//  @@@1
		//  @@121
		//  @12321
		//  1234321 
		//第一個for loop輸出有幾行
		for(int i=1;i<=n;i++) {
			//第二個for loop輸出空白
			for(int j=1;j<=n-i;j++) {
				//測試有無印出
//				System.out.print("@");
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(k);
			}
			for(int m=1;m<i;m++) {
				int m_x=i-m;
				System.out.print(m_x);
			}
			
			System.out.println();
		}		
		
	}
	

}

