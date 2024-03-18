package ch13.lecture.p1generic;

public class C08WildCard {
    public static void main(String[] args) {

    }

    //method1 과 method2 는 같다. Object 는 최상위 객체이기 때문에 생략해도 된다.
    public static void method1(C07Box<? extends Object> box) {
        Object o = box.getItem();
    }

    public static void method2(C07Box<?> box) {
        Object o = box.getItem();
    }
}
