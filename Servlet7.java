package assignments.servlets;
import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
import java.util.*;
public class  Servlet7 extends HttpServlet
{
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		HttpSession hs=request.getSession();
		String s=(String)hs.getAttribute("count");
		if(s==null)
		{
			pw.println("This is your first visit");
			hs.setAttribute("count","1");
			hs.setAttribute("date",new Date());
		}
		else
		{
			int i=Integer.parseInt(s);
			i++;
			pw.println("This is your visit no. "+i);
			Date d=(Date)hs.getAttribute("date");
			pw.println("<br/>");
			pw.println("You last visited on "+d);
			hs.setAttribute("count",String.valueOf(i));
			hs.setAttribute("date",new Date());
		}
	}
}
/*
http://localhost:8080/Moni-Sneha/s7
*/