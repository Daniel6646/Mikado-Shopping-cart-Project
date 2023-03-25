<%@ page import="com.mikado.Counter" %>
<jsp:useBean id="count" scope="session" class="com.mikado.Counter" />
<jsp:setProperty name="count" property="count" param="count" />
<jsp:getProperty name="count" property="count"/>
<% out.println(count.getCount()); %>