package assignments.servlets;
import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
public class  Servlet13 extends HttpServlet
{
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String s=(String)request.getAttribute("name");
		pw.println("Hello"+s);
	}
}