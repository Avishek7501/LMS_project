<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!DOCTYPE html>
<div class="d-flex dashboard flex-column bg-secondary gap-16">
  <h3 class="brand text-center"><a href="${pageContext.request.contextPath }/admin/dashboard" class="nav-item text-white text-center">Dashboard</a></h3>
  <div class="container-fluid bg-secondary">
    <nav class="navbar-nav flex-row justify-content-between">
        <div class="d-flex align-items-center">
          <ul class="navbar-nav menu">
            <li class="nav-item">
              <a class="nav-link text-white" href="${pageContext.request.contextPath }/admin/member_register">Member register</a>
            </li>
            <li class="nav-item">
                <a class="nav-link text-white" href="${pageContext.request.contextPath }/admin/book_register">Books register</a>
              </li>
            <li class="nav-item">
              <a class="nav-link text-white" href="${pageContext.request.contextPath }/admin/e-book_upload">E-books Upload</a>
            </li>
            <li class="nav-item">
              <a class="nav-link text-white" href="${pageContext.request.contextPath }/admin/issue_book">Issue books</a>
            </li>
            <li class="nav-item">
              <a class="nav-link  text-white" href="${pageContext.request.contextPath }/admin/return_book">Returned books</a>
            </li>
            <li class="nav-item">
                <a class="nav-link  text-white" href="${pageContext.request.contextPath }/admin/lost_book">Lost Books</a>
              </li>
               <li class="nav-item">
                <a class="nav-link  text-white" href="${pageContext.request.contextPath }/admin/admin_register"> Admin register</a>
              </li>
              <li class="nav-item">
                <a class="nav-link  text-white" href="${pageContext.request.contextPath }/admin/logout">Logout</a>
              </li>
          </ul>
        </div>
    </nav>

  </div>
 
 </div>

 <div class="container-fluid panel topbar ">
     <div class=" d-flex align-items-center justify-content-between p-0  bg-white ">
       <div class="d-flex align-items-center gap-16">
        <a href="${pageContext.request.contextPath }/admin/dashboard"><img src="../images/libraryicon.png" class="logo"></a>
        <h3>Library Management System</h3>
       </div>
      
       <h6>userdetail</h6>
     </div>
 </div>