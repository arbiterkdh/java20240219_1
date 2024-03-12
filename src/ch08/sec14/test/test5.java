package ch08.sec14.test;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        String a = "qweqwe";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            sb.append(a.charAt(i));
        }
        sb.reverse();
        System.out.println(sb.toString());
    }
}
