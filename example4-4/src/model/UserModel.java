package model;

public class UserModel {
    // field
    private int uniqueId = 0;
    private String name;
    private String userId;
    private String password;
    private String phoneNumber;
    private String email;
    private boolean memberCheck;

    // constructor
    public UserModel() {
    }

    public UserModel(String name, String userId, String password, String phoneNumber, String email) {
        this.name = name;
        this.userId = userId;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // getter, setter
    public int getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(int uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isMemberCheck() {
        return memberCheck;
    }

    public void setMemberCheck(boolean memberCheck) {
        this.memberCheck = memberCheck;
    }
}
