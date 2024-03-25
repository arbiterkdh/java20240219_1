package ch11.sec07.problem02;

public class Example {
    public static void main(String[] args) {

        try {
            int i = method(0);
        } catch (Exception e) {
            return;
        } finally {
            System.out.println("something");
        }

    }

    public static int method(int i) {
        return 100 / i;
    }
}
