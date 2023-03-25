package assignments.servlets;
import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
public class  Servlet12 extends HttpServlet
{
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		request.setAttribute("name","Mikado");
		pw.println("Before");
		request.getRequestDispatcher("/s13").forward(request,response);
		pw.println("After");
	}
}