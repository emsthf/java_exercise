package fight;

import controller.SetFight;
import model.Model;

public class FightImpl implements Fight {
    @Override
    public void startFight(Model m, String select) {
        SetFight.setFight(m, select);
    }

    @Override
    public void getItem() {

    }
}
