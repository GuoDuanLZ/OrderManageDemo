package servlet;

import bean.Customer;
import bean.Order;
import dao.CustomerDao;
import dao.OrderDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by wzly on 2017/6/8.
 */
@WebServlet(name = "OrderAddServlet",urlPatterns = {"/OrderAddServlet"})
public class OrderAddServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String spid = request.getParameter("pid");
        String soprice = request.getParameter("oprice");
        String scid = request.getParameter("cid");
        String seid = request.getParameter("eid");
        String sostate = request.getParameter("ostate");

        int pid = Integer.parseInt(spid);
        int oprice = Integer.parseInt(soprice);
        int cid = Integer.parseInt(scid);
        int eid = Integer.parseInt(seid);
        int ostate = Integer.parseInt(sostate);
        Order order = new Order();
        order.setCid(cid);
        order.setEid(eid);
        order.setPid(pid);
        order.setMoney(oprice);
        order.setOstate(ostate);
        OrderDao orderDao = new OrderDao();
        orderDao.Addorder(order);
        request.getRequestDispatcher("/OrderListServlet").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
