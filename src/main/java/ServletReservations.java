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
//        PrintWriter printWriter=res.getWriter();
//
//        printWriter.print("<div class=\"container \" style=\"width:90%; margin-top:2%\">");
//        printWriter.print("<head>");
//
//        printWriter.print("<script src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\" integrity=\"sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n\" crossorigin=\"anonymous\"></script>");
//        printWriter.print("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>");
//        printWriter.print("<link rel='stylesheet' href='https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css' integrity='sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh' crossorigin='anonymous'>");
//        printWriter.print("<script src=\"https://kit.fontawesome.com/b20420d4e6.js\" crossorigin=\"anonymous\"></script>");
//
//        printWriter.print("</head>");
//        printWriter.print("<table class='table table-bordered'>");
//        printWriter.print("<thead class='thead-dark'>");
//        printWriter.print("<tr><th scope='col'>Id</th><th scope='col'>Name</th><th scope='col'>Email</th>"
//                + "<th scope='col'>Edit</th><th scope='col'>Delete</th></tr>");
//
//        Connection database = null;
//        try{
//            Class.forName("org.postgresql.Driver");
//            database = DriverManager
//                    .getConnection("jdbc:postgresql://localhost:5432/officePlanagerData",
//                            "BaseFramePC", "none");
//
//            System.out.println("Database sucessfully connected");
//            PreparedStatement ps = database.prepareStatement("select * from loginattempts");
//            ResultSet rs = ps.executeQuery();
//
//            while (rs.next()) {
//                String m_name = rs.getString("attime");
//                String m_dept = rs.getString("email");
//                String m_jobtitle = rs.getString("loginname");
//                printWriter.println("<tr>" +
//                        "<td>" + m_name + "</td>" +
//                        "<td>" + m_dept + "</td>" +
//                        "<td>" + m_jobtitle + "</td>" +
//                        "<td><a href='EditServlet?id=" + m_name + "'><i class=\"fas fa-edit\"></i></a></td>" +
//                        "<td><a href='DeleteServlet?id=" + m_name + "'><i class=\"fas fa-trash-alt\"></i></a></td>" +
//                        "</tr>");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.err.println(e.getClass().getName()+": "+e.getMessage());
//            System.out.println("Couldn't open database connection, are the username and password correct?");
//            System.exit(0);
//        }
//
//        printWriter.print("</table>");
//        printWriter.print("</div>");

        String name = req.getParameter("name");
        String id_token = req.getParameter("id_token");
        String email = req.getParameter("email");

        System.out.println(email + " logged in with token " + id_token + " ReservationServlet");

        RequestDispatcher view = req.getRequestDispatcher("ReservationsTemplate/templateHTMLfile.jsp");
        view.forward(req, res);
    }
}
