package exam01;

public abstract class Shape {
	private String name;

	public Shape(String name) {
		super();
		this.name = name;
	}

	public abstract double computeArea();
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
