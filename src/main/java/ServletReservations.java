import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

public class ServletReservations extends HttpServlet{

    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {


        String email = req.getParameter("email");


        for (int i = 0; i < 10; i++) {
            System.out.println(email + " sent reservations request to ReservationServlet");
        }



        //RequestDispatcher view = req.getRequestDispatcher("ReservationsTemplate/templateHTMLfile.jsp");
        //view.forward(req, res);
    }
}
