package exam01;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		String shape_type="";
		int r;
		int length;
		int width;
		int triangle_a;
		int triangle_b;
		int triangle_c;
		//---------------------------------------
		ArrayList <Shape>shapesList = new ArrayList<Shape>();
       	
		System.out.println("輸入要計算何種形狀的面積:");
    	shape_type = scn.next();
		switch (shape_type) {
		case "圓形":
			System.out.println("輸入圓半徑:");
			r = scn.nextInt();
			Circle circles = new Circle("circle", r);
			System.out.println("圓面積:"+circles.computeArea());
			shapesList.add(new Circle("圓形", r));
			break;
		case "矩形":
			System.out.println("輸入長、寬:");
			System.out.println("輸入長:");
			length = scn.nextInt();
			System.out.println("輸入寬:");
			width = scn.nextInt();
			Rectangle rectangle = new Rectangle("矩形",length,width);
			System.out.println("矩形面積:"+rectangle.computeArea());
			shapesList.add(new Rectangle("矩形",length,width));
			break;
		case "三角形":
			System.out.println("輸入三個角的長度:");
			System.out.println("輸入a:");
			triangle_a = scn.nextInt();
			System.out.println("輸入b:");
			triangle_b = scn.nextInt();
			System.out.println("輸入c:");
			triangle_c = scn.nextInt();

			Triangle triangle = new Triangle("三角形",triangle_a,triangle_b,triangle_c);
			System.out.println("三角形面積:"+triangle.computeArea());
			shapesList.add(new Triangle("三角形",triangle_a,triangle_b,triangle_c));
			break;			
		default:
			break;
			}            	
            
        for(int i=0;i<shapesList.size();i++){
            System.out.print(i+"'s shape:"+shapesList.get(i).getName()+"\t");
            System.out.println(shapesList.get(i).getName()+"面積"+shapesList.get(i).computeArea()+"\t");
        }		
		
        
	        
	}

}
