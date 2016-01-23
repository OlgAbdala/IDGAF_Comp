<%-- 
    Document   : Portail
    Created on : 21 janv. 2016, 11:33:47
    Author     : OUTA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
  <head>
    <title></title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="css/accueilCompanyCSS.css">
    
  </head>
  <body>
      <center>
          
          <div>
          
          <form method="post"  action="/PortailCompServlet">
         Login  <input  type="text"  name="Login">
         <br>
         <br>
         <br>
         <br>
         Password <input type="password" name="Password">
         <br>
         <br>
         <br>
          <input type="submit" value="valider">
      </form>
          
      </div>
          
          
      </center>

      
  </body>
</html>



