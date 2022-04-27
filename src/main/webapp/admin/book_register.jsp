<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book register</title>
</head>
<link rel="stylesheet" href="../bootstrap/bootstrap-5/css/bootstrap.min.css">
<link rel="stylesheet" href="../bootstrap/custom/admin-custom.css">
<body>
<%@ include file="navbar.jsp" %>

 <div class="container panel formpanel">
 <div class="row">
 
 <c:choose>
 <c:when test="${update eq true}">
   <div class="titlename">
                  <h2>
                      Update Book
                  </h2>
              </div>
  
              <form action="${pageContext.request.contextPath }/admin/book_register?action=update" method="post">
              
              <div class="form-group mb-3 ">
                      <label for="bookid">Book Id</label>
                      <input type="text" name="bookid"  class="form-control"  placeholder="Enter book title" value="${upbook.bookid }" required>
                    </div>
              
                  <div class="form-group mb-3 ">
                      <label for="booktitle">Title</label>
                      <input type="text" name="booktitle"  class="form-control"  placeholder="Enter book title" value="${upbook.title }" required>
                    </div>
                  
  
                  <div class="form-group mb-3">
                      <label for="author">Author</label>
                      <input type="text" class="form-control" name="author"  placeholder="Enter author name"  value="${upbook.author }"  required>
                    </div>
  
                    <div class="form-group mb-3">
                      <label for="publication">Publication</label>
                      <input type="text" class="form-control" name="publication"   value="${upbook.publication }"   required>
                    </div>
  
                    
                    <div class="form-check form-check-inline mb-3" >
                        <label for="category">Category</label>
                        <br>
                    
                        <select class="form-select" aria-label="Default select example" name="category">
                          <option selected>${upbook.category }</option>
                          <option value="science">Science</option>
                          <option value="management">Management</option>
                          <option value="geography">Geography</option>
                          <option value="novel">Novel</option>
                          <option value="children">Children</option>
                          <option value="comics">Comics</option>
                          <option value="it">IT</option>
                        </select>
                    
                    </div>
                    <br>
                      
                  
                    <div class="form-group mb-3">
                      <label for="edition">Edition</label>
                      <input type="text" class="form-control" name="edition"  placeholder="Enter edition"  value="${upbook.edition }"  required>
                    </div>
  
                    <div class="form-group mb-3">
                      <label for="price">Price</label>
                      <input type="text" class="form-control" name="price"  placeholder="Enter price"  value="${upbook.price }"  required>
                    </div>
  
                    <div class="form-group mb-3">
                      <label for="quantity">Quantity</label>
                      <input type="number" class="form-control" name="quantity"  placeholder="Enter quantity"  value="${upbook.quantity }"  required>
                    </div>
                    
                     <div class="form-group mb-3">
                      <label for="remainquantity">Available Quantity</label>
                      <input type="number" class="form-control" name="remainquantity"  placeholder="Enter quantity"  value="${upbook.remainquantity }"  required>
                    </div>
  
                  <div class="form-group mb-3">
                      <label for="racknumber">Rack number</label>
                      <input type="number" class="form-control" name="racknumber"  value="${upbook.racknum }"  placeholder="Enter rack number" required>
                    </div>
  
                 
                  <div class="mb-3">
                      <button type="submit" class="btn btn-primary" >Submit</button>
                  </div>
                 
                </form>
 
 </c:when>
 
 <c:otherwise>
   
              <div class="titlename">
                  <h2>
                      Book Registration
                  </h2>
              </div>
  
              <form action="${pageContext.request.contextPath }/admin/book_register?action=add" method="post">
                  <div class="form-group mb-3 ">
                      <label for="booktitle">Title</label>
                      <input type="text" name="booktitle"  class="form-control"  placeholder="Enter book title" required>
                    </div>
                  
  
                  <div class="form-group mb-3">
                      <label for="author">Author</label>
                      <input type="text" class="form-control" name="author"  placeholder="Enter author name" required>
                    </div>
  
                    <div class="form-group mb-3">
                      <label for="publication">Publication</label>
                      <input type="text" class="form-control" name="publication"   required>
                    </div>
  
                    
                    <div class="form-check form-check-inline mb-3" >
                        <label for="category">Category</label>
                        <br>
                    
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
                    <br>
                      
                  
                    <div class="form-group mb-3">
                      <label for="phone">Edition</label>
                      <input type="text" class="form-control" name="edition"  placeholder="Enter edition" required>
                    </div>
  
                    <div class="form-group mb-3">
                      <label for="price">Price</label>
                      <input type="text" class="form-control" name="price"  placeholder="Enter price" required>
                    </div>
  
                    <div class="form-group mb-3">
                      <label for="quantity">Quantity</label>
                      <input type="number" class="form-control" name="quantity"  placeholder="Enter quantity" required>
                    </div>
                    
  
                  <div class="form-group mb-3">
                      <label for="racknumber">Rack number</label>
                      <input type="number" class="form-control" name="racknumber"  placeholder="Enter rack number" required>
                    </div>
  
                 
                  <div class="mb-3">
                      <button type="submit" class="btn btn-primary" >Submit</button>
                  </div>
                 
                </form>
 </c:otherwise>
 
 </c:choose>

                </div>
          </div>
</body>
</html>