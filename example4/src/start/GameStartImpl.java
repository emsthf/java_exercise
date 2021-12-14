package start;

import controller.HeroName;
import controller.Start;
import model.Model;

public class GameStartImpl implements GameStater {
    @Override
    public void startGame() {
        Start.starter();
    }

    @Override
    public void inputName(Model model, String select) {
        HeroName.heroName(model, select);
    }
}
