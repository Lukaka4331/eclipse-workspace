package exam01;

public class Triangle extends Shape{
	private int a;
	private int b;
	private int c;
	private int s;
	public Triangle(String name,int a,int b,int c) {
		super(name);
		this.a = a;
		this.b = b;
		this.c = c;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		//海龍公式
		s = (a+b+c)/2;
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		return area;
	}

}
