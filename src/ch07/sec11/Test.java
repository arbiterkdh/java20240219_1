package ch07.sec11;

public class Test {
    private int number;

    public Test(int number) {
        this.number = number;
        System.out.println(number + " 숫자확인");
    }

    public void test(TestChild testChild) {
        testChild.doSomething(testChild.name);
    }
}
