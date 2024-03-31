package room501.debate.sort;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 6, 4, 7, 2, 9, 1, 3, 5, 8};
        // 임의의 순서로 나열된 배열 할당.
        int swap = 0; // 조건에 맞으면 swap 하기 위한 변수 생성
        int gap = arr.length / 2;
        // 셸정렬은 gap 을 이용해서 배열을 부분정렬하고,
        // 매 반복마다 gap 을 반씩 줄여나가며 정렬을 합니다.
        while (gap > 0) {
            // gap 을 기준으로 반복하기 때문에 while 문을 씁니다.
            for (int i = 0; i < arr.length - gap; i++) {
                if (arr[i] > arr[i + gap]) {
                    swap = arr[i];
                    arr[i] = arr[i + gap];
                    arr[i + gap] = swap;
                }
            }
            gap /= 2;
        }
        System.out.println(Arrays.toString(arr));
        // 출력값 [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    }
}