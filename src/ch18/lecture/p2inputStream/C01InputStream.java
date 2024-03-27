package ch18.lecture.p2inputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class C01InputStream {
    public static void main(String[] args) {
        String fileName = "temp/test3.db";
        try {
            InputStream is = new FileInputStream(fileName);
            try (is) {
                int data1 = is.read(); // 1 byte 읽기
                int data2 = is.read(); // 1 byte 읽기
                int data3 = is.read(); // 1 byte 읽기
                int data4 = is.read(); // -1 리턴
                int[] data = new int[]{data1, data2, data3, data4};
                System.out.println(Arrays.toString(data));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
