package exam01;
import java.util.Random;
public class EvenAI extends AI{

	@Override
	protected String getPlayerType() {
		// TODO Auto-generated method stub
		return "偶數AI";
	}

	@Override
	protected int guess(int min, int max) {
		// TODO Auto-generated method stub
		int rand;
		if(max==min)
			return max;
		do
		{
			rand= new Random().nextInt(max-min)+min;
			
		}while(rand%2!=0 || rand<min || rand>max);
		
		return rand;
	}

}
