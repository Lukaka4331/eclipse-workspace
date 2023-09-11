package exam02;

public class Student {
	private int height;
	private int weight;
	private int score;
	private String id;
	public Student(int height, int weight, int score, String id) {
		super();
		this.height = height;
		this.weight = weight;
		this.score = score;
		this.id = id;
	}
	public int getScore() {
		return score;
	}

	//path:source->generate Override/implement Method 裡面有常用的method
	@Override
	public String toString() {
		// TODO Auto-generated method stub
        return "Student{" +
        "height=" + height +
        ", weight=" + weight +
        ", grades=" + score +
        ", id='" + id + '\'' +
        '}';
	}


	
	
	
}
