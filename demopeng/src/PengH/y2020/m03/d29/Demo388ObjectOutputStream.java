package PengH.y2020.m03.d29;

import java.io.*;

public class Demo388ObjectOutputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
/*        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("E:\\basic\\object.txt"));
        oos.writeObject(new Person("美女",18));
        oos.close();*/
        ObjectInputStream oos=new ObjectInputStream(new FileInputStream("E:\\basic\\object.txt"));
        Object o=oos.readObject();
        oos.close();
        System.out.println(o);
    }
}
