package month03.d23;

public class demo109Person {
    String name;
    private int age;
    public void show(){
        System.out.println("我叫："+name+"年龄"+age);
    }
    public void setAge(int num){
        if(num<100&&num>0)
            age=num;
        else System.out.println("请输入有效年龄");
    }

    public int getAge() {
        return age;
    }
}
