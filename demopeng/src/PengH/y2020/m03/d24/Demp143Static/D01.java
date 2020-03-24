package PengH.y2020.m03.d24.Demp143Static;
//static用来修饰成员变量，类的所有成员共享这个变量，不属于某一个对象
public class D01 {
    public static void main(String[] args) {
        Student pengh = new Student("pengh", 23);
        pengh.room="i班";
        System.out.println(pengh.getName()+"的年龄是："+pengh.getAge()+
                ";班级是："+pengh.room+";id是"+pengh.getId());
        Student Lisa = new Student("Lisa", 18);
        System.out.println(Lisa.getName()+"的年龄是："+Lisa.getAge()+
                ";班级是："+Lisa.room+";id是"+Lisa.getId());
    }
}

