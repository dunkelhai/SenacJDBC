package application.demos;

import db.DB;

import java.sql.*;

public class Atualizar {
    public static void main(String[] args) {

        //ATUALIZAR DADOS

        Connection conn = null;
        PreparedStatement st = null;
        try{
            conn = DB.getConnection();

            st = conn.prepareStatement(
                    "update seller " +
                            "set BaseSalary = BaseSalary + ? " +
                            "where " +
                            "(DepartmentId = ?)");
            st.setDouble(1, 200.00);
            st.setInt(2,2);

            int rowsAffected = st.executeUpdate();

            System.out.println("Done! Rows affected: " + rowsAffected);
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }


    }
}
