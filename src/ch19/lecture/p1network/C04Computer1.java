package ch19.lecture.p1network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class C04Computer1 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9000);
        while (true) {
            Socket socket = serverSocket.accept();

            Thread t = new Thread(() -> {

                try (socket) {
                    BufferedOutputStream bos =
                            new BufferedOutputStream(
                                    socket.getOutputStream());

                    BufferedInputStream bis =
                            new BufferedInputStream(
                                    new FileInputStream("temp/dir1/cat2.jpg"));

                    try (bis; bos;) {
                        byte[] data = new byte[128];
                        int len = 0;
                        while ((len = bis.read(data)) != -1) {
                            bos.write(data, 0, len);
                        }

                        bos.flush();

                    }
                    System.out.println("완료: " + socket.getLocalSocketAddress());
                } catch (IOException e) {
                    System.out.println("오류: " + socket.getLocalSocketAddress());
                }

            });
            t.start();
        }
    }
}
