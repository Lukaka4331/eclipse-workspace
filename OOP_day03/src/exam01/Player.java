package exam01;
//每一個玩家都要有名字name
public abstract class Player {
	private String name;

	public Player() {
		name = nameSelf();
	}
	
	protected abstract String nameSelf();//為自己命名
	protected abstract String getPlayerType();//你是人類還是AI
	protected abstract int guess(int min,int max);//猜數字函數:傳入最大最小值

	public String getName() {
		return "(" + getPlayerType() + ":" + name + ")";
	}



	
	
	
	
}
