package ch16.lecture.p1lambda;

public class C09Lambda {
    public static void main(String[] args) {
        C09MyInterface obj1 = () -> {
            System.out.println("C09Lambda.main");
            return 0;
        };
        C09MyInterface obj2 = () -> 0;
    }
}

@FunctionalInterface
interface C09MyInterface {
    int method();
}
