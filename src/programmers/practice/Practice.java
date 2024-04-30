package programmers.practice;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Set;
import java.util.HashSet;

public class Practice {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(br.readLine());

        br.close();
        int max = 0;
        for (int i = 0; i < N; i++)
            if (arr[i] > max) max = arr[i];

        for (int scope = 1; scope <= max; scope *= 10)
            radixSort(arr, scope, N);

        for (int i = 0; i < N; i++)
            bw.write(arr[i] + "\n");

        bw.flush();
        bw.close();
    }

    static void radixSort(int[] arr, int scope, int size) {
        int[] bucket = new int[10];
        int[] sorted = new int[size];
        int i;

        for (i = 0; i < size; i++) bucket[arr[i] / scope % 10]++;

        for (i = 1; i < 10; i++) bucket[i] += bucket[i - 1];

        for (i = size - 1; i >= 0; i--) {
            sorted[bucket[arr[i] / scope % 10] - 1] = arr[i];
            bucket[arr[i] / scope % 10]--;
        }
        for (i = 0; i < size; i++) arr[i] = sorted[i];

    }
}




