package exam01;
/*案例二:玩終極密碼遊戲
 * 說明:玩家跟AI猜數字
 * 	   AI分成兩種 偶數AI 跟 奇數AI
 * 	   玩家及AI們較勁 看誰先猜到		
 * 		1~100 1~50
 * */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		GuessGame game = new GuessGame();
		List<Player> players = createPlayers();
		
		System.out.println("順序為 : ");
		for ( Player p : players )
			System.out.print(p.getName());
		System.out.println();
		
		game.createAnswer();
		int turn = 0;
		
		do  
		{
			Player player = players.get(turn);
			System.out.println(game.getMin() + "~" + game.getMax());
			int guess = player.guess(game.getMin(), game.getMax());
			System.out.println(player.getName() + " 猜了" + guess);
			boolean win = game.guess(guess);
			if (win)
				System.out.println(player.getName() + "猜對了 !");
			turn = turn + 1 >= players.size() ? 0 : turn + 1;
			delay();
		}while(!game.isOver());

	}
	
	private static List<Player> createPlayers(){
		List<Player> players = new ArrayList<Player>();
		int human = Input.nextInt("輸入幾位現實玩家：");
		int odd = Input.nextInt("輸入幾位奇數型電腦玩家: ");
		int even = Input.nextInt("輸入幾位偶數型電腦玩家: ");
		for ( int i = 0 ; i < human; i ++ )
			players.add(new HumanPlayer());
		for ( int i = 0 ; i < odd; i ++ )
			players.add(new OddAI());
		for ( int i = 0 ; i < even; i ++ )
			players.add(new EvenAI());
		
		Collections.shuffle(players);
		
		return players;
	}
	
	private static void delay(){
		try {
			Thread.sleep(800);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
