<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Upload e-book</title>
</head>
<link rel="stylesheet" href="../bootstrap/bootstrap-5/css/bootstrap.min.css">
<link rel="stylesheet" href="../bootstrap/custom/admin-custom.css">
<body>
<%@ include file="navbar.jsp" %>

 <div class="container panel formpanel">
 <div class="row">

                <div class="titlename">
                    <h2>Upload book</h2>
                </div>
                <br>

                <form action="${pageContext.request.contextPath }/admin/e-book_upload?action=add" method="post" enctype="multipart/form-data">
                    <div class="form-group mb-3">
                        <label for="title">Book Title</label>
                        <input type="text" class="form-control" name="ebooktitle" placeholder="enter book name" required>
                    </div>

                    <div class="form-group mb-3">
                        <label for="author">Author</label>
                        <input type="text" class="form-control" name="eauthor" placeholder="enter author name" required>
                    </div>

                    <div class="form-group mb-3">
                        <label for="publication">Publication</label>
                        <input type="text" class="form-control" name="epublication" placeholder="enter publication name" required>
                    </div>

                    <div class="form-group mb-3">
                        <label for="edition">edition</label>
                        <input type="text" class="form-control" name="eb_edition" placeholder="enter edition" required>
                    </div>

                    <div class="form-group mb-3">
                        <label for="e-book" class="form-label">Choose file</label>
                        <input class="form-control" type="file" name="e-book" multiple required>
                      </div>

                      <div class="mb-3">
                          <button class="btn btn-primary" type="submit">submit</button>
                      </div>
                </form>
                </div>

               
            </div>
</body>
</html>