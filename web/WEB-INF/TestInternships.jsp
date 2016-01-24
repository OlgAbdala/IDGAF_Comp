<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Test Internships</title>
        <link type="text/css" rel="stylesheet" href="<c:url value="/inc/form.css"/>" />
    </head>
    <body>
        <h1>Tests Internships</h1>
		<h2>retrieveAllInternships()</h2>
        <c:forEach items="${allInternships}" var="internship" varStatus="boucle">
            <p>${ boucle.count }. ${internship}</p>
        </c:forEach>
        <br>
        <h2>retrieveInternship(long ID)</h2>
        <p>${internshipFromID}</p>
    </body>
</html>