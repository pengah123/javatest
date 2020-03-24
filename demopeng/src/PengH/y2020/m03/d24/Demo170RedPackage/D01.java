package PengH.y2020.m03.d24.Demo170RedPackage;

import java.util.ArrayList;

public class D01 {
    public static void main(String[] args) {
        Manager m=new Manager("群主",100);
        employee e1=new employee("用户1",0);
        employee e2=new employee("用户2",0);
        employee e3=new employee("用户3",0);
        m.show();
        e1.show();
        e2.show();
        e3.show();

        ArrayList<Double> redList=new ArrayList<>();
        redList=m.send(20,1);
        e1.receive(redList);
        e2.receive(redList);
        e3.receive(redList);
        m.show();
        e1.show();
        e2.show();
        e3.show();
    }

}
