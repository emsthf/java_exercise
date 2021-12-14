import model.Mob;
import view.Starter;
import view.StarterImpl;
import view.Story;
import view.StoryImpl;

public class Main {
    public static void main(String[] args) {
        Starter st = new StarterImpl();
        st.starter();
        st.charSelector();
        Story story = new StoryImpl();
        for (int i = 0; i < 10; i++) {
            story.battle();
        }

    }
}
