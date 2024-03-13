package ch16.lecture.p1lambda;

public class C06Lambda {
    public static void main(String[] args) {
        C06MyInterface1 obj = a -> {
        };  //파라미터가 하나이면 소괄호 생략 가능
        C06MyInterface2 obj2 = (a, b) -> {
        };
        C06MyInterface3 obj3 = () -> {
        };
    }
}

interface C06MyInterface1 {
    void method(int a);
}

@FunctionalInterface
interface C06MyInterface2 {
    void method(int a, int b);
}

@FunctionalInterface
interface C06MyInterface3 {
    void method();
}
