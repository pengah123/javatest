package month03.d30;

import java.util.function.Consumer;

public class Demo418Consumer {
    public static void method(String name, Consumer<String> con){
        con.accept(name);
    }

    public static void main(String[] args) {
        method("赵丽颖",(String name)->{
            String rename=new StringBuilder(name).reverse().toString();
            System.out.println(rename);
        });
    }
}
