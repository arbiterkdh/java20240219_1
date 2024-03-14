package ch12.lecture.p2wrapper;

public class C02WrapperClass {
    public static void main(String[] args) {
        int a = 3;
        long b = a;

        Integer c = a;
        Long d = b;
//        Long e = c; 에러
        Long e = (long) c;
        Long f = (long) a;
    }
}
