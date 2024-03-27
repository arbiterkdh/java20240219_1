package ch18.lecture.p1outputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C09OutputStream {
    public static void main(String[] args) {
        String fileName = "temp/output9.data";
        try (OutputStream os = new FileOutputStream(fileName)) {

            os.write(23434); // 1 byte 쓰기

            byte[] data = new byte[10];

            os.write(data); // 10 bytes 쓰기
            os.write(data, 0, 10); // 10 bytes 쓰기
            os.write(data, 5, 3); // 5번 인덱스부터 3개 쓰기 (3 bytes 쓰기)

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
