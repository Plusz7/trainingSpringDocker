<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="https://unpkg.com/@coreui/coreui/dist/css/coreui.min.css">
    <script src="http://code.jquery.com/jquery-3.3.1.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
    <script src="https://unpkg.com/@coreui/coreui/dist/js/coreui.min.js"></script>
    <meta charset="UTF-8">
    <title>Home</title>
</head>
<body>
Tool for converting csv or xml to MYSQL insert queries
<form method="POST" action="/upload" enctype="multipart/form-data">
  <label for="file">Enter csv or XML file:</label><br>
  <input type="file" id="file" name="file"><br>
  <input type="submit" value="Submit" />
</form>

</body>
</html>