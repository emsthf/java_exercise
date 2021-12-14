import controller.Start;
import start.GameStartImpl;
import start.GameStater;

public class Main {
    public static void main(String[] args) {
        System.out.println("게임 시작!");
        GameStater gs = new GameStartImpl();
        gs.startGame();

    }
}
