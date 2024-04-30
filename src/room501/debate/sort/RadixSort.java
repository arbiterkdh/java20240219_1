package room501.debate.sort;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        // 기수 정렬을 구현한 코드입니다.
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++)
            arr[i] = (int) (Math.random() * 1000);
        // 임의의 순서로 나열된 배열 할당.
        radixSort(arr, arr.length);
        // 기수 정렬은 큐를 이용하거나,
        // 큐의 개념과 비슷한 로직을 사용해서
        // 정렬하는 방법입니다.
        System.out.println(Arrays.toString(arr));
    }

    static void radixSort(int[] arr, int size) {
        // arr 정렬하고자 하는 배열,
        // 여기서 size 는 따로 받지 않아도 되지만,
        // 가독성을 위해 arr 의 length 를 인자로써 받습니다.
        int max = arr[0];
        // 기수 정렬은 숫자의 단위를 X10 씩 옮겨가며 정렬합니다.
        // 따라서 몇 자리 단위 까지 정렬해야 하는지
        // 알기 위해 최대값을 받을 변수를 할당합니다.
        for (int i = 0; i < size; i++)
            // 최대값을 찾는 간단한 반복문입니다.
            if (max < arr[i]) max = arr[i];

        for (int scope = 1; max / scope > 0; scope *= 10)
            // 확인한 최대값을 이용해,
            // 1의 단위부터 정렬을 시작하는 반복문입니다.
            // scope 는 지정된 단위를 가리키는 변수이고,
            // max 의 단위보다 커지면 종료됩니다.
            countSort(arr, size, scope);
        // countSort 라고 이름 지은
        // 내부 메소드를 반복적으로 호출해서,
        // 해당 scope 별로 정렬을 수행합니다.

    }

    static void countSort(int[] arr, int size, int scope) {
        // 정렬할 배열 arr 과, 가독성을 위해 인자로 받은 size,
        // 현재 scope 에 해당하는 자리를 정렬하기 위해
        // scope 를 인자로 받습니다.
        int[] bucket = new int[10];
        int[] sorted = new int[size];
        // 숫자는 0부터 9까지 있기 때문에,
        // 각 숫자를 차곡차곡 담을 배열 bucket 을 만들고,
        // 원본 arr 의 자리 값을 bucket 에 담은 것을
        // 기준으로 삼아서 정렬할 배열 sorted 를 생성합니다.
        int i;
        // 반복문이 많이 등장해서 가독성을 위해 변수를
        // 위에서 먼저 만들었습니다.

        for (i = 0; i < size; i++) bucket[(arr[i] / scope) % 10]++;
        // arr[i] 의 현재 자리 값만 필요하기 때문에,
        // scope 로 나눠서 현재 정렬할 자리를 1의 자리로 오게 하고,
        // % 10 으로 1의 자리 값만을 받아서,
        // 해당 bucket 의 인덱스를 증가시키는 반복문입니다.

        for (i = 1; i < 10; i++) bucket[i] += bucket[i - 1];
        // 큐의 FIFO 를 구현하기 위해
        // 누적합을 먼저 만드는 반복문입니다.

        for (i = size - 1; i >= 0; i--) {
            sorted[bucket[arr[i] / scope % 10] - 1] = arr[i];
            bucket[arr[i] / scope % 10]--;
            // 복잡해 보이고 실제로도 약간 복잡한데,
            // (arr[i] / scope) % 10 는 위에서 설명한 대로,
            // 현재 자리 값만 받아오는 것이고,
            // 그것의 bucket 인덱스를 확인하면,
            // 어느 자리에 위치해야 하는지를 알 수 있는데,
            // -1 을 하는 이유는
            // bucket 에는 개수로써 값이 담기기 때문에
            // sorted 에 다시 인덱스로 담기 위해 -1 을 하고,
            // 그 인덱스에 원래 정렬하려 했던
            // arr[i] 값을 담아서 정렬합니다.
        }

        for (i = 0; i < size; i++) arr[i] = sorted[i];
        // 현재 scope 가 정렬된 sorted 배열은
        // 지역 변수이기 때문에,
        // arr 값을 변경하기 위한 반복문입니다.
    }
}