package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class demo4 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement stm1 = null;
        PreparedStatement stm2 = null;
        try {
            conn = JDBCUtils.getCollection();
            conn.setAutoCommit(false);
            String sql1 = "update account set money=money-? where id=?";
            String sql2 = "update account set money=money+? where id=?";

            stm1 = conn.prepareStatement(sql1);
            stm2 = conn.prepareStatement(sql2);

            stm1.setInt(1, 500);
            stm1.setInt(2, 1);
            stm2.setInt(1, 500);
            stm2.setInt(2, 2);

            stm1.executeUpdate();
            int i=3/0;
            stm2.executeUpdate();
            conn.commit();

        } catch (Exception e) {

            try {
                if (conn != null)
                    conn.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            JDBCUtils.close(stm1, conn);
            JDBCUtils.close(stm2, null);
        }
    }
}
