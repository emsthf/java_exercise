import model.ModelCharacter;
import view.Starter;
import view.StarterImpl;
import view.Story;
import view.StoryImpl;

public class Main {
    public static void main(String[] args) {
        Starter starter = new StarterImpl();
        String name = starter.starter();   // String name을 리턴
        Story story = new StoryImpl();
        String mobName = story.selectStage(name);
        story.battle(name, mobName);
    }
}
