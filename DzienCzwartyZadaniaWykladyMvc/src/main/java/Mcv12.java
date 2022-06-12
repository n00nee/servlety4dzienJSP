import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

@WebServlet("/mvc12")
public class Mcv12 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String start = req.getParameter("start");
        String end = req.getParameter("end");

        if (Objects.nonNull(start) && Objects.nonNull(end)) {
            int intStart = Integer.parseInt(start) + 10;
            int intEnd = Integer.parseInt(end) + 10;

            req.setAttribute("start", intStart);
            req.setAttribute("end", intEnd);
        }

        getServletContext().getRequestDispatcher("/jsp2.jsp")
                .forward(req, resp);

    }
}
