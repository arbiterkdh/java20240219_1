package ch02.sec01;


class Printer {


    static void println(int intP) {
        System.out.println(intP);
    }

    static void println(double doubleP) {
        System.out.println(doubleP);
    }

    static void println(boolean boolP) {
        System.out.println(boolP);
    }

    static void println(String strP) {
        System.out.println(strP);
    }
}

public class Practice2024_02_28_2 {
    public static void main(String[] args) {
        Printer.println(10);
        Printer.println(true);
        Printer.println(5.7);
        Printer.println("홍길동");
    }
}
