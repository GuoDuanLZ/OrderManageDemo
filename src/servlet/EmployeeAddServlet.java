package servlet;

import bean.Employee;
import dao.EmployeeDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by wzly on 2017/6/8.
 */
@WebServlet(name = "EmployeeAddServlet" ,urlPatterns = {"/EmployeeAddServlet"})
public class EmployeeAddServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String ename = request.getParameter("ename");
        String esex = request.getParameter("esex");
        String sephone = request.getParameter("ephone");
        Employee employee = new Employee();
        employee.setEname(ename);
        employee.setEsex(esex);
        employee.setEphone(sephone);
        EmployeeDao employeeDao = new EmployeeDao();
        employeeDao.AddEmployee(employee);
        request.getRequestDispatcher("/EmployeeListServlet").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
