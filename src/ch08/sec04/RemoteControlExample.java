package ch08.sec04;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc = new Television();
        rc.turnOn();
        rc.setVolume(20);
        rc.setVolume(-10);
        rc.setVolume(5);
        rc.turnOff();
        rc = new Audio();
        rc.turnOn();
        rc.setVolume(3);
        rc.turnOff();
    }
}
