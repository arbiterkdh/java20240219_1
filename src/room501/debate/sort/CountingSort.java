package room501.debate.sort;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr = new int[100];
        // 원본배열 arr
        for (int i = 0; i < arr.length; i++)
            arr[i] = (int) (Math.random() * 100 + 1);
        // 각 원소에 랜덤한 값이 할당됐고, 양의 정수여야 하기 때문에 +1 을 했습니다.

        int max = findMax(arr);
        // 최댓값을 찾는 간단한 메소드입니다.
        countingSort(arr, arr.length, max);
        System.out.println(Arrays.toString(arr));
        // 카운팅 정렬을 수행하고 출력합니다.
    }

    static int findMax(int[] arr) {
        int max = 0;
        for (int i : arr) if (i > max) max = i;
        return max;
    }

    static void countingSort(int[] arr, int size, int max) {
        int[] countArr = new int[max + 1];
        int i = 0;
        // 카운트(개수를 세서 누적)할 배열을 만들고,
        // 자주 호출될 i를 코드 간결성을 위해 생성합니다.

        for (; i < size; i++)
            countArr[arr[i]]++;
        // 카운트 배열의 인덱스에 해당하는 arr 값의 개수를 셉니다.

        for (i = 1; i < max + 1; i++)
            countArr[i] += countArr[i - 1];
        // 만들어진 카운트 배열을 누적합 형식으로 바꿉니다.

        int[] sortedArr = new int[size];
        // 원본 배열의 값에 대입하기 위한 정렬 배열을 생성합니다.

        for (i = size - 1; i >= 0; i--) {
            sortedArr[countArr[arr[i]] - 1] = arr[i];
            countArr[arr[i]]--;
        } // 여기선 상관없지만, 관습상 뒤에서부터 정렬하고,
        // 정렬하고 난 카운트 배열의 인덱스를 1 차감해줍니다.

        for (i = 0; i < size; i++)
            arr[i] = sortedArr[i];
        // 원본 배열에 정렬된 배열을 담아줍니다.
    }
}