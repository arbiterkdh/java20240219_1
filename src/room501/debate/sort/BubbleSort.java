package room501.debate.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        // 버블 정렬을 구현한 코드입니다.
        int[] arr = new int[10];
        for (int n = 0; n < arr.length; n++) {
            arr[n] = (int) (Math.random() * 10);
        }
        // 임의의 순서로 나열된 배열 할당.
        int swap = 0; // 조건에 맞으면 swap 하기 위한 변수 생성
        int i = arr.length - 1; // 매 반복마다 인덱스가 줄어들기 위한 변수.
        while (i > 0) {
            // 버블 정렬은,
            // 두 값이 배열 전체를 돌면서 비교하고 swap 하며,
            // 한 번의 수행이 끝나면 맨 끝 인덱스가 정렬되기 때문에,
            // 매 반복의 범위를 하나씩 줄이기 위해 while 문으로 합니다.
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }
            }
            i--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
