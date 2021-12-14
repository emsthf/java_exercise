import adventure.Stage;
import adventure.StageImpl;
import gameStarter.GameStarter;
import gameStarter.GameStarterImpl;

public class Main {
    public static void main(String[] args) {
        GameStarter gs = new GameStarterImpl();
        gs.gameStarter();
        System.out.println();

        gs.createCharacter();
        System.out.println();

        Stage st = new StageImpl();
        st.goAdventure();
    }
}
