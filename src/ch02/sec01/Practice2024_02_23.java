package ch02.sec01;


public class Practice2024_02_23 {

    public static void main(String[] args) {

        FirstTimeClass pc = new FirstTimeClass("킹갓왕동현", 32);
        FirstTimeClass pc2 = new FirstTimeClass("동그리동동", 32);
        FirstTimeClass pc3 = new FirstTimeClass("킹동현");
        FirstTimeClass pc4 = new FirstTimeClass(32);

        System.out.println("국가: " + pc.nation + ", 이름: " + pc.name + ", 나이: " + pc.age + "세");
        System.out.println("국가: " + pc2.nation + ", 이름: " + pc2.name + ", 나이: " + pc2.age + "세");
        System.out.println("국가: " + pc4.nation + ", 이름: " + pc3.name + ", 나이:" + pc4.age);
    }
}
