package ch02.sec01;

public class VariableInitializationExample {
    public static void main(String[] args) {

        int num = 0;
        for (int i = 0; i < 10; i++) {
            if (i == i) {
                num++;
            }
        }
        System.out.println(num);

    }
}
