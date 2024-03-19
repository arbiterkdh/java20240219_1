package ch15.sec09.test;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        String a = "ababbbbaaaaccccbbcccccaaccbcbcbabcbabcbabbaabcbbca";
        String b = "[ab]";

        a = a.replaceAll(b, "");
        System.out.println(a);

        
    }
}

