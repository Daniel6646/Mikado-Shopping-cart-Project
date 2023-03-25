package assignments.servlets;
import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
public class  Servlet3 extends HttpServlet
{
	String clientCompanyName;
	public void init()
	{
		ServletConfig sc=getServletConfig();
		clientCompanyName=sc.getInitParameter("name");
	}
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.println("Welcome to  "+clientCompanyName);
	}
}