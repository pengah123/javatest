package PengH.y2020.m03.d24.Demp143Static;

/*创建一个标准的类
1.所有成员变量为private
2.每一个成员变量有getter/setter方法
3.一个无参数构造方法
4.一个全参数构造方法
* */
public class Student {

    private String name;
    private int age;
    private int id;
    static String room;
    public static int idcounter=0;
    public Student() {
        this.id=++idcounter;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id=++idcounter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
