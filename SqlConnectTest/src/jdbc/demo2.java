package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


/*
* ͨ������¼���û���������
* �ж��û��Ƿ��½�ɹ�*/
public class demo2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("�������û���");
        String name=sc.nextLine();
        System.out.println("����������");
        String password=sc.nextLine();

        demo2 d2 = new demo2();
        if(d2.login(name,password))
        System.out.println("��½�ɹ�");
        else System.out.println("��½ʧ��");
    }
    /*��½����
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
