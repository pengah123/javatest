package PengH.y2020.m03.d28;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Demo360copy {
    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream("E:\\basic\\123.txt");
        FileOutputStream fout = new FileOutputStream("G:\\123.txt");
        int len = 0;
        byte[] b = new byte[1024];
        while ((len=fin.read(b)) != -1){
/*            byte[] copy= Arrays.copyOf(b,len);
            System.out.println(new String(copy));
            fout.write(copy);*/
            fout.write(b,0,len);
        }

        fout.close();
        fin.close();
    }
}
