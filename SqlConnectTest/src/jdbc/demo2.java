package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


/*
* 通过键盘录入用户名和密码
* 判断用户是否登陆成功*/
public class demo2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String name=sc.nextLine();
        System.out.println("请输入密码");
        String password=sc.nextLine();

        demo2 d2 = new demo2();
        if(d2.login(name,password))
        System.out.println("登陆成功");
        else System.out.println("登陆失败");
    }
    /*登陆方法
    * */
    public boolean login(String username,String password){
        if(username==null||password==null){
            return false;
        }
        Connection conn=null;
        Statement stam=null;
        ResultSet rs=null;
        try {
            conn=JDBCUtils.getCollection();
            stam=conn.createStatement();

           String sql="select * from user where name='"+username+"'&& password='"+password+"'";

           rs=stam.executeQuery(sql);

           return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(rs,stam,conn);
        }


        return false;
    }
}
