package userRepository;

import controller.CreateUser;
import controller.SignUp;
import user.User;

public class UserRepositoryImpl implements UserRepository {

    @Override
    public void setUser() {

    }

    @Override
    public void getUser() {
        UserRepository ur = new UserRepositoryImpl();
        ur.userAdd();
        UserData uds = new UserData();
        System.out.println("유저 이름 : " + uds.getUser(0).getName());
        System.out.println("ID : " + uds.getUser(0).getUserId());
        System.out.println("패스워드 : " + uds.getUser(0).getPassword());
        System.out.println("전화번호 : " + uds.getUser(0).getPhoneNumber());
        System.out.println("이메일 : " + uds.getUser(0).getEmail());
        System.out.println("회원타입 : " + uds.getUser(0).getMember());
    }

    @Override
    public void userAdd() {  // 유저 추가
        UserData uds = new UserData();  // 유저데이터(DB) 객체 생성
        uds.userDataAdd(CreateUser.createUser(), uds.getCount());

    }
}
