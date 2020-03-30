package PengH.y2020.m03.d30;

public class Demo443 {
    public static void printString(Printable p){
        p.print("hellow");
    }

    public static void main(String[] args) {
        printString(s -> {
            MethodReeObject obj=new MethodReeObject();
            obj.printUpperString(s);
        });
/*        MethodReeObject obj=new MethodReeObject();
        printString(obj::printUpperString);*/
        printString(MethodReeObject::printUpperString);
    }
}
