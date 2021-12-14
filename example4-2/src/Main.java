import starter.Starter;
import starter.StarterImpl;
import userRepository.UserRepository;
import userRepository.UserRepositoryImpl;

public class Main {
    public static void main(String[] args) {
        Starter st = new StarterImpl();
        UserRepository ur = new UserRepositoryImpl();
//        st.callUser();
        ur.getUser();
    }
}
