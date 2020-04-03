package jdbc;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/*
spring jdbc
jdbctemplete*/
public class demo7 {
    public static void main(String[] args) throws Exception {

        JdbcTemplate template = new JdbcTemplate(new ComboPooledDataSource());
        String sql ="update account set money=2000 where id=?";
        int count=template.update(sql,1);
        System.out.println(count);
    }
}
