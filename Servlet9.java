package assignments.servlets;
import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
import java.util.*;
import java.util.Date;
public class  Servlet9 extends HttpServlet
{
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		HttpSession hs=request.getSession();
		if(hs==null)
		{
			pw.println("Session Expired");
		}
		else
		{
			if(hs.invalidate())
				pw.println("Cart not found");
			else
				pw.println("This is your cart");
		}
	}
}









