package exam01;
import java.util.Random;

public class OddAI extends AI{
	
	@Override
	protected String getPlayerType() {
		// TODO Auto-generated method stub
		return "奇數AI";
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
			
		}while(rand%2!=1 || rand<min || rand>max);//retain odd and bounded
		
		return rand;
	}
}
