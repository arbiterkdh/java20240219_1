package ch11.lecture.p2throw;

public class C05Throw {
    public static void main(String[] args) {
        try {
            someMethod3();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public static void someMethod3() throws ClassNotFoundException {
        someMethod2();
    }

    public static void someMethod2() throws ClassNotFoundException {
        someMethod1();
    }

    public static void someMethod1() throws ClassNotFoundException {
        throw new ClassNotFoundException();
    }
}

