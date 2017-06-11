package servlet;

import bean.Product;
import dao.ProductDao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wzly on 17-5-29.
 */
public class ProductListServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

        ProductDao productDao = new ProductDao();
        List<Product> products = new ArrayList<Product>();
        products = productDao.productList();

        request.setAttribute("products",products);
        request.getRequestDispatcher("ProductList.jsp").forward(request,response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request,response);
    }
}
