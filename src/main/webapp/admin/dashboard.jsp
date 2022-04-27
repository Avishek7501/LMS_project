<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>dashboard</title>
</head>
<link rel="stylesheet" href="../bootstrap/bootstrap-5/css/bootstrap.min.css">
<link rel="stylesheet" href="../bootstrap/custom/admin-custom.css">
<body>
<%@ include file="navbar.jsp" %>

 <div class="container panel gap-32 p-20">
  <div class="row gap-32">
    <div class="col-md-3 card">
    <a href="${pageContext.request.contextPath }/admin/memberlist" >
      <div class="container">
        <div class="row">
          <div class="col-md-6">
            <h5>Member</h5>
            <p class="count">10</p>
          
           </div>
          <div class="col-md-6">
            <img src="../images/members.png" alt="">
          </div>
        </div>
      </div>
      </a>
      </div>
      <div class="col-md-3 card">
      <a href="${pageContext.request.contextPath }/admin/booklist">
      <div class="container">
         <div class="row">
           <div class="col-md-6">
             <h5>Books</h5>
             <p class="count">10</p>
             
            </div>
           <div class="col-md-6">
             <img src="../images/books.png" alt="" width="90%">
           </div>
         </div>
       </div>
       </a>
       
      </div>
      <div class="col-md-3 card">
      <a href="">
      <div class="container">
         <div class="row">
           <div class="col-md-6">
             <h5>E-books</h5>
             <p class="count">10</p>
            </div>
           <div class="col-md-6">
             <img src="../images/ebooks.png" alt="">
           </div>
         </div>
       </div>
      </a>
       
      </div>
      
      

  </div>
  <div class="row gap-32">
    <div class="col-md-3 card">
    <a href="${pageContext.request.contextPath }/admin/issuelist">
     <div class="container">
        <div class="row">
          <div class="col-md-6">
            <h5>Issue</h5>
            <p class="count">10</p>
           </div>
          <div class="col-md-6">
            <img src="../images/issue.png" alt="">
          </div>
        </div>
      </div>
    </a>
     
      </div>
      <div class="col-md-3 card">
      <a href="">
      <div class="container">
         <div class="row">
           <div class="col-md-6">
             <h5>Return</h5>
             <p class="count">10</p>
            </div>
           <div class="col-md-6">
             <img src="../images/return.png" alt="">
           </div>
         </div>
       </div>
      </a>
       
      </div>
      <div class="col-md-3 card">
      <a href="">
      <div class="container">
         <div class="row">
           <div class="col-md-6">
             <h5>Lost</h5>
             <p class="count">10</p>
            </div>
           <div class="col-md-6">
             <img src="../images/lost.png" alt="">
           </div>
         </div>
       </div>
      </a>
       
      </div>
      
       
      

  </div>
  
  <div class="row gap-32">
  
  <div class="col-md-3 card">
      <a href="${pageContext.request.contextPath }/admin/adminlist">
      <div class="container">
         <div class="row">
           <div class="col-md-6">
             <h5>Admin</h5>
             <p class="count">10</p>
            </div>
           <div class="col-md-6">
             <img src="../images/admin.png" alt="" width="90%">
           </div>
         </div>
       </div>
       </a>
       
      </div>
  
   <div class="col-md-3 card">
      <a href="">
      <div class="container">
         <div class="row">
           <div class="col-md-6">
             <h5>Reserves</h5>
             <p class="count">10</p>
            </div>
           <div class="col-md-6">
             <img src="../images/reserved.png" alt="" width="90%">
           </div>
         </div>
       </div>
       </a>
       
      </div>
  
  </div>
  
</div>
</body>
</html>