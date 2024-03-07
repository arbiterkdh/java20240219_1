package ch08.sec14.test;

import java.util.Arrays;

public class test3 {
    public static void main(String[] args) {
        String polynomial = "3x + 7 + x";
        polynomial = polynomial.replace(" + ", " ");
        String[] xArr = polynomial.split(" ");
        System.out.println(Arrays.toString(xArr));
        System.out.println(xArr[0]);
        int x = 0;
        int num = 0;
        for (String e : xArr) {
            if (e.contains("x") && !e.equals("x")) {
                x += Integer.parseInt(e);
            } else if (e.equals("x")) {
                x++;
            } else {
                num += Integer.parseInt(e);
            }
        }
        System.out.println(x + "," + num);
//        System.out.println(Integer.toString(x) + "x + " + Integer.toString(num));
    }
}
