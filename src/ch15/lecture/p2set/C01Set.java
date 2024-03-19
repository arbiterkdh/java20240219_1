package ch15.lecture.p2set;

import java.util.HashSet;
import java.util.Set;

public class C01Set {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        // 추가 add
        set.add("java");
        set.add("spring");
        set.add("html");
        set.add("react");

        System.out.println(set.size()); // 4

        // 포함하지 않는 원소만 추가 가능
        boolean b1 = set.add("css"); // true
        boolean b2 = set.add("java"); // false
        System.out.println(set.size());  // 5
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);

        // 지우기 remove
        set.remove("java");
        set.remove("css");
        System.out.println(set.size());
        set.remove("jsp");
        System.out.println(set.size());
    }
}
