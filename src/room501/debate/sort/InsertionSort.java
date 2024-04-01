package room501.debate.sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        //삽입 정렬을 구현한 코드입니다.
        int[] arr = new int[10];
        for (int n = 0; n < arr.length; n++) {
            arr[n] = (int) (Math.random() * 10);
        }
        // 임의의 순서로 나열된 배열 할당.
        int key; // 조건이 맞으면 삽입할 변수 생성
        // 변수명이 key 인 이유는,
        // 삽입정렬에서 key 값은 고정된 채로 비교가 되고,
        // key 보다 앞선 인덱스는
        // 자신보다 하나 더 앞선 인덱스와 비교를 하기 때문입니다.
        for (int i = 1; i < arr.length; i++) {
            key = arr[i]; // 현재 인덱스의 값을 key 로 할당
            for (int j = i - 1; j >= 0; j--) {
                // 비교 값은 책에서 소개되는
                // 개념적인 삽입정렬과는 다르게,
                // 코드로 구현했을 때는
                // 뒤에서부터 비교해서 당겨오는 방식입니다.
                if (arr[j] > key) {
                    arr[j + 1] = arr[j];
                    arr[j] = key;
                } else {
                    arr[j + 1] = key;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
