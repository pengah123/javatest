package month03.d29;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo363FileReader {
    public static void main(String[] args) throws IOException {
/*        FileReader fr=new FileReader("E:\\basic\\123.txt");
        char[] c=new char[1024];
        int len=0;
        while((len=fr.read(c))!=-1){
            System.out.println(new String(c,0,len));*/
File f=new File("E:\\basic\\123.txt");
        FileWriter fw=new FileWriter(f,true);
        fw.write(99);
        fw.flush();
        fw.close();//也可以刷新缓冲区
        }
    }
