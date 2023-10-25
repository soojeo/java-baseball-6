package baseball;
import baseball.controller.baseball;
import baseball.view.outDis;

public class Application {
    public static void main(String[] args) {
        outDis.startGame();
        while(true) {
        	baseball game = new baseball();
        	game.start();
        	if(regame())
        	{
        		continue;
        	}
        	else if(!regame())
        	{
        		break;
        	}
        }
    }
    public static boolean regame() {
    	return true;
    }
    
}
