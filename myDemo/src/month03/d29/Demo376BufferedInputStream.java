package month03.d29;

import java.io.*;

public class Demo376BufferedInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("E:\\basic\\123.txt");
        BufferedInputStream bis=new BufferedInputStream(fis);
        int len=0;
        while ((len=bis.read())!=-1){
            System.out.println(len);
        }
        bis.close();
    }
}
