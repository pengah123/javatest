package month03.d30;

public class Demo411 {
    public static void main(String[] args) {
        show(new MyFunctionInterface() {
            @Override
            public void method() {
                System.out.println("使用匿名内部类重写接口中的抽象方法");
            }
        });
        show(()->
            System.out.println("使用匿名内部类重写接口中的抽象方法")
        );
    }
    public static void show(MyFunctionInterface myInter){
        myInter.method();
    }
}
