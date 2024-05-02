package programmers.practice;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Queue;
import java.util.LinkedList;

public class Practice {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> pQueue = new LinkedList<>(), nQueue = new LinkedList<>();

        int cnt = N;
        while (cnt-- > 0) {
            int n = Integer.parseInt(br.readLine());
            if (n > 0) pQueue.add(n);
            else nQueue.add(n);
        }
        br.close();

        int[] pArr = new int[pQueue.size()], nArr = new int[nQueue.size()];

        for (int i = 0; i < pQueue.size(); i++) pArr[i] = pQueue.poll();
        for (int i = 0; i < nQueue.size(); i++) nArr[i] = nQueue.poll();

        radixSort(nArr, nArr.length);
        radixSort(pArr, pArr.length);

        for (int k : nArr) bw.write(k + "\n");
        for (int j : pArr) bw.write(j + "\n");
        bw.flush();
        bw.close();
    }

    static void radixSort(int[] arr, int size) {
        int max = 0;
        for (int i = 0; i < size; i++)
            if (arr[i] > Math.abs(max)) max = arr[i];

        for (int scope = 1; scope <= Math.abs(max); scope *= 10) {
            countSort(arr, scope, size);
        }
    }

    static void countSort(int[] arr, int scope, int size) {
        int[] bucket = new int[10];
        int[] sorted = new int[size + 1];
        int i;

        for (i = 0; i < size; i++) bucket[arr[i] / scope % 10]++;

        for (i = 1; i < 10; i++) bucket[i] += bucket[i - 1];

        for (i = size - 1; i >= 0; i--) {
            sorted[bucket[arr[i] / scope % 10]] = arr[i];
            bucket[arr[i] / scope % 10]--;
        }

        for (i = 0; i < size; i++) arr[i] = sorted[i + 1];

    }
}




