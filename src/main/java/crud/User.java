package crud;

public class User {

    private String loginId;
    private String nickname;
    private String name;
    private String password;


    public User(String loginId, String nickname, String name, String password) {
        this.loginId = loginId;
        this.nickname = nickname;
        this.name = name;
        this.password = password;
    }

    public String getLoginId() {
        return loginId;
    }

    public String getNickname() {
        return nickname;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}
