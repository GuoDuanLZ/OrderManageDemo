package servlet;

import bean.Product;
import dao.ProductDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wzly on 17-5-29.
 */
@WebServlet(name = "ProductAddServlet",urlPatterns = { "/ProductAddServlet" })
public class ProductAddServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String pname = request.getParameter("pname");
        String num = request.getParameter("pnum");
        int pnum = Integer.parseInt(num);
        String type = request.getParameter("type");
        String sprice = request.getParameter("price");
        int price = Integer.parseInt(sprice);
        String place = request.getParameter("place");
        String smid = request.getParameter("mid");
        int mid = Integer.parseInt(smid);
        Product product = new Product();
        product.setMid(mid);
        product.setName(pname);
        product.setNum(pnum);
        product.setType(type);
        product.setPlace(place);
        product.setPrice(price);
        ProductDao productDao = new ProductDao();
        System.out.println(product);
        productDao.insertProduct(product);
        request.getRequestDispatcher("/ProductListServlet").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
