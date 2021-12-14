package create;

import controller.CreateModel;
import model.Model;

public class StartGameImpl implements StartGame {
    @Override
    public void createCharactor() {  // 모델이 만들어지는 역할을 하는 메소드
        Model model = CreateModel.createModel("1");
        model.attack();
    }

    @Override
    public void gameStart() {

    }
}
