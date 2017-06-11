package servlet;

import bean.Manufacturer;
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
 * Created by wzly on 17-6-3.
 */
@WebServlet(name = "ManufactureListServlet",urlPatterns = {"/ManufactureList"})
public class ManufactureListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

        ManufactureDao manufactureDao = new ManufactureDao();
        List<Manufacturer> manufacturerList = new ArrayList<Manufacturer>();

        manufacturerList = manufactureDao.ListManufacture();

        request.setAttribute("manufactures",manufacturerList);

        request.getRequestDispatcher("ManufactureList.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
