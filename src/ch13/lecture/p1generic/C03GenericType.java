package ch13.lecture.p1generic;

public class C03GenericType {
    public static void main(String[] args) {

    }
}

class C03Box<T, U> {
    private T item;
    U item2;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public U getItem2() {
        return item2;
    }

    public void setItem2(U item2) {
        this.item2 = item2;
    }
}