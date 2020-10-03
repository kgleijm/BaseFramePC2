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


        for (int i = 0; i < 100; i++) {
            System.out.println("ServletLogin service");
        }

        try {

            String name = req.getParameter("name");
            String id_token = req.getParameter("id_token");
            String email = req.getParameter("email");

            for (int i = 0; i < 100; i++) {
                System.out.println(email + "logged in");
            }


            /*
            String idToken = req.getParameter("id_token");
            GoogleIdToken.Payload payLoad = IdTokenVerifierAndParser.getPayload(idToken);
            String name = (String) payLoad.get("name");
            String email = payLoad.getEmail();
            System.out.println("User name: " + name);
            System.out.println("User email: " + email);

            HttpSession session = req.getSession(true);
            session.setAttribute("userName", name);
            req.getServletContext()
                    .getRequestDispatcher("/welcome-page.jsp").forward(req, resp);

             */

        } catch (Exception e) {

            for (int i = 0; i < 100; i++) {
                System.out.println("failed");
            }
            throw new RuntimeException(e);
        }

        //RequestDispatcher view = req.getRequestDispatcher("PageTemplate/templateHTMLfile.html");
        //view.forward(req, res);

    }





}
