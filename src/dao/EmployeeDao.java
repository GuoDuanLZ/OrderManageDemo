package dao;

import bean.Employee;
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
public class EmployeeDao {
    public void AddEmployee(Employee employee){
        Connection conn = Dbuntil.getConnection();
        String sql = "insert into Employee values(?,?,?,?)";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1,employee.getEid());
            pst.setString(2,employee.getEname());
            pst.setString(3,employee.getEsex());
            pst.setString(4,employee.getEphone());
            pst.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public List<Employee> ListEmployee(){
        List<Employee> EmployeerList = new ArrayList<Employee>();
        Connection conn = Dbuntil.getConnection();
        String sql = "select * from Employee order by eid asc";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()){
                Employee employee = new Employee();
                employee.setEid(rs.getInt(1));
                employee.setEname(rs.getString(2));
                employee.setEsex(rs.getString(3));

                System.out.println("****"+rs.getString(3));
                employee.setEphone(rs.getString(4));
                EmployeerList.add(employee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return EmployeerList;
    }
}
