package dao;

import bean.Customer;
import until.Dbuntil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wzly on 2017/6/8.
 */
public class CustomerDao {
    public void AddCustomer(Customer customer){
        Connection conn = Dbuntil.getConnection();
        String sql = "insert into Custom values(?,?,?,?)";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1,customer.getCid());
            pst.setString(2,customer.getCname());
            pst.setString(3,customer.getCphone());
            pst.setString(4,customer.getCemail());
            pst.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public List<Customer> ListCustomer(){
        List<Customer> customerList = new ArrayList<Customer>();
        Connection conn = Dbuntil.getConnection();
        String sql = "select * from Custom order by cid asc";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()){
                Customer customer = new Customer();
                customer.setCid(rs.getInt(1));
                customer.setCname(rs.getString(2));
                customer.setCphone(rs.getString(3));
                customer.setCemail(rs.getString(4));
                customerList.add(customer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerList;
    }
}
