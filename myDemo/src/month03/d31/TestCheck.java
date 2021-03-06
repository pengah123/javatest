package month03.d31;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;

/*简单的测试框架
 * 会自动运行被检测的方法（加了Check注解的方法），判断方法是否有异常，记录到文件中
 * */
public class TestCheck {
    public static void main(String[] args) throws IOException {
//        创建计算器对象
        Caculator c = new Caculator();
//        获取字节码文件对象
        Class cls = c.getClass();
//        获取所有方法
        Method[] methods = cls.getMethods();

        //记录异常出现的次数，记录到bug.txt中
        int number = 0;
        BufferedWriter bw = new BufferedWriter(new FileWriter("bug.txt"));

        for (Method method : methods) {
            //        判断方法上是否有@Check注解
            if (method.isAnnotationPresent(Check.class)) {
                try {
                    method.invoke(c);
                } catch (Exception e) {
//                    捕获异常

//                    记录到文件
                    number++;

                    bw.write(method.getName() + "方法出异常了");
                    bw.newLine();
                    bw.write("异常的名称：" + e.getCause().getClass().getSimpleName());
                    bw.newLine();
                    bw.write("异常的原因" + e.getCause().getMessage());

                }
            }

        }
        bw.write("本次测试一共出现" + number + "次异常");
        bw.flush();
        bw.close();
    }
}
