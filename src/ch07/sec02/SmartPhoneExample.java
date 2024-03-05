package ch07.sec02;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("Galaxy S21", "Navy");
        System.out.println("모델: " + smartPhone.model);
        System.out.println("컬러: " + smartPhone.color);
        System.out.println("와이파이 상태: " + smartPhone.wifi);

        smartPhone.bell();
        smartPhone.sendVoice("여보세요.");
        smartPhone.receiveVoice("안녕하세요! 저는 홍길동인데요.");
        smartPhone.sendVoice("아~ 네, 반갑습니다.");
        smartPhone.hangUp();

        smartPhone.setWifi(true);
        smartPhone.internet();
    }
}
