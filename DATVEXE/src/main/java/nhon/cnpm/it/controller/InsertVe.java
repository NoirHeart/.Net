package nhon.cnpm.it.controller;

import nhon.cnpm.it.service.TripService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "InsertVe", value = "/InsertVe")
public class InsertVe extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String listVe = request.getParameter("ve");
        String[] list = listVe.trim().split(";");
        String bus = request.getParameter("bus");
        String trip = request.getParameter("trip");
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        StringBuilder check = null;

        for (String ve : list) {
            if (!TripService.getInstance().checkCart(ve, trip, bus)) {
                check.append(ve+";");
            } else {
                TripService.getInstance().addVeToCart(email, phone, ve, name, trip, bus);
            }
        }
        if(check!=null) {
            request.setAttribute("errorMessage", "ghế :" + check.toString() + "đã được chọn ở giỏ hàng của bạn");
            response.sendRedirect("/DatVeXe/ChosenSit?id" + trip);
        }else {
            response.sendRedirect("listTour.jsp");
        }
    }
}