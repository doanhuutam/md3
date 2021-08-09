<%--
  Created by IntelliJ IDEA.
  User: tam
  Date: 09/08/2021
  Time: 15:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
  <title>
    <!DOCTYPE html>
    <html lang="en">
    <head>
    <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h2>Striped Rows</h2>
  <table class="table table-striped">
    <thead>
    <th>id</th>
    <th>tên sản phẩm</th>
    <th>giá sản phẩm</th>
    <th>số lượng sản phẩm</th>
    <th>màu sắc sản phẩm</th>
    <th>mô tả sản phẩm</th>
    <th>id danh mục </th>
    <th>Create</th>
    <th>Delete</th>
    <th>Edit</th>

    </thead>
    <c:forEach items="${ahihi}" var="doantam" varStatus="loop">
      <tbody>
      <tr>
        <td>${doantam.id}</td>
        <td>${doantam.tensp}</td>
        <td>${doantam.gia}</td>
        <td>${doantam.soluong}</td>
        <td>${doantam.mausac}</td>
        <td>${doantam.mota}</td>
        <td>${doantam.iddanhmuc}</td>

        <td><a href="/?action=create" class="btn btn-info">Create</a></td>
        <td><a href="/?action=delete&index=${loop.index}" class="btn btn-info">Delete</a></td>
        <td><a href="/?action=edit&index=${loop.index}" class="btn btn-info">Edit</a></td>
      </tr>


      </tbody>
    </c:forEach>
  </table>
</div>

</body>
</html>

</title>
</head>
<body>

</body>
</html></html>
