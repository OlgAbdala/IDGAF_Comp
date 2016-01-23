
<%--
    Document   : postulantCompany
    Created on : 15 janv. 2016, 23:25:24
    Author     : OUTA
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Postulants </title>
        <link rel="stylesheet" type="text/css" href="css/accueilCompanyCSS.css">


    </head>
    <body>



        <table class="table1">
            <thead>
                <tr>
                    <th colspan="3"> Postulants pour chaque offre <c:out value="${Login}" /> </th>
                </tr>
                <tr>
                    <th>#</th>
                    <th colspan="2"> Listes des Stages </th>
                </tr>
            </thead>
            <tbody>

                <c:forEach items="${stages}" var="i" >
                    <c:set var="count" scope="page" value="${count + 1}" />

                    <tr>

                        <td> <c:out value="${count}" /> </td>


                        <td> <c:out value="${i}" /> </td>
                        <td>   <c:forEach items="${postulant}" var="j">
                    <li>   <c:out value="${j}" /> &nbsp;

                        <a class="btn btn-danger" href="#"> Voir CV </a>

                        &nbsp;
                        <a class="btn btn-danger" href="#"> Convoquer </a> </li>

                </c:forEach>
            </td>

        </tr>


    </c:forEach>

</tbody>
</table>
<center>

    <form method="post" action="/AfficheConvokServlet">
        <input class="plan-button1" type="submit" value="liste des convoquées ">

    </form>
    <br> <br> <br>
    <form method="post" action="/AccueilCompServlet">
        <input class="plan-button1" type="submit" value=" Retour  ">

    </form>
</center>
</body>
</html>
