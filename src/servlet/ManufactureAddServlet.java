package servlet;

import bean.Manufacturer;
import dao.ManufactureDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by wzly on 17-6-3.
 */
@WebServlet(name = "ManufactureAddServlet",urlPatterns = {"/ManufactureAdd"})
public class ManufactureAddServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String mname = request.getParameter("mname");
        String mleader = request.getParameter("mleader");
        String smphone = request.getParameter("mphone");

        Manufacturer manufacturer = new Manufacturer();
        manufacturer.setMname(mname);
        manufacturer.setMleader(mleader);
        manufacturer.setMphone(smphone);
        ManufactureDao manufactureDao = new ManufactureDao();
        manufactureDao.AddManufacture(manufacturer);
        request.getRequestDispatcher("/ManufactureList").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
