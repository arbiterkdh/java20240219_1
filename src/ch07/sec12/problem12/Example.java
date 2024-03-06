package ch07.sec12.problem12;

public class Example {
    public static void action(A a) {
        if (a instanceof C c) {
            c.method2();
        }

    }

    public static void main(String[] args) {
        action(new A());
        action(new B());
        action(new C());

    }
}
