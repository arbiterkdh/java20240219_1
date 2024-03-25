package ch11.lecture.p1exception;

import javax.management.ListenerNotFoundException;
import java.util.List;

public class C10Polymorphism {
    public static void main(String[] args) {
        try {
            Class.forName("java.lang.String");
            List.of().get(0);
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        ;

    }
}
