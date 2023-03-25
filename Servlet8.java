package assignments.servlets;
import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
import java.util.*;
import java.util.Date;
public class  Servlet8 extends HttpServlet
{
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String  action=request.getParameter("action");
		if(action!=null && action.equals("invalidate"))
		{
			HttpSession hs=request.getSession();
			hs.invalidate();
			pw.println("<b>Your session has been invalidate");
			pw.println("<br>");
			String s="http://localhost:8080/Moni-Sneha/s8";
			pw.println("<a href=\""+response.encodeURL(s)+"\">");
			pw.println(" Start New Session</a>");
		}
		else
		{
			HttpSession hs=request.getSession();
			if(hs.isNew())
			pw.println("<b> New Session");
			else
			pw.println("<b> Old Session");
			pw.println("<br>");
			pw.println("<b>Session ID :"+hs.getId());
			pw.println("<br>");
			pw.println("<b> Creation Time"+new Date(hs.getCreationTime()));
			pw.println("<br>");
			pw.println("<b> Last Accessed Time:"+new Date(hs.getLastAccessedTime()));
			pw.println("<br>");
			pw.println("<b> Max Inactive Interval:"+hs.getMaxInactiveInterval());
			pw.println("<br>");
			String s="http://localhost:8080/Moni-Sneha/s8";
			String s1="http://localhost:8080/Moni-Sneha/s8?action=invalidate";
			pw.println("<a href=\""+response.encodeURL(s)+"\">");
			pw.println(" Reload</a>");
			pw.println("<br>");
			pw.println("<a href=\""+response.encodeURL(s1)+"\">");
			pw.println(" Invalidate Session</a>");
			hs.setAttribute("Cart",new Cart());
		}
	}
}
/*
http://localhost:8080/Moni-Sneha/s8
*/