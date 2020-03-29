package PengH.y2020.m03.d29;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo375BufferedOutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("E:\\basic\\123.txt");
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        bos.write("我把数据写到内部缓冲区中".getBytes());
        bos.flush();
        bos.close();
    }
}
