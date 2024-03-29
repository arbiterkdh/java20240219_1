package ch19.lecture.p1network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class C02Computer1 {
    public static void main(String[] args) throws IOException {
        Socket socket = new ServerSocket(9000).accept();

        try (socket) {
            BufferedReader br =
                    new BufferedReader(
                            new InputStreamReader(
                                    socket.getInputStream()));

            String line = "";

            try (br) {
                while ((line = br.readLine()) != null) {
                    System.out.println("메시지: " + line);
                }
            }
        }

    }
}
