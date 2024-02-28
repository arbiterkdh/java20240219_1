package ch02.sec01;

public class MemberService {
    String id;
    String password;

    public boolean login(String id, String password) {
        this.id = id;
        this.password = password;
        return id.equals("hong") && password.equals("12345");
    }

    public void logout(String id) {
        this.id = id;
        System.out.println(id + "님이 로그아웃 되었습니다.");
    }
}
