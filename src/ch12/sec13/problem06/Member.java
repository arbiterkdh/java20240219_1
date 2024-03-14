package ch12.sec13.problem06;

public class Member {
    private String id;
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }


    @Override
    public String toString() {
        return id + ": " + name;
    }
}
