package assignments.servlets;
import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
import java.sql.*;
public class  Servlet4 extends HttpServlet
{
	Connection con;
	public void init()
	{
		try
		{
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","mikado");
		}
		catch (Exception e)
		{
			System.out.print(e); 
		}
	}
	public  void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String s=request.getParameter("id");
		String s1=request.getParameter("name");
		String s2=request.getParameter("salary");
		try
		{
			PreparedStatement pstmt = con.prepareStatement("Insert into Employee values(?,?,?)");
			pstmt.setInt(1,Integer.parseInt(s));
			pstmt.setString(2,s1);
			pstmt.setDouble(3,Double.parseDouble(s2));
			int i=pstmt.executeUpdate();
			pw.println("<b>No of rows inserted="+i);
			pstmt.close();
		}
		catch (Exception e)
		{
			pw.println(e); 
		}
	}
	public void destroy()
	{
		try
		{
			con.close();
		}
		catch (Exception e)
		{
			System.out.println(e); 
		}
	}
}