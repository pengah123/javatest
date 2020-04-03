package jdbc;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class demo5 {
    public static void main(String[] args) throws SQLException {
        DataSource ds=new ComboPooledDataSource();

        Connection coon=ds.getConnection();


        System.out.println(coon);
    }
}
