package ch11.lecture.p1exception;

import java.util.List;

public class C02CheckedException {
    public static void main(String[] args) {
        List<String> list = List.of("a", "b");

        // List.get : IndexOutOfBoundsException
        // (unchecked exception)
        // 컴파일러가 검사안함 = 예외 처리 코드가 없어도 됨, (있어도 됨)
        System.out.println("list.get(2) = " + list.get(2));

        // Class.forName : ClassNotFoundException
        // (checked exception)
        // -> 예외 처리 코드가 있는지 컴파일러가 검사함
        // = 예외 처리 코드가 꼭 있어야 함.
        try {
            Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
