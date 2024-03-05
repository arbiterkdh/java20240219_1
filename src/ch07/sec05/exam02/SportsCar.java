package ch07.sec05.exam02;

public class SportsCar extends Car {
    @Override
    public void speedUp() {
        speed += 10;
    }
//    public void stop(){
//        System.out.println("차를 멈춤");
//        speed = 0;
//    }
//    부모 객체에서 stop() 메소드를 final 로 선언했기 때문에
//    자식 객체에서 오버라이딩 할 수 없음.
}
