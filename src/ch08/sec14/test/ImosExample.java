package ch08.sec14.test;

public class ImosExample {
    public static void main(String[] args) {
        int[][] a = {{1, 3}, {4, 6}, {7, 8}}; // 하나도 안겹침.
        int[][] b = {{1, 5}, {4, 6}, {7, 8}}; // 0,1만 겹침.
        int[][] c = {{0, 10}, {1, 8}, {2, 6}}; //0,1,2 다 겹침.
        int[][] d = {{1, 5}, {2, 8}, {3, 6}};
        imos(a, 0, 2, 1);
    }

    public static void imos(int[][] a, int start, int end, int value) {
        int[] length = new int[Math.abs(start - end)];
        length[0] = value;
        length[length.length - 1] = -value;


    }
    
}
