package PengH.y2020.m03.d24.Demo170RedPackage;

public class User {
    private String name;
    private double money;

    public User() {
    }

    public User(String name, double money) {
        this.name = name;
        this.money = money;
    }
    public void show(){
    System.out.println(this.name+"余额为："+this.money);
}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
