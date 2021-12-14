package userRepository;

import user.User;

public class UserData {
    // DB로 쓰일 클래스

    // 필드
    private static User[] userDatas = new User[3];  // 유저의 배열을 생성
    private static int count = 1;  // 카운트 초기값은 1

    // 생성자

    public UserData() {
    }

    // 메소드
    public void userDataAdd(User user, int count) {  // 배열에 유저를 추가하는 메소드
        this.userDatas[count-1] = user;
        setCount(count+1);
    }

    // 게터세터
    public User getUser(int num) {  // n번째 배열에 들어있는 유저를 가져오는 게터
        return userDatas[num];
    }

    public User[] getUserDatas() {
        return userDatas;
    }

    public void setUserDatas(User[] userDatas) {
        UserData.userDatas = userDatas;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        UserData.count = count;
    }
}
