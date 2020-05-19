package month03.d28;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Demo359FileInPutStream {
    public static void main(String[] args) throws IOException {
        File fs=new File("E:\\basic\\123.txt");
/*        FileOutputStream f=new FileOutputStream(fs);
        byte[] bytes={97,98,99};
        f.write(bytes);
        f.close();*/
        FileInputStream fl=new FileInputStream(fs);
        byte[] b=new byte[2];
        int len=fl.read(b);
        System.out.println(len);
        System.out.println(new String(b));
    }
}
