package ch16.lecture.p1lambda;

public class C03FunctionalInterface {
    public static void main(String[] args) {
        C03MyInterface5 obj = (int a) -> {
        };
    }
}

//@FunctionalInterface 아님
interface C03MyInterface1 {

}

@FunctionalInterface // ok
interface C03MyInterface2 {
    void method1();
}

//@FunctionalInterface // 아님
interface C03MyInterface3 {
    void method1();

    void method2();
}

@FunctionalInterface // ok , 추상메소드의 갯수만 확인하는 어노테이션.
interface C03MyInterface4 {
    void method1();

    default void method2() {
    }

    ;
}

@FunctionalInterface // ok , 모든 클래스는 Object 의 하위 클래스이기 때문에, Object 에 속해있는 클래스의 메소드를 추상메소드로 쓰는 것은 갯수로 치지 않는다.
interface C03MyInterface5 {
    void method1(int a);

    String toString();
}