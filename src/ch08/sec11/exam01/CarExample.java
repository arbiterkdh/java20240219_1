package ch08.sec11.exam01;

import ch07.sec12.problem09.C;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();
        car.run();

        car.tire1 = new KumhoTire();
        car.tire2 = new KumhoTire();
        car.run();
    }
}
