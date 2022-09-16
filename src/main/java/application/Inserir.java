package application;

import db.DB;

import java.sql.*;
import java.text.SimpleDateFormat;

public class Inserir {
    public static void main(String[] args) {

        //INSERIR DADOS

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Connection conn = null;
        PreparedStatement st = null;
        try{
            conn = DB.getConnection();
//
//            st = conn.prepareStatement(
//                    "insert into seller " +
//                            "(Name, Email, BirthDate, BaseSalary, DepartmentId) " +
//                            "values " +
//                            "(?, ?, ?, ?, ?)",
//                    Statement.RETURN_GENERATED_KEYS);

//            st.setString(1, "Heins Loof");
//            st.setString(2, "teste@gmail.com");
//            st.setDate(3, new java.sql.Date(sdf.parse("22/05/1985").getTime()));
//            st.setDouble(4, 3000.00);
//            st.setInt(5, 2);

            st = conn.prepareStatement(
                    "insert into department (Name) values ('D1'),('D2')",
                    Statement.RETURN_GENERATED_KEYS);

            int rowsAffected = st.executeUpdate();

            if (rowsAffected > 0){
                ResultSet rs = st.getGeneratedKeys();
                while (rs.next()){
                    int id = rs.getInt(1);
                    System.out.println("Done! Id = " + id);
                }
            } else {
                System.out.println("No rows affected!");
            }

        } catch (SQLException e){
            e.printStackTrace();
        }finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }


    }
}
