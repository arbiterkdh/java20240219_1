package ch07.sec09;

public class Student2 extends Person2 {
    public int studentNo;

    public Student2(String name, int studentNo) {
        super(name);
        this.studentNo = studentNo;
    }

    public void study() {
        System.out.println("공부를 합니다.");
    }
}
