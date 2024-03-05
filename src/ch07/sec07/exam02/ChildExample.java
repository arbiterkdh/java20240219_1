package ch07.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = child;

        parent.method1();
        parent.method2();

//        parent.method3();
//        자식객체에서 오버라이딩 된 메소드인 method2는 호출이 가능하지만,
//        별도로 자식객체에서 추가로 생성한 메소드인 method3 는 호출이 불가능.
    }
}
