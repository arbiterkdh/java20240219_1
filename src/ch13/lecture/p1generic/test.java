package ch13.lecture.p1generic;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {

        String s = "qwe asd asd";
        char[] d = s.toCharArray();
        System.out.println(d);
        System.out.println(d[3] == ' ');
        StringBuilder sb = new StringBuilder();
        sb.append(d);
        System.out.println(sb.length());

        System.out.println(sb.charAt(1) == 'w');
        sb.delete(1, 4);
        System.out.println(sb);
        System.out.println(sb.length() == 0);
        ;

    }
}
