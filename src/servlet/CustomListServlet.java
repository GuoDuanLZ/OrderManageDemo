package servlet;

import bean.Customer;
import bean.Employee;
import dao.CustomerDao;
import dao.EmployeeDao;

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
@WebServlet(name = "CustomListServlet",urlPatterns = {"/CustomListServlet"})
public class CustomListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

        CustomerDao customerDao = new CustomerDao();
        List<Customer> customerList = new ArrayList<Customer>();

        customerList = customerDao.ListCustomer();

        request.setAttribute("customers",customerList);

        request.getRequestDispatcher("CustomList.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
