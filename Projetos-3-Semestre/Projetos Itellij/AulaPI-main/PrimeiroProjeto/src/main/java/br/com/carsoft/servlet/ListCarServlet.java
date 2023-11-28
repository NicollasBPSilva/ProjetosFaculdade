package br.com.carsoft.servlet;

import br.com.carsoft.dao.CarDao;
import br.com.carsoft.model.Car;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ListCarServlet extends HttpServlet {

    protected void doGet(HttpServletRequest servletRequest, HttpServletResponse servletResponse) throws ServletException, IOException{

        List<Car> cars = new CarDao().findAllCars();

        servletRequest.setAttribute("cars", cars);
        servletRequest.getRequestDispatcher("dashboard.jsp").forward(servletRequest, servletResponse);

        super.doGet(servletRequest, servletResponse);
    }
}
