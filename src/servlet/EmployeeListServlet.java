package servlet;

import bean.Employee;
import bean.Manufacturer;
import dao.EmployeeDao;
import dao.ManufactureDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wzly on 2017/6/8.
 */
@WebServlet(name = "EmployeeListServlet",urlPatterns = {"/EmployeeListServlet"})
public class EmployeeListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

        EmployeeDao employeeDao = new EmployeeDao();
        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList = employeeDao.ListEmployee();

        request.setAttribute("employees",employeeList);

        request.getRequestDispatcher("EmployeeList.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
