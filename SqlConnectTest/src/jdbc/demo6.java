package jdbc;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

/*druid 连接池对象*/
public class demo6 {
    public static void main(String[] args) throws Exception {
        Properties pro = new Properties();
        InputStream is = demo6.class.getClassLoader().getResourceAsStream("druid.properties");
        pro.load(is);
        DataSource ds = DruidDataSourceFactory.createDataSource(pro);

        Connection coon=ds.getConnection();
        System.out.println(coon);
    }
}
