<%@ taglib uri="/WEB-INF/hello.tld" prefix="examples" %>
<html>
<body>
<p>This is a static output. Tag output is shown in italics</p>
<p><i>
<examples:hello>
hi how r u?<%= 3*3 %>
</examples:hello>
</i></p>
<p>Closing of th tag without the body will have the same effect</p>
<p><i>
<examples:hello/>
</i></p>
</body>
</html>