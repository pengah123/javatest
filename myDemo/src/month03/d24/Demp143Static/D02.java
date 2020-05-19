package month03.d24.Demp143Static;
/*静态方法不属于对象，属于类
* 成员方法必须先创建对象再调用
* 静态方法可以通过类名称来调用*/
public class D02 {
    public static void main(String[] args) {
//        成员方法的调用方法
        MyClass myClass = new MyClass();
        myClass.method();
//        静态方法的调用方法
        myClass.methodStatic();
        MyClass.methodStatic();//推荐使用
//对于本类当中的静态方法，可以省略类名称
        //静态方法可以直接访问静态变量，但是不能直接访问非静态变量，因为静态的先被创建
    }
}
