package nhon.cnpm.it.controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "InsertVe", value = "/InsertVe")
public class InsertVe extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String listVe= request.getParameter("ve");
        String[] list= listVe.trim().split(" ");
        String name= request.getParameter("name");
        String email= request.getParameter("email");
        String phone= request.getParameter("phone");
        for(String ve: list ){
            
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
