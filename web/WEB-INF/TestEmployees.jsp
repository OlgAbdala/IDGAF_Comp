<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Test Employees</title>
        <link type="text/css" rel="stylesheet" href="<c:url value="/inc/form.css"/>" />
    </head>
    <body>
        <h1>Tests Employees</h1>
		<h2>login(String login, String password)</h2>
		<p>${employeeLogin}</p><br>
		<h2>retrieveEmployeeFromMail(String mail)</h2>
		<p>${employeeFromMail }</p><br>
		<h2>listEmployees()</h2>
        <c:forEach items="${employeesList}" var="employee" varStatus="boucle">
            <p>${ boucle.count }. ${employee}</p>
        </c:forEach>
        <br>
    </body>
</html>