package ch15.lecture.p6of;

import java.util.ArrayList;
import java.util.List;

public class C04Modifiable {
    public static void main(String[] args) {
        List<Integer> list = List.of(4, 1, 0, 9);
        List<Integer> list2 = new ArrayList<>(list);

        System.out.println(list2);
        list2.add(10);
        System.out.println(list2);
//        of를 쓰면 변경이 불가능한 것도 ArrayList 의 인자로 받으면 변경 가능하다.
//        왜냐면 ArrayList 가 List 를 구현하고 있고, ArrayList 로써 새로 생성된 객체는 ArrayList 의 메소드로써 작동하기 때문.
    }
}
