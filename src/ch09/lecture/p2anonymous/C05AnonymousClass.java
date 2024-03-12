package ch09.lecture.p2anonymous;

public class C05AnonymousClass {
    public static void main(String[] args) {
        C05Parent obj1 = new C05Parent() {

        };
        method(obj1);
    }

    public static void method(C05Parent param) {

    }
}

abstract class C05Parent {
}
