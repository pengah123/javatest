package PengH.y2020.m03.d31;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
//        可以创建任意类的对象，可以执行任意方法
        /*
         * 前提，不能改变类的任何代码*/
/*        Person p = new Person();
        p.eat();*/
//加载配置文件，转换为一个集合
//        获取class目录下的配置文件
        Properties pro = new Properties();
        ClassLoader classLoader = ReflectTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("pro.properties");
        pro.load(is);

//       获取配置文件中定义的数据
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

//        加载该类进内存
        Class cls = Class.forName(className);
        Object person = cls.newInstance();
        Method method = cls.getMethod(methodName);
        method.invoke(person);
    }
}
