package ch11.lecture.p2throw;

public class C01Throw {
    public static void main(String[] args) {

        // throw : 예외 던지기

        // unchecked exception
        final RuntimeException e = new RuntimeException();

        // 예외 던지기
        throw e;

//        System.out.println("코드 실행 안됨");

    }

}
