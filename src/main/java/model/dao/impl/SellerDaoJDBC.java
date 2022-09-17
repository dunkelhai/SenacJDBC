package model.dao.impl;

import model.dao.SellerDao;
import model.entities.Seller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class SellerDaoJDBC implements SellerDao {
    private Connection conn;

    public SellerDaoJDBC(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insert(Seller obj) {

    }

    @Override
    public void update(Seller obj) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public Seller findById(Integer id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        try{
            st = conn.prepareStatement("" +
                    "select seller.*, department.Name as DepName" +
                    "from seller inner join department" +
                    "on seller.DepartmentId = department.Id" +
                    "where seller.Id = ?");
            st.setInt(1, id);
            rs = st.executeQuery();
        } catch (SQLException e){
            
        }

    }

    @Override
    public List<Seller> findAll() {
        return null;
    }
}
