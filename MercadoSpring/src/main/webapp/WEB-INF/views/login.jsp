<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html SYSTEM "http://www.thymeleaf.org/dtd/xhtml1-strict-thymeleaf-4.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
	  xmlns:th="http://www.thymeleaf.org">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="#" th:action ="@{/controller/login/result}" method="post">
		<table>
                <tr>
                    <td>Nombres:</td>
                    <td><input type="text" th:field="*{nombres}" /></td>
                </tr>
                <tr>
                    <td>Apellido Paterno:</td>
                    <td><input type="text" th:field="*{paterno}" /></td>
                </tr>
                <tr>
                    <td><button type="submit">Submit</button></td>
                </tr>
            </table>
	</form>

</body>
</html>