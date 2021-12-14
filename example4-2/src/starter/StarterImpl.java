package starter;

import userRepository.UserData;
import userRepository.UserRepository;
import userRepository.UserRepositoryImpl;

public class StarterImpl implements Starter {
    @Override
    public void callUser() {
        UserRepository ur = new UserRepositoryImpl();
        ur.userAdd();
        UserData uds = new UserData();
        System.out.println(uds.getUser(0).getName());
        System.out.println(uds.getUser(0).getUserId());
        System.out.println(uds.getUser(0).getPassword());
        System.out.println(uds.getUser(0).getPhoneNumber());
        System.out.println(uds.getUser(0).getEmail());
        System.out.println(uds.getUser(0).getMember());
    }
}
