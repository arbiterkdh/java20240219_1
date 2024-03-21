package ch15.lecture.p6of;

import java.util.ArrayList;
import java.util.List;

public class C01Of {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("css");
        list.add("html");
        list.add("react");
        System.out.println(list);
        list.add("spring");
        list.remove("react");
        list.set(1, "vue");
        System.out.println(list);


        List<String> list2 = List.of("java", "css", "html", "react");
        System.out.println(list2);
//        list2.add("asd");
//        list2.remove(1);
//        List.of 는 한번 할당하면 변경 불가
    }
}
