package ch17.lecture.p1stream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class C20OutputStream {
    public static void main(String[] args) throws Exception {
        OutputStream os = new FileOutputStream("temp/output2.data");

        os.write(29374);
        os.write(9871234);

        Thread.sleep(10_000);

        os.write(9872342);
        os.write(28374);

        os.flush(); // 아직 스트림에 출력되지 않은 데이터들을 강제 출력
        os.close(); // 꼭 작성해야함
    }

}
