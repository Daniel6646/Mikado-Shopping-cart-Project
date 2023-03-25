package assignments.servlets;
import javax.servlet.*;
import java.io.*;
public class  Servlet1 extends GenericServlet
{
	public  void service(ServletRequest request,ServletResponse response) throws ServletException,IOException
	{
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.println("<b>Hello!!</b>");
	}
}

/*
web.xml
<servlet>
<servlet-name>ABC</servlet-name>
<servlet-class>assignments.servlets.Servlet1</servlet-class>
</servlet>
<servlet-mapping>
<servlet-name>ABC</servlet-name>
<url-pattern>/s1</url-pattern>
</servlet-mapping>

url:
http://localhost:8080/Moni-Sneha/s1

*/