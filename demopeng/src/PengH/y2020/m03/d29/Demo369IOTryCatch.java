package PengH.y2020.m03.d29;

import java.io.FileWriter;
import java.io.IOException;

public class Demo369IOTryCatch {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("E:\\basic\\123.txt");) {
            for (int i = 0; i < 10; i++) {
                fw.write("HelloWorld" + i + "\r\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
