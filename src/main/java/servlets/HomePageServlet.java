package servlets;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import resourceServer.ResourceServerI;
import resources.TestResource;
import sax.ReadXMLFileSAX;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class HomePageServlet extends HttpServlet {
    static final Logger logger = LogManager.getLogger(HomePageServlet.class.getName());
    public static final String PAGE_URL = "/resources";
    private final ResourceServerI resourceServer;

    public HomePageServlet(ResourceServerI resourceServer) {
        this.resourceServer = resourceServer;
    }

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().println("You just done a get response");
        logger.info("Get required");
    }

    public void doPost(HttpServletRequest request,
                       HttpServletResponse response) throws ServletException, IOException {
        String path = request.getParameter("path");
        logger.info("Post required");
        TestResource srcIn = (TestResource) ReadXMLFileSAX.readXML(path);
        response.getWriter().println("Authorized");
        resourceServer.setResource(srcIn);
        response.setStatus(HttpServletResponse.SC_OK);
    }
}
