package ch08.sec14.test;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {

        boolean[] attendance = {false, true, true, true, true, false, false};
        int[] rank = {3, 7, 2, 5, 4, 6, 1};
        int answer = 0;
        int a = 100, b = 100, c = 100;
        int valA = rankSelect(attendance, rank, 0, a) * 10000;
        int valB = rankSelect(attendance, rank, a, b) * 100;
        int valC = rankSelect(attendance, rank, b, c);

        int num = valA + valB + valC;
        System.out.println(num);


    }

    public static int rankSelect(boolean[] attendance, int[] rank, int compare1, int compare2) {
        int val = 0;
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) {
                if (rank[i] > compare1 && rank[i] < compare2) {
                    compare2 = rank[i];
                    val = i;
                }
            }
        }
        return val;

    }
}

