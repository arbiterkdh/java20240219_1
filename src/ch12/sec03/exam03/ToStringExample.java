package ch12.sec03.exam03;

public class ToStringExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("Samsung", "Android");

        String strObj = myPhone.toString();

        System.out.println(strObj);

        System.out.println(myPhone);

        Test test = new Test();

        System.out.println(test);
    }
}
