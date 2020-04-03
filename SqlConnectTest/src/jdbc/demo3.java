package jdbc;

import java.sql.*;
import java.util.Scanner;


/*
使用prepareStatement对象
* 通过键盘录入用户名和密码
* 判断用户是否登陆成功*/
public class demo3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String name = sc.nextLine();
        System.out.println("请输入密码");
        String password = sc.nextLine();

        demo3 d2 = new demo3();
        if (d2.login(name, password))
            System.out.println("登陆成功");
        else System.out.println("登陆失败");
    }

    /*登陆方法
     * */
    public boolean login(String username, String password) {
        if (username == null || password == null) {
            return false;
        }
        Connection conn = null;
        PreparedStatement stam = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtils.getCollection();


            String sql = "select * from user where name=? && password=?";
            stam = conn.prepareStatement(sql);
            stam.setString(1, username);
            stam.setString(2, password);
            rs = stam.executeQuery();

            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(rs, stam, conn);
        }


        return false;
    }
}
