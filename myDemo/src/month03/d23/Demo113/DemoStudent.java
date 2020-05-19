package month03.d23.Demo113;

public class DemoStudent {
    public static void main(String[] args) {
        Student stu1=new Student();
        stu1.setName("赵丽颖");
        stu1.setAge(22);
        Student stu2=new Student("古力娜扎",22);
        System.out.println(stu1.getName()+"的年龄是："+stu1.getAge()+"岁。");
        System.out.println(stu2.getName()+"的年龄是："+stu2.getAge()+"岁。");
    }
}
