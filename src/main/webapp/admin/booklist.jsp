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
     


<div class="col-sm-4 mb-3">

</div>
<div class="col-sm-4 mb-3">
<div class="input-group ">
<form action="${pageContext.request.contextPath }/admin/bookfilter" method="get">
  <div class="form-outline">
  
  <select class="form-select" aria-label="Default select example" name="category">
                          <option selected>Select Category</option>
                          <option value="science">Science</option>
                          <option value="management">Management</option>
                          <option value="geography">Geography</option>
                          <option value="novel">Novel</option>
                          <option value="children">Children</option>
                          <option value="comics">Comics</option>
                          <option value="it">IT</option>
                        </select>
  </div>
  
 <input type="submit" value="filter">
   </form>
  
</div>
</div>

<div class="col-sm-4 mb-3 ">
<div class="input-group ">
<form action="${pageContext.request.contextPath }/admin/booksearch">
  <div class="form-outline">
    <input name="booksearch" type="search" id="form1" class="form-control" placeholder="search books"   />
  </div>
  <input type="submit" value="search">
  </form>
</div>
</div>




<c:choose>
<c:when test="${filter eq true }">
 <table class="table table-hover">
            <thead>
              <tr>
                <th scope="col">BookId</th>
                <th scope="col">Title</th>
                <th scope="col">Author</th>
                <th scope="col">Price</th>
                <th scope="col">Publication</th>
                <th scope="col">Category</th>
                <th scope="col">Edition</th>
                <th scope="col">Quantity</th>
                <th scope="col">Available </th>
                <th scope="col">Rack No.</th>
                <th scope="col">Action</th>
              </tr>
            </thead>
            <tbody >
            <c:forEach items="${booklists }" var="book" >
                <tr>
                  <th  scope="row"> ${book.bookid }</th>
                  <td> ${book.title }</td>
                  <td> ${book.author }</td>
                  <td> ${book.price }</td>
                  <td> ${book.publication } </td>
                  <td> ${book.category }</td>
                  <td> ${book.edition }</td>
                  <td> ${book.quantity }</td>
                  <td> ${book.remainquantity }</td>
                  <td> ${book.racknum }</td>
                  
                  <td>
                  <a class="link-primary"  href="${pageContext.request.contextPath }/admin/edit_book?id=${book.bookid }" >edit</a>
                  <a class="link-danger"  href="${pageContext.request.contextPath }/admin/delete_book?id=${book.bookid }" >delete</a>
                  </td>
                </tr>
                </c:forEach>
              </tbody>
        </table>
</c:when>

<c:when test="${search eq true }">
 <table class="table table-hover">
            <thead>
              <tr>
                <th scope="col">BookId</th>
                <th scope="col">Title</th>
                <th scope="col">Author</th>
                <th scope="col">Price</th>
                <th scope="col">Publication</th>
                <th scope="col">Category</th>
                <th scope="col">Edition</th>
                <th scope="col">Quantity</th>
                <th scope="col">Available </th>
                <th scope="col">Rack No.</th>
                <th scope="col">Action</th>
              </tr>
            </thead>
            <tbody >
            <c:forEach items="${booklists }" var="book" >
                <tr>
                  <th  scope="row"> ${book.bookid }</th>
                  <td> ${book.title }</td>
                  <td> ${book.author }</td>
                  <td> ${book.price }</td>
                  <td> ${book.publication } </td>
                  <td> ${book.category }</td>
                  <td> ${book.edition }</td>
                  <td> ${book.quantity }</td>
                  <td> ${book.remainquantity }</td>
                  <td> ${book.racknum }</td>
                  
                  <td>
                  <a class="link-primary"  href="${pageContext.request.contextPath }/admin/edit_book?id=${book.bookid }" >edit</a>
                  <a class="link-danger"  href="${pageContext.request.contextPath }/admin/delete_book?id=${book.bookid }" >delete</a>
                  </td>
                </tr>
                </c:forEach>
              </tbody>
        </table>
</c:when>


<c:otherwise>
 <table class="table table-hover">
            <thead>
              <tr>
                <th scope="col">BookId</th>
                <th scope="col">Title</th>
                <th scope="col">Author</th>
                <th scope="col">Price</th>
                <th scope="col">Publication</th>
                <th scope="col">Category</th>
                <th scope="col">Edition</th>
                <th scope="col">Quantity</th>
                <th scope="col">Available </th>
                <th scope="col">Rack No.</th>
                <th scope="col">Action</th>
              </tr>
            </thead>
            <tbody >
            <c:forEach items="${booklists }" var="book" >
                <tr>
                  <th  scope="row"> ${book.bookid }</th>
                  <td> ${book.title }</td>
                  <td> ${book.author }</td>
                  <td> ${book.price }</td>
                  <td> ${book.publication } </td>
                  <td> ${book.category }</td>
                  <td> ${book.edition }</td>
                  <td> ${book.quantity }</td>
                  <td> ${book.remainquantity }</td>
                  <td> ${book.racknum }</td>
                  
                  <td>
                  <a class="link-primary"  href="${pageContext.request.contextPath }/admin/edit_book?id=${book.bookid }" >edit</a>
                  <a class="link-danger"  href="${pageContext.request.contextPath }/admin/delete_book?id=${book.bookid }" >delete</a>
                  </td>
                </tr>
                </c:forEach>
              </tbody>
        </table>
</c:otherwise>

</c:choose>




 <div>
    <a href="${pageContext.request.contextPath }/admin/booklist" >
    <button class="btn btn-primary float-end" >back</button>
    </a>
    </div>

       
        </div>
    </div>

   
        
   
</body>
</html>