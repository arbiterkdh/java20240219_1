package ch11.lecture.p3custom;

public class C03Custom {
    public static void main(String[] args) {
        try {
            mehtod1();
        } catch (Exception e) {
            e.printStackTrace();
//            System.out.println(e.getMessage());
        }

    }

    public static void mehtod1() {
        throw new BreakDoorHandleException("문고리가 고장남");
    }

}


// 직접 만드는 exception
// 1. Exception : checkedException
// 2. RuntimeException : uncheckedException
class BreakDoorHandleException extends RuntimeException {
    public BreakDoorHandleException() {
    }

    public BreakDoorHandleException(String message) {
        super(message);
    }
}