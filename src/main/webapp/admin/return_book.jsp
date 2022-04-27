<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Book return</title>
</head>
<link rel="stylesheet" href="../bootstrap/bootstrap-5/css/bootstrap.min.css">
<link rel="stylesheet" href="../bootstrap/custom/admin-custom.css">
<body>

<%@ include file="navbar.jsp" %>

<div class="container panel formpanel">

        <div class="titlename">
            <h2>Return Book</h2>
        </div>
        
        <c:choose>
        <c:when test="s">
         <form action="${pageContext.request.contextPath }/admin/issue_book?action=add" method="post">
            <div class="form-group mb-3 ">
                <label for="bookid">Book Id</label>
                <input type="text" class="form-control" name="bookid" placeholder="Enter book id">
            </div>
    
            <div class="form-group mb-3 ">
                <label for="title">Book Title</label>
                <input type="text" class="form-control" name="booktitle" placeholder="Enter book name">
            </div>
    
            <div class="form-group mb-3 ">
                <label for="membername">Member Name</label>
                <input type="text" class="form-control" name="membername" placeholder="Enter member name">
            </div>
            
            <div class="form-group mb-3 ">
                <label for="membername">Member Id</label>
                <input type="text" class="form-control" name="memberid" placeholder="Enter member id">
            </div>
    
            <div class="form-group mb-3 ">
                <label for="phoneno">Phone Number</label>
                <input type="text" class="form-control" name="phoneno" placeholder="Enter contact number">
            </div>
    
            <div class="form-group mb-3 ">
                <label for="date">Return date</label>
                <input type="date" class="form-control" name="date" placeholder="Enter edition">
            </div>
    
            <div class="mb-3">
                <button class="btn btn-primary" type="submit">return</button>
            </div>
    </form>
        </c:when>
        
        <c:otherwise>
        <div class="col-sm-6">
         <form action="${pageContext.request.contextPath }/admin/issue_book?action=add" method="post">
            <div class="form-group mb-3 ">
                <label for="bookid">Book Id</label>
                <input type="text" class="form-control" name="bookid" placeholder="Enter book id">
            </div>
    
            <div class="form-group mb-3 ">
                <label for="title">Book Title</label>
                <input type="text" class="form-control" name="booktitle" placeholder="Enter book name">
            </div>
             <div class="mb-3">
                <button class="btn btn-primary" type="submit">return</button>
            </div>
            </form>
        </div>
        
        <div class="col-sm-6">
         <form action="${pageContext.request.contextPath }/admin/issue_book?action=add" method="post">
            <div class="form-group mb-3 ">
                <label for="bookid">Book Id</label>
                <input type="text" class="form-control" name="bookid" placeholder="Enter book id">
                
            </div>
    
            <div class="form-group mb-3 ">
                <label for="title">Book Title</label>
                <input type="text" class="form-control" name="booktitle" placeholder="Enter book name">
            </div>
            
             <div class="mb-3">
                <button class="btn btn-primary" type="submit">return</button>
            </div>
            
            </form>
        </div>
        </c:otherwise>
        
        </c:choose>
        
        
        
        
        
        
        
        
        
        
        
        

       
    </div>

</body>
</html>