package month03.d30;

import java.util.function.Consumer;

public class Demo419andThen {
    public static void main(String[] args) {
        method("hello",(t)->{
            System.out.println(t.toUpperCase());
        },(x)->{
            System.out.println(x.toLowerCase());
        });
    }
    public static void method(String s, Consumer<String> con1,Consumer<String> con2){
        con1.andThen(con2).accept(s);
    }
}
