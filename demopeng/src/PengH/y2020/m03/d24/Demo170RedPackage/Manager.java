package PengH.y2020.m03.d24.Demo170RedPackage;

import java.awt.geom.CubicCurve2D;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Random;

public class Manager extends User{
    public Manager() {
    }
    public Manager(String name,double money) {
        super(name,money);
    }
    public ArrayList<Double> send(double redpackeg, int count){
        ArrayList<Double> redList=new ArrayList<>();
        if(redpackeg>this.getMoney()){
            System.out.println("余额不足");
            return redList;
        }
        Random x=new Random();
        double index=0;
        this.setMoney(this.getMoney()-redpackeg);
        for (int i = 0; i < count-1; i++) {
            index=x.nextDouble()*redpackeg;
            redpackeg-=index;
            redList.add(index);
        }
        redList.add(redpackeg);
    return redList;
    }
}
