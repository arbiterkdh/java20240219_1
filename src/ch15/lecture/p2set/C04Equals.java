package ch15.lecture.p2set;

import java.util.HashSet;
import java.util.Set;

public class C04Equals {
    public static void main(String[] args) {
        Set<C04Book> set = new HashSet<>();
        set.add(new C04Book("이것이 자바다"));
        set.add(new C04Book("모두의 git"));
        set.add(new C04Book("html"));
        set.add(new C04Book("이것이 자바다"));

        System.out.println(set.size());
        System.out.println(set);
    }
}

class C04Book {
    public C04Book(String title) {
        this.title = title;
    }

    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
