package ch07.sec11;

public class TestExample {
    public static void main(String[] args) {
        Test test = new TestChild(10);
        TestChild test2 = new TestChild(30);
        test2.doSomething("홍길동");

        test.test(test2);
    }
}
