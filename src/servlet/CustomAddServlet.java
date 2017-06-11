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

/**
 * Created by wzly on 2017/6/8.
 */
@WebServlet(name = "CustomAddServlet",urlPatterns = {"/CustomAddServlet"})
public class CustomAddServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String cname = request.getParameter("cname");
        String cemail = request.getParameter("cemail");
        String scphone = request.getParameter("cphone");

        Customer customer = new Customer();
        customer.setCname(cname);
        customer.setCemail(cemail);
        customer.setCphone(scphone);
        CustomerDao customerDao = new CustomerDao();
        customerDao.AddCustomer(customer);
        request.getRequestDispatcher("/CustomListServlet").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
