package ch07.sec11;

public class TestChild extends Test {

    public String name;

    public TestChild(int number) {
        super(number);
    }

    public void doSomething(String name) {
        System.out.println(name + " 이름확인");
    }
}
