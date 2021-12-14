package viewer;

import controller.CreateUser;
import controller.EntryUser;
import controller.SetUserForm;
import repository.UserData;

public class SignUpImple implements SignUp {
    @Override
    public void welcomeMessage() {
        EntryUser.entry();
    }

    @Override
    public void inputInfo() {
        for(int i=0; i < UserData.MAX; i++) {
            SetUserForm.inputData();
        }
    }

    @Override
    public void signUp(String name, String userId, String password, String phoneNumber, String email) {
        UserData.userDataAdd(CreateUser.createUser(name, userId, password, phoneNumber, email), UserData.getCount());
    }

    @Override
    public void addUser() {

    }
}
