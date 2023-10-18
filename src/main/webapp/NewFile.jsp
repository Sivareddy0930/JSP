<!--Directive tags-->
<!--Directive tags used to add the static html pages code into jsp.  And used to import -->
 <%@page import="java.util.*" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!--Scriplet tag-->
<!--Scriplet tag used to write java code in service method-->
<%int i=100; %>

<!--Expression tag-->
<!--Expression tag used to print the code.it same as out.println()-->
<%= i %>


<!--Decleration tag-->
<!--Decleration tag used to put java code outside service method. it like instance variables and methods.-->
<%! String s="Siva"; %>


<!--Scriplet tag-->
<!--Scriplet tag used to write java code in service method-->
<%  out.println("Hello,GM JAVA "); %>
</body>
</html>