package ch16.lecture.p1lambda;


import java.util.Arrays;

public class test {


    public static void main(String[] args) {
        long n = 118372L;
        long answer = 0;
        int cnt = 0;
        long temp = n;
        long temp2 = 1;
        while (temp != 0) {
            temp /= 10;
            temp2 *= 10;
            cnt++;
        }
        temp2 /= 10;
        long[] arr = new long[cnt];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (long) n % 10;
            n /= 10;
        }
        long[] arr2 = new long[cnt];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                arr2[i] = arr[i] > arr[j] ? arr[i] : arr[j];
            }
            answer += temp2 * arr2[i];
            temp2 /= 10;
        }
        System.out.println(answer);
    }
}
