package ch19.lecture.p1network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class C06HttpServer {
    public static void main(String[] args) throws IOException {
        // 요청 메시지 보기
        Socket socket = new ServerSocket(9000).accept();

        try (socket) {
            BufferedReader br =
                    new BufferedReader(
                            new InputStreamReader(
                                    socket.getInputStream()));

            try (br) {
                while (true) {
                    String s = br.readLine();
                    System.out.println(s);
                    if (s.isBlank()) break;
                }
            }
        }
    }
}
