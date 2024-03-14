package ch12.lecture.p2wrapper;

public class C04Unboxing {
    public static void main(String[] args) {
        Integer a = 3; // auto boxing
        int c = a.intValue(); // unboxing 예전
        int b = a; // 현재는 auto unboxing

        Long d = 5L;

        long e = d; // auto unboxing
        double f = e;
        double g = d; // auto unboxing 이 일어난 후에 long 에서 double 로 기본타입끼리 자동 타입변환이 일어남.

        System.out.println("실행 종료");
    }
}
