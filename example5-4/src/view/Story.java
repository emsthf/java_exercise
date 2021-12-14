package view;

public interface Story {
    String selectStage(String name);
    void battle(String name, String mobName);
    void endGame();
}
