package modelRepository;

import controller.CreateCharacter;

public class ModelRepositoryImpl implements ModelReoisitory {
    @Override
    public void modelAdd() {
        ModelData mds = new ModelData();   // 모델데이터 객체 생성
        mds.modelDataAdd(CreateCharacter.createCharacter(), mds.getCount());
            // 모델데이터 객체(DB)의 modelDataAdd 메소드(데이터 추가)에 CreateCharacter의 createCharacter 메소드(단순히 모델캐릭터 객체를 생성하고 반환하는 메소드)와 모델데이터의 getCount 메소드를 준다
        System.out.println(mds.getModel(0).getName());  // 모델데이터 객체의 0번 모델의 이름을 출력
        mds.modelDataAdd(CreateCharacter.createCharacter(), mds.getCount());
        System.out.println(mds.getModel(1).getName());  // 모델데이터 객체의 1번 모델의 이름을 출력
    }

    @Override
    public void modelGetAll() {

    }
}
