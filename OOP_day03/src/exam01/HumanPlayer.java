package exam01;
public class HumanPlayer extends Player{
	//人類打鍵盤輸入數字來猜
	@Override
	protected String nameSelf() {
		// TODO Auto-generated method stub
		return Input.next("請輸入名稱");		
	}

	@Override
	protected String getPlayerType() {
		// TODO Auto-generated method stub
		return "玩家";
	}

	@Override
	protected int guess(int min, int max) {
		// TODO Auto-generated method stub
		return Input.nextInt(min,max);
	}

}
