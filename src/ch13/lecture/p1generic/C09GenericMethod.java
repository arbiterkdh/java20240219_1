package ch13.lecture.p1generic;

public class C09GenericMethod {
    public static void main(String[] args) {
        C07Box<String> box = new C07Box<>();
        method("hello"); // java 는 메소드 파라미터로 type 파라미터 유추.
        method(34);
        String s = method1(); // String 유추.
        Integer i = method1(); // Integer 로 유추.
    }


    // 제네릭 메소드. 메소드에만 별도로 사용되는 게 가능.
    public static <T> void method(T param) {

    }

    public static <T> T method1() {
        return null;
    }

}

class Box<T> {

}

interface Container<T> {

}
