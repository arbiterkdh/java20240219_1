package ch12.sec11.exam01;

public class GetClassExample {
    public static void main(String[] args) {
        Class clazz = Car.class;
        System.out.println("패키지: " + clazz.getPackageName());
        System.out.println("클래스 간단 이름: " + clazz.getSimpleName());
        System.out.println("클래스 전체 이름: " + clazz.getName());
    }
}
