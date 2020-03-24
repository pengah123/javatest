package PengH.y2020.m03.d24.Demo170RedPackage;

import java.util.ArrayList;
import java.util.Random;

public class employee extends User{
    public employee() {
    }
    public employee(String name,double money) {
        super(name,money);
    }
    public void receive(ArrayList<Double> redList){
        if(redList.size()==0){
            System.out.println(this.getName()+":不好意思，红包发完了！");
        }
        else {
            Random x = new Random();
            int index = x.nextInt(redList.size());
            double getmoney = redList.remove(index);
            double money = this.getMoney();
            this.setMoney(money + getmoney);
        }
    }

}
