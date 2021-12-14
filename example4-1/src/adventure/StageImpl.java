package adventure;

import endGame.EndGame;
import modelRepository.ModelData;

public class StageImpl implements Stage, EndGame {
    @Override
    public void endGame() {

    }

    @Override
    public void goAdventure() {
        ModelData mds = new ModelData();  // 모델데이터 객체(DB)를 만들고
        mds.getModel(1).setName("스파이더맨");  // DB의 1번 모델의 이름을 "스파이더맨"으로 저장
        System.out.println(mds.getModel(1).getName());  // DB의 1번 모델의 이름을 출력
    }

    @Override
    public void nextStage() {

    }

    @Override
    public void restart() {

    }
}
