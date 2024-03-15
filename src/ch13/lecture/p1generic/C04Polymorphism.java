package ch13.lecture.p1generic;

public class C04Polymorphism {

}

class C04Box<T> {
    private T item;

    public void someMethod() {
        // Object 의 메소드 사용 가능. 모든 인스턴스의 상위 타입이기 때문.
        System.out.println(item.toString());
        System.out.println(item.hashCode());
        System.out.println(item.equals(null));
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}