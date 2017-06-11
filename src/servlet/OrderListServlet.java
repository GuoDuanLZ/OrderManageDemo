package servlet;

import bean.Order;
import dao.OrderDao;

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
@WebServlet(name = "OrderListServlet",urlPatterns = {"/OrderListServlet"})
public class OrderListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        request.setCharacterEncoding("utf-8");

        OrderDao orderDao = new OrderDao();
        List<Order> orderList = new ArrayList<Order>();
        orderList = orderDao.ListOrder();

        request.setAttribute("orders",orderList);
        request.getRequestDispatcher("OrderList.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
