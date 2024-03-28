package ch18.lecture.p5filter;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C04BufferedOutputStream {

    public static void main(String[] args) throws IOException {

        String fileName = "temp/bigfile/output2.data";
        OutputStream os = new FileOutputStream(fileName);
        BufferedOutputStream bos = new BufferedOutputStream(os);

        byte[] data = new byte[16];

        long start = System.nanoTime();
        for (int i = 0; i < 1024 * 1024 * 64; i++) {
            bos.write(data);
        }
        long end = System.nanoTime();
        long time = end - start;
        System.out.println("time = " + time);

        bos.flush();
        bos.close();
    }
}
