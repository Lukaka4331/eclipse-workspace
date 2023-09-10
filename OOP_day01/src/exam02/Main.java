package exam02;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ObjectList
		
        // Book book1 = new Book("Java Programing","josh",40);
        // System.out.println(book1.getTitle());
        // Scanner scn = new Scanner(System.in);
        // int n = scn.nextInt();
        // 
        // Book book[]=new Book[n];
        // for (int i=0;i<n;i++){
        //     book[i] = new Book(scn.next(), scn.next(), scn.nextInt());   
        // }
        // for(int i =0;i<n;i++){
        //     System.out.print(book[i].getTitle()+"\t");
        // }		
		
		//ArraryList
        Scanner scn = new Scanner(System.in);        
        ArrayList <Book>bookList = new ArrayList<Book>();
        String str="";
        
        while (true) {
            System.out.print("continue?-->");
            str=scn.nextLine();

            if (str.equals("N") || str.equals("n")){
                break;
            }
            else{
                bookList.add(new Book(scn.nextLine()));
            }
        }

        for(int i=0;i<bookList.size();i++){
            System.out.print(i+"'s"+bookList.get(i).getTitle()+"\t");
        }		
		
		
		
		
	}

}
