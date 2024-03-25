package ch11.lecture.p1exception;

import java.util.List;

public class C13MultiCatch {
    public static void main(String[] args) {
        try {
            Class.forName("java.lang.String");
            List.of().get(0);
            Integer.parseInt("two");
        } catch (ClassNotFoundException e) {
            System.out.println("예외처리 코드1");
        } catch (IndexOutOfBoundsException | NumberFormatException e) {
            System.out.println("예외처리 코드2");
        }
    }
}
