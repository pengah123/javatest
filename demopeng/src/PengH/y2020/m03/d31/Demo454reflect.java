package PengH.y2020.m03.d31;

public class Demo454reflect {
    public static void main(String[] args) throws Exception{
        //获取Class类对象的第一种方式
        Class cls1 = Class.forName("PengH.y2020.m03.d31.Person");
        System.out.println(cls1);
        //获取Class类对象的第二种方式
        Class<Person> cls2 = Person.class;
        System.out.println(cls2);
        //获取Class类对象的第二种方式
        Person p=new Person();
        Class cls3 = p.getClass();
        System.out.println(cls3);

        System.out.println(cls1==cls2);
        System.out.println(cls1==cls3);

    }
}
