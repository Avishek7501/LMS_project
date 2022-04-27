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
                <th scope="col">Id</th>
                <th scope="col">Name</th>
                <th scope="col">Address</th>
                <th scope="col">DoB</th>
                <th scope="col">Contact</th>
                <th scope="col">Email</th>
                <th scope="col">Username</th>
                <th scope="col">Action</th>
              </tr>
            </thead>
            <tbody >
            <c:forEach items="${adminlists }" var="adminlist" >
                <tr>
                  <th  scope="row"> ${adminlist.adminid }</th>
                  <td> ${adminlist.name }</td>
                  <td> ${adminlist.address }</td>
                  <td> ${adminlist.dob }</td>
                  <td> ${adminlist.contact } </td>
                  <td> ${adminlist.email }</td>
                  <td> ${adminlist.username }</td>
                  <td>
                  <a class="link-primary"  href="${pageContext.request.contextPath }/admin/edit_admin?id=${adminlist.adminid }" >edit</a>
                  <a class="link-danger"  href="${pageContext.request.contextPath }/admin/delete_admin?id=${adminlist.adminid }" >delete</a>
                  </td>
                </tr>
                </c:forEach>
              </tbody>
        </table>
        </div>
    </div>

    
        
   
</body>
</html>