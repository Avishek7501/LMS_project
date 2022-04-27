<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin register</title>
</head>
<link rel="stylesheet" href="../bootstrap/bootstrap-5/css/bootstrap.min.css">
<link rel="stylesheet" href="../bootstrap/custom/admin-custom.css">
<body>
<%@ include file="navbar.jsp" %>

<div class="container panel formpanel ">
  <div class="row ">
              <div class="titlename">
                  <h2>
                      Admin Registration
                  </h2>
              </div>
              <br>
              <br>
              <form action="${pageContext.request.contextPath }/admin/admin_register?action=add" method="post">
                  <div class="form-group mb-3 ">
                      <label for="name">Name</label>
                      <input type="text" name="name"  class="form-control"  placeholder="Enter name" required>
                    </div>
                  
  
                  <div class="form-group mb-3">
                      <label for="address">Address</label>
                      <input type="text" class="form-control" name="address"  placeholder="Enter address" required>
                    </div>
  
                    <div class="form-group mb-3">
                      <label for="dob">Date Of Birth</label>
                      <input type="date" class="form-control" name="dob"   required>
                    </div>
  
                    
                    <div class="mb-3" >
                    <div><label for="gender">Gender</label></div>
                        
                        
                    <div >
                      <input class="form-check-input" type="radio" name="gender" id="gender" value="male" required>
                      <label class="form-check-label" for="male">Male</label>
                    
                    
                      <input class="form-check-input" type="radio" name="gender" id="gender" value="female" required>
                      <label class="form-check-label" for="female">Female</label>
                    
                    
                      <input class="form-check-input" type="radio" name="gender" id="gender" value="others" required>
                      <label class="form-check-label" for="others">Others</label>
  
                    </div>
                    </div>
                    
                    <br>
                      
                  
                    <div class="form-group mb-3">
                      <label for="phone">Contact Number</label>
                      <input type="text" class="form-control" name="phone"  placeholder="Enter contact number" required>
                    </div>
  
                    <div class="form-group mb-3">
                      <label for="email">Email address</label>
                      <input type="email" class="form-control" name="email"  placeholder="Enter email" required>
                    </div>
                    
  
                  <div class="form-group mb-3">
                      <label for="username">Username</label>
                      <input type="text" class="form-control" name="username"  placeholder="Enter username" required>
                    </div>
  
                  <div class="form-group mb-3">
                    <label for="password">Password</label>
                    <input type="password" class="form-control" name="password" placeholder="Password" required>
                  </div>
  
                 
                  <div class="mb-3">
                      <button type="submit" class="btn btn-primary" >Submit</button>
                  </div>
                 
                </form>
                </div>
          </div>
</body>
</html>