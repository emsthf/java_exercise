package userManager;

import user.User;

public class UserManager {
    private static User[] users = new User[3];
    private static int index=0;

    public static int retryUserId(String userId) {
        for(int i=0; i < index; i++) {
            if(users[i].getUserId().equals(userId)) {
                return i;
            }
        }
    }

}
