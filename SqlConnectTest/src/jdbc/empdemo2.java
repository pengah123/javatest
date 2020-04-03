package jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/*定义一个方法，查询employee 表的数据将其封装为对象，然后转载集合，返回
 * */
public class empdemo2 {
    public static void main(String[] args) {

        empdemo2 empdemo1 = new empdemo2();
        List<emp> emps = empdemo1.findAll();
        System.out.println(emps);
    }

    public List<emp> findAll() {
        Connection conn = null;
        Statement stam = null;
        ResultSet rs = null;
        List<emp> emps = new ArrayList<>();
        try {
            conn = JDBCUtils.getCollection();
            stam = conn.createStatement();
            String sql = "select * from employee";
            rs = stam.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                int age = rs.getInt(3);
                int step_id = rs.getInt(4);
                emps.add(new emp(id, name, age, step_id));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(rs, stam, conn);

        }
        return emps;
    }
}
