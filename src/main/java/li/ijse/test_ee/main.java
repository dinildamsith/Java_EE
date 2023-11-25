package li.ijse.test_ee;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class main extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("Main");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String city = getServletContext().getInitParameter("city");
        System.out.println(city);


        int number = Integer.parseInt(getServletContext().getInitParameter("number"));

        if (number%2 ==0){
            System.out.println("This Number Even");
        }else{
            System.out.println("Note Even");
        }
    }


}