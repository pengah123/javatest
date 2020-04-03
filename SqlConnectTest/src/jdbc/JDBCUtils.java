package jdbc;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.Properties;

/*jdbc������*/
public class JDBCUtils {

    private static String url;
    private static String user;
    private static String password;
    private static String driver;

    /*��̬������ȡ��Դ�����еı�����ֻ��ȡһ��*/
    static {
        Properties pro = new Properties();
        try {
            URL res=ClassLoader.getSystemResource("jdbc.properties");
            String path=res.getPath();
            pro.load(new FileReader(path));
            url = pro.getProperty("url");
            user = pro.getProperty("user");
            password = pro.getProperty("password");
            driver = pro.getProperty("driver");
            Class.forName(driver);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //    ��ȡconnection����
    public static Connection getCollection() throws SQLException {
        return DriverManager.getConnection(url,user,password);
    }

    //�ͷ���Դ
    public static void close(Statement stam, Connection conn) {
        if (stam != null) {
            try {
                stam.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void close(ResultSet rs, Statement stam, Connection conn) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (stam != null) {
            try {
                stam.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


}
