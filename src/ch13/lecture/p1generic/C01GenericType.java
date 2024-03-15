package ch13.lecture.p1generic;

public class C01GenericType {
    public static void main(String[] args) {
        C01Box box = new C01Box();
        box.setItem("java");
        Object item = box.getItem();
        if (item instanceof String str) {
            System.out.println("스트링에 관련된 일...");
        }


        C01Box item2 = new C01Box();
        item2.setItem(300);
        if (item2.getItem() instanceof Integer integer) {
            System.out.println("인티저에 관련된 일...");
        }
    }
}

class C01Box {
    private Object item;

    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }
}