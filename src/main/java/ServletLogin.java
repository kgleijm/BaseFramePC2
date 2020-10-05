import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdTokenVerifier;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.jackson.JacksonFactory;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class ServletLogin extends HttpServlet{


    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

        DatabaseManager.setup();

        for (int i = 0; i < 10; i++) {
            System.out.println("ServletLogin service");
        }


        try {

            String name = req.getParameter("name");
            String id_token = req.getParameter("id_token");
            String email = req.getParameter("email");

            for (int i = 0; i < 10; i++) {
                System.out.println(email + " logged in with token " + id_token);
            }

        } catch (Exception e) {

            for (int i = 0; i < 100; i++) {
                System.out.println("failed");
            }
            throw new RuntimeException(e);
        }

        RequestDispatcher view = req.getRequestDispatcher("LoginTemplate/templateHTMLfile.html");
        view.forward(req, res);

    }





}
