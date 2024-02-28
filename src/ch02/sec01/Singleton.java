package ch02.sec01;

public class Singleton {


    public static void main(String[] args) {
        ShopService singleton1 = ShopService.getInstance();
        ShopService singleton2 = ShopService.getInstance();
        if (singleton1 == singleton2) {
            System.out.println("같은 객체입니다.");
        } else {
            System.out.println("다른 객체입니다.");
        }
    }


}
