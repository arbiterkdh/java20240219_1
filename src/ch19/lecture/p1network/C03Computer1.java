package ch19.lecture.p1network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class C03Computer1 {
    public static void main(String[] args) throws IOException {

        File file = new File("temp/dir1/cat2.jpg");
        Socket socket = new ServerSocket(9000).accept();

        try (socket) {
            BufferedOutputStream bos =
                    new BufferedOutputStream(
                            socket.getOutputStream());

            BufferedInputStream bis =
                    new BufferedInputStream(
                            new FileInputStream(file));

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
