package ch13.lecture.p1generic;

public class C02GenericType {
    public static void main(String[] args) {
        C02Box<String> box1 = new C02Box<String>();
        C02Box<Integer> box2 = new C02Box<Integer>();

        box1.setItem("java");
        String item = box1.getItem();
    }
}

class C02Box<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
