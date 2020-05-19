package month03.d29;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Demo372Property {
    public static void main(String[] args) throws IOException {
/*        Properties prop = new Properties();
        prop.setProperty("zhaoliyin","18");
        prop.setProperty("yangmi","30");
        prop.setProperty("zhengshuang","23");*/
/*        Set<String> str = prop.stringPropertyNames();
        for (String s : str) {
            System.out.println(s+"="+prop.get(s));
        }*/
/*        FileOutputStream fw = new FileOutputStream("E:\\basic\\123.txt");
        prop.store(fw,"save data");
        fw.close();*/
        Properties prop = new Properties();
        FileInputStream fw = new FileInputStream("E:\\basic\\123.txt");
        prop.load(fw);
        Set<String> str = prop.stringPropertyNames();
        for (String s : str) {
            System.out.println(s+"="+prop.get(s));
        }
}
}
