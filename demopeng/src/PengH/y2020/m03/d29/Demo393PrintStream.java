package PengH.y2020.m03.d29;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Demo393PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("我在控制台输出");
        PrintStream ps=new PrintStream("E:\\basic\\PrintStream.txt");
        System.setOut(ps);
        System.out.println("我在打印流输出");
        ps.close();
    }
}
