package ch19.lecture.p1network;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class C02Computer2 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("172.30.1.32", 9000);

        try (socket) {
            PrintWriter pw =
                    new PrintWriter(
                            new BufferedWriter(
                                    new OutputStreamWriter(
                                            socket.getOutputStream())));

            Scanner scanner = new Scanner(System.in);

            try (pw; scanner) {
                while (true) {
                    System.out.print("입력> ");
                    String data = scanner.nextLine();
                    pw.print(data);
                    if (data.equals("bye")) break;
                    pw.flush();
                }

            }
        }

    }
}
