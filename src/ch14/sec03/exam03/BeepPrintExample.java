package ch14.sec03.exam03;

import java.awt.Toolkit;

public class BeepPrintExample {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            for (int i = 0; i < 5; i++) {
                toolkit.beep();
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                }
            }
        });
        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("뜅");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}
