package ch16.lecture.p1lambda;

import java.util.List;

public class C12StaticMethodReference {
    public static void main(String[] args) {
        C12MyInterFace obj1 = (x, y) -> C12OtherClass.method(x, y);
        C12MyInterFace obj2 = C12OtherClass::method;

        List<Integer> list = List.of(9, 10, 1, 3, 27)
                .stream()
                .filter(C12OtherClass::isOdd)
                .toList();
        System.out.println(list);
    }


}

class C12OtherClass {
    static boolean isOdd(int n) {
        return n % 2 == 1;
    }

    static int method(int x, int y) {
        System.out.println("어떤 일을 함... 중요하지 않음...");
        return 0;
    }
}

@FunctionalInterface
interface C12MyInterFace {
    int method(int a, int b);
}