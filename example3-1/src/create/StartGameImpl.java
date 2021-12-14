package create;

import controller.Meeting;
import controller.Starter;

public class StartGameImpl implements StartGame {
    @Override
    public void gameStart() {
        Starter.start();
    }

    @Override
    public void meetingMob() {
        Meeting.meeting();
    }
}
