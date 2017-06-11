package dao;

import bean.Product;
import java.sql.*;
import until.Dbuntil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wzly on 17-5-28.
 */
public class ProductDao {
    public void insertProduct(Product product){
        Connection conn =null;
        String sql = "insert into Product values (?,?,?,?,?,?,?)";
        conn = Dbuntil.getConnection();
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1,product.getPid());
            pst.setInt(2,product.getMid());
            pst.setString(3, product.getName());
            pst.setInt(4,product.getNum());
            pst.setString(5,product.getType());
            pst.setString(6,product.getPlace());
            pst.setInt(7,product.getPrice());
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public List<Product> productList(){
        List<Product> products = new ArrayList<Product>();
        Connection conn = null;
        conn = Dbuntil.getConnection();
        String sql = "select * from Product order by pid desc";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Product product = new Product();
                product.setPid(rs.getInt(1));
                product.setMid(rs.getInt(2));
                product.setName(rs.getString(3));
                product.setNum(rs.getInt(4));
                product.setType(rs.getString(5));
                product.setPlace(rs.getString(6));
                product.setPrice(rs.getInt(7));
                products.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return products;
    }
}
