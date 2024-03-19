package ch15.lecture.p1list;

import java.util.ArrayList;
import java.util.List;

public class C05Of {
    public static void main(String[] args) {
        List<String> strings = List.of();
        System.out.println(strings.size());

        List<String> list = List.of("java");
        System.out.println(list.size());
        System.out.println(list);

        List<String> list2 = List.of("react", "vue", "jsp");
//        list2.set(0, ""); // x
//        list2.add("123"); // x
//        list2.remove(0) // x
        System.out.println(list2);

        List<String> list3 = new ArrayList<>();
        list3.add("spring");
        list3.add("css");
        System.out.println(list3);


    }
}
