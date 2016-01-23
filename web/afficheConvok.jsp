<%--
    Document   : convokeCompany
    Created on : 15 janv. 2016, 23:25:11
    Author     : OUTA
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Lists des Convoquées </title>
<link rel="stylesheet" type="text/css" href="css/accueilCompanyCSS.css">


    </head>
    <body>



        <table class="table1">
  <thead>
    <tr>
      <th colspan="3"> Les convoquées pour les entretiens <c:out value="${Login}" /> </th>
    </tr>
    <tr>
      <th>#</th>
      <th > Listes des Stages </th>
     <th> Etudiants convoquées par offre </th>

    </tr>
  </thead>
  <tbody>

      <c:forEach items="${stages}" var="i" >
      <c:set var="count" scope="page" value="${count + 1}" />

    <tr>

      <td> <c:out value="${count}" /> </td>


      <td> <c:out value="${i}" /> </td>
      <td>
    <c:forEach items="${convoke}" var="j">
      <ul style="text-align: left">
         <li><c:out value="${j}" />
             &nbsp; &nbsp; &nbsp;  &nbsp; &nbsp; &nbsp;  &nbsp; &nbsp; &nbsp;
             <a  class="btn btn-danger" href="#"> Entretien Validé </a>
              &nbsp; &nbsp;

             <a  class="btn btn-danger" href="#"> Entretien Non Validé </a> </li>
</ul>
          </c:forEach>
 </c:forEach>
        </td>

    </tr>




            </tbody>
</table>
<center>
     <form  method="post" action="/AffichePostulantsServlet">
            <input class="plan-button2" type="submit" value="liste des postulants ">

           </form>

<form method="post" action="/AccueilCompServlet">
            <input class="plan-button1" type="submit" value=" Retour  ">

</form>


    </center>
    </body>
</html>
