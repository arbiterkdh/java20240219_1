package ch16.lecture.p1lambda;

public class C04Lambda {
    C04MyInterface1 obj1 = (int a, int b) -> {
    };
    C04MyInterface2 obj2 = (int a) -> {
    };
    C04MyInterface3 obj3 = () -> {
    };
}

interface C04MyInterface1 {
    void method1(int a, int b);
}

interface C04MyInterface2 {
    void method1(int a);
}

interface C04MyInterface3 {
    void method1();
}

interface C04MyInterface4 {
    int method();
}