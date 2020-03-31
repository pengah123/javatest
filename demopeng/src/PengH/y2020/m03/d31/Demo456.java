package PengH.y2020.m03.d31;
/*
获取成员变量们
        Field【】  getFields（）
        Field   getField(String name)
        Field[]   getDeclaredFields()
        Field    getDeclaredField(String name)
获取构造方法们
        getConstructors()
获取成员方法们
        getMethods()
获取类名
        getName()

*/

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Demo456 {
    public static void main(String[] args) throws Exception {
        Class<Person> personClass = Person.class;
/*        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }*/

        Constructor con = personClass.getConstructor(String.class,int.class);
        System.out.println(con);

        Object person=con.newInstance("张三",23);
        System.out.println(person);

    }
}
