package month03.d29;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Demo392 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Person> p=new ArrayList<>();
        p.add( new Person("wangzi",8));
        p.add( new Person("xiekeying",18));
        p.add( new Person("zhengshuang",28));
        p.add( new Person("美女",17));

        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("E:\\basic\\object.txt"));
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("E:\\basic\\object.txt"));

        oos.writeObject(p);
        Object o=ois.readObject();

        oos.close();
        ois.close();

        System.out.println(o);

        List<Person> obj=(ArrayList<Person>)o;
        for (Person person : obj) {
            System.out.println(person.getName()+"="+person.getAge());
        }
    }

}
