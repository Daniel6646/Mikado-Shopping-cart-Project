<%@ page import="java.util.Date" %><%--page directive tag--%>
<%= new java.util.Date() %><%--Expression tag--%>
<br>
<%-- <%= new Date() %> --%>
<br>
<%@ include file="Header.html" %>
<br>
<% if(Math.random()<0.5)
{
	out.println("HI");
}
else
{
	out.println("BYE");
}
%>
<br>
<% if(Math.random()<0.5) { %>
<b> HI</>
<% } else {%>
<b>BYE</b>
<% } %>
<br>
<%! int count;
public int getCount()
{
	return count++;
}
%>
<% out.println(getCount()); %>

<%--servlet:--%>
<%-- if(Math.random()<0.5) { --%>
<%--       out.write("\r\n");--%>
  <%--     out.write("<b> HI</>\r\n");--%>
<%--  } --%>
<%--       out.write('\r');  error--%>
 <%--      out.write('\n');  error--%>
<%--  else { --%>
<%--       out.write("\r\n");--%>
<%--       out.write("<b>BYE</b>\r\n");--%>
<%--  } --%>


<%-- save to: root folder--%>
<%--browser: http://localhost:8080/Moni-Sneha/MyJsp.jsp--%>
<%--O/P: Fri Mar 08 20:00:03 IST 2019--%>