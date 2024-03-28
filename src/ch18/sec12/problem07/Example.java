package ch18.sec12.problem07;

import java.io.BufferedReader;
import java.io.FileReader;

public class Example {
    public static void main(String[] args) throws Exception {
        String filePath = "src/ch18/sec12/problem07/Example.java";

        FileReader fr = new FileReader(filePath);
        BufferedReader br = new BufferedReader(fr);

        int rowNumber = 1;
        String rowData;
        while (true) {
            rowData = br.readLine();
            if (rowData == null) break;
            System.out.println(rowNumber + "\t" + rowData);
            rowNumber++;
        }

        br.close();
    }
}
