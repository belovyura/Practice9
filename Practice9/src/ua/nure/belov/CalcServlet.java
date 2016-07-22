package ua.nure.belov;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcServlet
 */
@WebServlet("/bbb")
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalcServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String xAsString = request.getParameter("x");
		String op = request.getParameter("param");
		String yAsString = request.getParameter("y");
		int x = Integer.parseInt(xAsString); 
		int y = Integer.parseInt(yAsString);
		int res = 0;		
		switch (op) {
		case "+":
			res = x + y;
			break;
		case "-":
			res = x - y;
			break;

		default:
			break;
		}

		response.getWriter().println("<html><body>" + res + "<br/>" +
				"<a href='inp.html'>back</a>" + "</body></html>");
	}

}
