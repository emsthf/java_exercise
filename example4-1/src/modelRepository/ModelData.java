package modelRepository;

import model.ModelCharacter;

public class ModelData {
    // 아직 DB와 연동하지 않아서 DB의 역할을 대신할 클래스. 모델캐릭터들을 저장한다. 최대 100개

    // 필드
    private static ModelCharacter[] modelDatas = new ModelCharacter[100];   // 모델캐릭터() 배열 100개를 선언
    private static int count = 1;

    // 생성자
    public ModelData() {
    }

    // 메소드
    public void modelDataAdd(ModelCharacter model, int count) {
        this.modelDatas[count-1] = model;  // 모델데이터스 배열[카운트-1]번째에 모델캐릭터 저장
        setCount(count+1);  // 카운트 1 증가
    }

    // 게터세터
    public ModelCharacter getModel(int num) {
        return modelDatas[num];
    }

    public ModelCharacter[] getModelDatas() {
        return this.modelDatas;
    }


    public void setModelDatas(ModelCharacter[] modelDatas) {
        ModelData.modelDatas = modelDatas;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        ModelData.count = count;
    }
}
