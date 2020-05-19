package month03.d23.Demo113;
/*创建一个标准的类
1.所有成员变量为private
2.每一个成员变量有getter/setter方法
3.一个无参数构造方法
4.一个全参数构造方法
* */
public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
