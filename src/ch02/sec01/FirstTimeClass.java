package ch02.sec01;

public class FirstTimeClass {
    String nation = "한국";
    String name;
    int age;

    public FirstTimeClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public FirstTimeClass(String name) {
        this.name = name;
    }

    public FirstTimeClass(int age) {
        this.age = age;
    }

}
