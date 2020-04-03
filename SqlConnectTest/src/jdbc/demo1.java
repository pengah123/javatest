package jdbc;

import java.sql.*;

public class demo1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//注册驱动
        Class.forName("com.mysql.jdbc.Driver");
//        获取数据库连接对象Connection
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "root");
//       定义SQL语句
        String sql="update employee set age=3 where id=2";
//        获取执行SQL语句的对象，statement
        Statement state = conn.createStatement();
//        执行sql,接受返回结果
        int count=state.executeUpdate(sql);
//        处理结果
        System.out.println(count);
//        释放资源
        state.close();
        conn.close();


    }


}
