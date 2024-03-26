package ch14.lecture.p1thread;

import java.awt.*;

public class C03Thread {
    public static void main(String[] args) {
        // Thread 만들기
        // 1. Thread 클래스 상속
        //    run 메소드 재정의

        // 2. Runnable 인터페이스 구현
        //    run 메소드 재정의
        MyThread3 thread3 = new MyThread3();
        thread3.start(); // Thread 시작하기

        for (int i = 0; i < 30000; i++) {
            System.err.println(i);
        }
    }
}

class MyThread3 extends Thread {
    @Override
    public void run() {
        // 이 Thread 가 할 일
        for (int i = 0; i < 30000; i++) {
            System.out.println(i);
        }
    }
}