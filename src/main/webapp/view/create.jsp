<%--
  Created by IntelliJ IDEA.
  User: tam
  Date: 09/08/2021
  Time: 15:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<form action="/?action=findName" method="get">
    <table>
    <div class="input-group" style="width: 250px;">
        <input type="text" class="form-control" placeholder="tìm kiếm" name="findName" style="width: 226px;">
        <input type="text" hidden name="action" value="findName">
        <div class="input-group-btn">
            <button type="submit" class="btn btn-info">Find</button>

        </div>
    </div>
    </table>
</form>


<div class="container">
    <h2>Striped Rows</h2>
    <form action="/?action=create" method="post">
        <table class="table table-striped">
            <thead>
            <tr>
                <th>id</th>
                <th>tensp</th>
                <th>gia</th>
                <th>soluong</th>
                <th>mausac</th>
                <th>mota</th>
                <th>iddanhmuc</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td><input type="text" name="id" placeholder="nhap id"></td>
                <td><input type="text" name="tensp" placeholder="nhap tensp"></td>
                <td><input type="text" name="gia" placeholder="nhap gia sp"></td>
                <td><input type="text" name="soluong" placeholder="nhap so luong sp"></td>
                <td><input type="text" name="mausac" placeholder="nhap mausac"></td>
                <td><input type="text" name="mota" placeholder="nhap mota sp"></td>
                <td><input type="text" name="iddanhmuc" placeholder="nhap iddanhmuc"></td>

            </tr>
            <button type="submit" class="btn btn-info">Create</button>

            </tbody>
        </table>
    </form>
</div>

</body>
</html>
