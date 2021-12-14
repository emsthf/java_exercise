package repository;

import model.UserModel;

public class UserData {   // DB를 대신할 클래스
    // field
    private static int count = 1;   // 저장된 갯수 카운트 용도
    public static final int MAX = 3;   // 최대 배열의 길이. 정식 DB를 사용하지 않아서 탄력적인 배열을 적용하기 어려움
    private static UserModel[] userDatas = new UserModel[MAX];   // MAX 만큼의 UserModel 배열을 생성

    // method
    public static void userDataAdd(UserModel user, int count) {   // Usermodel과 count를 받아 배열에 유저를 추가하는 메소드
        userDatas[count-1] = user;   // n-1번째 UserModel 배열에 입력받은 UserModel 데이터를 넣는다
        setCount(count+1);   // 그리고 count를 1 증가시켜 저장한다
    }

    public static UserModel getUser(int num) {   // 숫자를 입력받으면 해당 UserModel 배열의 내용을 반환
        return userDatas[num];
    }

    // getter, setter
    public static UserModel[] getUserDatas() {
        return userDatas;
    }

    public static void setUserDatas(UserModel[] userDatas) {
        UserData.userDatas = userDatas;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        UserData.count = count;
    }
}
