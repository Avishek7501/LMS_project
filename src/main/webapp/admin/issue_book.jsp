<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book issue</title>
</head>
<link rel="stylesheet" href="../bootstrap/bootstrap-5/css/bootstrap.min.css">
<link rel="stylesheet" href="../bootstrap/custom/admin-custom.css">
<body>

<%@ include file="navbar.jsp" %>

<div class="container panel formpanel">

        <div class="titlename">
            <h2>Issue Book</h2>
        </div>

        <form action="${pageContext.request.contextPath }/admin/issue_book?action=add" method="post">
            <div class="form-group mb-3 ">
                <label for="bookid">Book code</label>
                <input type="number" class="form-control" name="bookid" placeholder="Enter book id">
            </div>
    
            <div class="form-group mb-3 ">
                <label for="title">Book Title</label>
                <select class="form-select" aria-label="Default select example" name="booktitle">
                <c:forEach items="${booklists }" var="books" >
                          <option selected> ${books.title }</option>
                          </c:forEach>
                          </select>
            </div>
            
          
            
            
    
            <div class="form-group mb-3 ">
                <label for="membername">Member Name</label>
                <input type="text" class="form-control" name="membername" placeholder="Enter member name">
            </div>
            
            <div class="form-group mb-3 ">
                <label for="memberid">Member Id</label>
                <input type="number" class="form-control" name="memberid" placeholder="Enter member id">
            </div>
    
            <div class="form-group mb-3 ">
                <label for="phoneno">Phone Number</label>
                <input type="text" class="form-control" name="phoneno" placeholder="Enter contact number">
            </div>
    
            <div class="form-group mb-3 ">
                <label for="date">Issue date</label>
                <input type="date" class="form-control" name="date" >
            </div>
    
            <div class="mb-3">
                <button class="btn btn-primary" type="submit">issue</button>
            </div>
    </form>
    </div>

</body>
</html>