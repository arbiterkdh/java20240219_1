package ch11.sec07.problem08;

import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("temp/file.txt");) {
            fw.write("java");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
