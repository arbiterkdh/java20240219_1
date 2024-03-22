package ch17.sec14.problem08;

public class Member {
    private String name;
    private String job;

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public Member(String name, String job) {
        this.name = name;
        this.job = job;
    }
}
