package user;

public class User {
    // 필드
//    private int uniqueId;
    private String name;
    private String userId;
    private String password;
    private String phoneNumber;
    private String email;
    private Boolean member;

    // 생성자
    public User() {
        System.out.println("유저가 등록되었습니다.");
        this.name = "홍길동";
        this.userId = "abcd";
        this.password = "1234";
        this.phoneNumber = "010-1234-5678";
        this.email = "asdf@gmail.com";
        this.member = true;
    }

    public User(String name, String userId, String password, String phoneNumber, String email) {
        this.name = name;
        this.userId = userId;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // 게터세터
//    public int getUniqueId() {
//        return uniqueId;
//    }

//    public void setUniqueId(int uniqueId) {
//        this.uniqueId = uniqueId;
//    }

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

    public Boolean getMember() {
        return member;
    }

    public void setMember(Boolean member) {
        this.member = member;
    }
}
