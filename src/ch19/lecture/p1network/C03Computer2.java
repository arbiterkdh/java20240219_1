package ch19.lecture.p1network;

import java.io.*;
import java.net.Socket;

public class C03Computer2 {
    public static void main(String[] args) throws IOException {
        File file = new File("temp/copied/cat4.jpg");
        File folder = file.getParentFile();
        if (!folder.exists()) folder.mkdirs();

        Socket socket = new Socket("172.30.1.99", 9000);

        try (socket) {
            BufferedInputStream bis =
                    new BufferedInputStream(
                            socket.getInputStream());

            BufferedOutputStream bos =
                    new BufferedOutputStream(
                            new FileOutputStream(file));

            byte[] data = new byte[128];
            int len = 0;
            try (bis; bos) {
                while ((len = bis.read(data)) != -1) {
                    bos.write(data, 0, len);
                    bos.flush();
                }
            }
        }
    }
}
