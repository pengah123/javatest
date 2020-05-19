package month03.d24.Demp143Static;
//静态代码块
/*
*public class classname{
*   static{
*       //静态代码块内容
*   }
* }
* 特点：当第一次使用到本类时，静态代码块执行唯一的一次
 */
public class D03 {
    static{
        System.out.println("静态代码块执行！");
    }

    public D03() {
        System.out.println("构造方法执行！");
    }
}
