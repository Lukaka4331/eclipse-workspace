package exam01;

public class Rectangle extends Shape{
	private int length;
	private int width;
	
	
	public Rectangle(String name,int length,int width) {
		super(name);
		this.length=length;
		this.width=width;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		double area = length*width ;
		return area;
	}

}
