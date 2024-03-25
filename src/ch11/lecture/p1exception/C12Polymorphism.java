package ch11.lecture.p1exception;

import java.util.List;

public class C12Polymorphism {
    public static void main(String[] args) {
        try {
            Class.forName("java.lang.String"); // ClassNotFoundException
            List.of().get(0); // IndexOutOfBoundsException
            Integer.parseInt("hundred"); // NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            // catch 블럭의 순서는 중요함
            System.out.println(e.getMessage());
        }
    }
}
