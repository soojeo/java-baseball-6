package baseball.controller;
import baseball.model.computerNumber;
import baseball.model.userNumber;
import baseball.view.inputNum;
public class baseball {
	private computerNumber computerNum;
	private userNumber userNum;
	public baseball() {
		computerNum = new computerNumber();
	}
	public void start() {
		while(true) {//3strike달성시까지 반복문 시행
			userNum = new userNumber(inputNum.inputUnumber());
			
		}
	}
	
}
