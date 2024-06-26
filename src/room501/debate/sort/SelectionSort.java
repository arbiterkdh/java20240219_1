package room501.debate.sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        // 선택 정렬을 구현한 코드입니다.
        int[] arr = new int[10];
        for (int n = 0; n < arr.length; n++) {
            arr[n] = (int) (Math.random() * 10);
        }
        // 임의의 순서로 나열된 배열 할당.
        int swap; // 조건에 맞으면 swap 하기 위한 변수 생성
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swap = arr[i];
                    arr[i] = arr[j];
                    arr[j] = swap;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
