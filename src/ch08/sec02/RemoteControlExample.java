package ch08.sec02;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;
        rc = new Television();
        rc.turnOn();

        RemoteControl rc2 = new Television();
        rc2.turnOn();

        rc = new Audio();

        rc.turnOn();
    }
}
