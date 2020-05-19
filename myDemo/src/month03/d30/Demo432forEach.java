package month03.d30;

import java.util.stream.Stream;

public class Demo432forEach {
    public static void main(String[] args) {
        Stream<String> stream= Stream.of("pengh","lisi","lisa","shuxin");
//        stream.forEach(name-> System.out.println(name));//使用了consumer函数式接口
        Stream<String> stream1=Stream.of("1","2","3","4");
        Stream<Integer> stream2=stream1.map(s->Integer.parseInt(s));//使用了supplier函数式接口
        stream2.forEach((Integer i)-> System.out.println(i));
        System.out.println(stream.count());
    }
}
