package exam01;

public class Circle extends Shape{
	private int r;
	public Circle(String name,int r) {
		super(name);
		this.r=r;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		double area = r*r*Math.PI;
		return area;
	}



}
