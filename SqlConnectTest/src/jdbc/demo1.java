package jdbc;

import java.sql.*;

public class demo1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//ע������
        Class.forName("com.mysql.jdbc.Driver");
//        ��ȡ���ݿ����Ӷ���Connection
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "root");
//       ����SQL���
        String sql="update employee set age=3 where id=2";
//        ��ȡִ��SQL���Ķ���statement
        Statement state = conn.createStatement();
//        ִ��sql,���ܷ��ؽ��
        int count=state.executeUpdate(sql);
//        ������
        System.out.println(count);
//        �ͷ���Դ
        state.close();
        conn.close();


    }


}
