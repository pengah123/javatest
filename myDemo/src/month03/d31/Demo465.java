package month03.d31;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Pro(className = "PengH.y2020.m03.d31.Person",methodName = "eat")

public class Demo465 {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException, ClassNotFoundException {
//        解析注解
//        获取该类的字节码文件对象
        Class<Demo465> cls = Demo465.class;
//        获取上面的注解对象
        Pro pro = cls.getAnnotation(Pro.class);
//        调用注解中定义的抽象方法来获取返回值
        String cn = pro.className();
        String mn=pro.methodName();
        System.out.println(cn);
        System.out.println(mn);

        Class cls1 = Class.forName(cn);
        Object o = cls1.newInstance();
        Method method = cls1.getMethod(mn);
        method.invoke(o);
    }
}
