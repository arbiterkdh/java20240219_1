package ch18.sec12.problem10;

import java.io.*;

public class Example {
    public static void main(String[] args) throws IOException {
        String sourceFilePath = "";
        String destinationFilePath = "";
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        try (br) {

            System.out.print("원본 파일 경로: ");
            sourceFilePath = br.readLine();
            System.out.print("복사 파일 경로: ");
            destinationFilePath = br.readLine();

            File sourceFile = new File(sourceFilePath);
            File destinationFile = new File(destinationFilePath);
            if (sourceFile.exists()) {
                File folder = destinationFile.getParentFile();
                if (!folder.exists()) {
                    folder.mkdirs();
                }

                InputStream is = new FileInputStream(sourceFile);
                BufferedInputStream bis = new BufferedInputStream(is);
                OutputStream os = new FileOutputStream(destinationFile);
                BufferedOutputStream bos = new BufferedOutputStream(os);

                try (bis; bos) {
                    byte[] data = new byte[1024];
                    int len = 0;
                    while ((len = bis.read(data)) != -1) {
                        bos.write(data, 0, len);
                    }
                }
                System.out.println("복사가 성공되었습니다.");
                bos.flush();
            } else {
                System.out.println("원본 파일이 존재하지 않습니다.");
            }
        }
    }
}
