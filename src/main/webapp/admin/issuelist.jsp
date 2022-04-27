<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<link rel="stylesheet" href="../bootstrap/bootstrap-5/css/bootstrap.min.css">
<link rel="stylesheet" href="../bootstrap/custom/admin-custom.css">
<body>

<%@ include file="navbar.jsp" %>




    <div class="container panel formpanel">
 <div class="row">
     

        <table class="table table-hover">
            <thead>
              <tr>
                <th scope="col">Issue Id</th>
                <th scope="col">Book Title</th>
                <th scope="col">Book Id</th>
                <th scope="col">Issued To</th>
                <th scope="col">Issued Date</th>
                
              </tr>
            </thead>
            <tbody >
            <c:forEach items="${issuelists }" var="issue" >
                <tr>
                  <th  scope="row"> ${issue.issueid }</th>
                  <td> ${issue.title }</td>
                  <td> ${issue.bookid }</td>
                  <td> ${issue.membername }</td>
                  <td> ${issue.issuedate } </td>
                  
                </tr>
                </c:forEach>
              </tbody>
        </table>
        </div>
    </div>

    
        
   
</body>
</html>