package assignments.servlets;
import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
public class  Servlet14  extends HttpServlet
{
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		ServletContext sc=getServletContext();
		sc.setAttribute("name","Mikado");
		pw.println("Attribute set in ServletContext");
	}
}