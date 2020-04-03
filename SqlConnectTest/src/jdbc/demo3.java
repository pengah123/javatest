package jdbc;

import java.sql.*;
import java.util.Scanner;


/*
ʹ��prepareStatement����
* ͨ������¼���û���������
* �ж��û��Ƿ��½�ɹ�*/
public class demo3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("�������û���");
        String name = sc.nextLine();
        System.out.println("����������");
        String password = sc.nextLine();

        demo3 d2 = new demo3();
        if (d2.login(name, password))
            System.out.println("��½�ɹ�");
        else System.out.println("��½ʧ��");
    }

    /*��½����
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
