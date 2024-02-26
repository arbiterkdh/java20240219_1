package ch02.sec01;

public class SecondClassMain {
    public static void main(String[] args) {
        SecondClass myCar = new SecondClass();

        myCar.setGas(50);
        if (myCar.isLeftGas()) {
            System.out.println("출발합니다.");

            myCar.run();
        }
        System.out.println("gas를 주입하세요.");
    }
}
