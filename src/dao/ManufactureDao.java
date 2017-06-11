package dao;

import bean.Manufacturer;
import until.Dbuntil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wzly on 17-6-3.
 */
public class ManufactureDao {
    public void AddManufacture(Manufacturer manufacturer){
        Connection conn = Dbuntil.getConnection();
        String sql = "insert into manufacture values(?,?,?,?)";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1,manufacturer.getMid());
            pst.setString(2,manufacturer.getMname());
            pst.setString(3,manufacturer.getMleader());
            pst.setString(4,manufacturer.getMphone());
            pst.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public List<Manufacturer> ListManufacture(){
        List<Manufacturer> manufacturerList = new ArrayList<Manufacturer>();
        Connection conn = Dbuntil.getConnection();
        String sql = "select * from manufacture order by mid asc";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()){
                Manufacturer manufacturer = new Manufacturer();
                manufacturer.setMid(rs.getInt(1));
                manufacturer.setMname(rs.getString(2));
                manufacturer.setMleader(rs.getString(3));

                System.out.println("****"+rs.getString(3));
                manufacturer.setMphone(rs.getString(4));
                manufacturerList.add(manufacturer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return manufacturerList;
    }

}
