package ch13.lecture.p1generic;

public class C06WildCard {
    public static void main(String[] args) {
        Integer v1 = 100;
        Number v2 = v1;
        Double v3 = 3.14;
        Number v4 = v3;
        Object v5 = v2;
        Object v6 = v4;

        C06Box<Integer> b1 = new C06Box<>();
//        C06Box<Number> b2 = b1; // x
        C06Box<? extends Number> b2 = b1; // Number 보다 하위타입
        C06Box<Object> b4 = new C06Box<>();
        C06Box<? super Number> b3 = b4;

    }
}

class C06Box<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}