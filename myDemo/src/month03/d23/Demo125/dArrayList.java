package month03.d23.Demo125;

import java.util.ArrayList;

//长度可以发生变化的类：ArrayList<E>
//<>代表泛型，也就是集合中的所有元素是同一类型
//泛型只能是引用类型，不能是基本类型
//<>内部可以不写内容，但本身必须要写，左边的内容必须要写
public class dArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
//        默认值：[]
        System.out.println(list);
        list.add("pengah");
        System.out.println(list);
        list.add("kunkun");
        list.add("Lisa");
        System.out.println(list);
        System.out.println(list.get(1));//获取索引值所在值
        list.remove(2);//移除元素
        System.out.println(list);
        int size=list.size();//获取数组长度
        System.out.println(size);
//        ArrayList存放int型
        ArrayList<Integer> linstint=new ArrayList<>();
    }
}
