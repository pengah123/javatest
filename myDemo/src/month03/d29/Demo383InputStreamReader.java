package month03.d29;

import java.io.*;

public class Demo383InputStreamReader {
    public static void main(String[] args) throws IOException {
/*        OutputStreamWriter osw =new OutputStreamWriter(new FileOutputStream("E:\\basic\\utf-8.txt"),"GBK");
        osw.write("你好");
        osw.close();*/
        InputStreamReader isr = new InputStreamReader(new FileInputStream("E:\\basic\\utf-8.txt"),"GBK");
        int len = 0;
        while((len=isr.read())!=-1){
            System.out.println((char)len);
        }
    }
}
