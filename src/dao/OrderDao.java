package dao;

import bean.Order;
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
public class OrderDao {
    public void Addorder(Order order){
        Connection conn = Dbuntil.getConnection();
        String sql = "insert into Orders values(?,?,?,?,?,?)";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1,order.getOid());
            pst.setInt(2,order.getEid());
            pst.setInt(3,order.getCid());
            pst.setInt(4,order.getPid());
            pst.setInt(5,order.getMoney());
            pst.setInt(6,order.getOstate());
            pst.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public List<Order> ListOrder(){
        List<Order> orderList = new ArrayList<Order>();
        Connection conn = Dbuntil.getConnection();
        String sql = "select * from Detail_Order order by cid asc";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()){
                Order order = new Order();
                order.setOid(rs.getInt(1));
                order.setEid(rs.getInt(2));
                order.setCid(rs.getInt(3));
                order.setPid(rs.getInt(4));
                order.setMoney(rs.getInt(5));
                order.setOstate(rs.getInt(6));
                orderList.add(order);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return orderList;
    }

}
