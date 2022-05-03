<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

Cookie[] cookies = request.getCookies();

for(Cookie cookie: cookies) {
    
// out nesnesi ile HTML sayfa icerigine metin yazdirilir.
    out.println( cookie.getName() + "  "+ cookie.getValue() + "</br>");
	
}
// String deneme = (String) request.getCookies()[1].getValue();
// out.println(deneme);
 
%>
</body>
</html>