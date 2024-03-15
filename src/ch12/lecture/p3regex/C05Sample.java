package ch12.lecture.p3regex;

public class C05Sample {
    public static void main(String[] args) {

        String pattern = "[^0-9&&\\w]\\w+";
        System.out.println("num".matches(pattern));
        System.out.println("var7".matches(pattern));
        System.out.println("class".matches(pattern));
        System.out.println("PI".matches(pattern));
        System.out.println("MAX_VALUE".matches(pattern));
        System.out.println("7num".matches(pattern));
    }
}
