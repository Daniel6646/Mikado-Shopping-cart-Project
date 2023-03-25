package assignments.servlets;
import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
public class  Servlet6 extends HttpServlet
{
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		Cookie[] c=request.getCookies();
		if(c!=null)
		{
			for (Cookie cu : c)
			{
				String s=cu.getName();
				if(s.equals("MyCookie"))
				{
					String s1=cu.getValue();
					pw.println("Hi "+s1);
				}
			}
		}
		else
		{
			pw.println("No cookies found");
		}
	}
}
/*
http://localhost:8080/Moni-Sneha/s6
*/