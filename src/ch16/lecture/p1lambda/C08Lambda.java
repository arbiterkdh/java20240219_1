package ch16.lecture.p1lambda;

public class C08Lambda {
    public static void main(String[] args) {
        C08MyInterface obj = () -> System.out.println("C08Lambda.main");
    }
}


@FunctionalInterface
interface C08MyInterface {
    void method();
}

@FunctionalInterface
interface C08MyInterface2 {
    int method();
}