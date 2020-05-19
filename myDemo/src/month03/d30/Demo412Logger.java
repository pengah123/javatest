package month03.d30;
/*日志案例
* */
public class Demo412Logger {
    //原始代码
/*    public static void showlog(int level,String message){
        if(level==1)
            System.out.println(message);
    }*/
//优化代码
    public static void showlog(int level,BuildMessage bs) {
        if (level == 1)
            System.out.println(bs.bulidmes());

    }
    public static void main(String[] args) {
        long t1=System.currentTimeMillis();
        String ms1="hellow";
        String ms2="World";
        showlog(2,()->{return ms1+ms2;});
        long t2=System.currentTimeMillis();
        System.out.println(t2-t1);
    }
}
