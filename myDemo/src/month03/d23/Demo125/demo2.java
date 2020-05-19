package month03.d23.Demo125;

import java.util.ArrayList;

//自定义4个学生对象，添加到集合，并遍历
public class demo2 {
    public static void main(String[] args) {
        Student stu1=new Student("pengah",12);
        Student stu2=new Student("Lisa",22);
        Student stu3=new Student("Elea",40);
        ArrayList<Student> stu=new ArrayList<>();
        stu.add(stu1);
        stu.add(stu2);
        stu.add(stu3);
        for (int i = 0; i < stu.size(); i++) {
            System.out.println(stu.get(i).getName()+"的年龄是："+stu.get(i).getAge());
        }
    }




}
