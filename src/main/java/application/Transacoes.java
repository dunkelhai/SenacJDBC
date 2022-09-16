package application;

import db.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Transacoes {
    public static void main(String[] args) {

        Connection conn = null;
        Statement st = null;
        try{
            conn = DB.getConnection();

            st = conn.createStatement();

            int rows1 = st.executeUpdate("update seller" +
                    "set BaseSalary = 1090.00 where DepartmentId = 1");

            int x = 1;
            if (x < 2) {
                throw new SQLException("Erro falso");
            }

            int rows2 = st.executeUpdate("update seller" +
                    "set BaseSalary = 2090.00 where DepartmentId = 2");

            System.out.println("rows1 " + rows1);
            System.out.println("rows2 " + rows2);

        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }


    }
}
