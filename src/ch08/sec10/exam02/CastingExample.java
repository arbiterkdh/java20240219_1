package ch08.sec10.exam02;

public class CastingExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();
//        vehicle.checkFare(); X 부모타입으로 자동 형변환 됐기 때문에 자식 메소드 호출 불가
        vehicle.run();

        Bus bus = (Bus) vehicle;
        bus.run();
        bus.checkFare();
    }
}
