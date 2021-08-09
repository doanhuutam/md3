<%--
  Created by IntelliJ IDEA.
  User: tam
  Date: 09/08/2021
  Time: 15:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <form method="post">
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
                <td><input type="text" name="id" value="${ahi.id}" readonly></td>
                <td><input type="text" name="tensp" value="${ahi.tensp}"></td>
                <td><input type="text" name="gia" value="${ahi.gia}"></td>
                <td><input type="text" name="soluong" value="${ahi.soluong}"></td>
                <td><input type="text" name="mausac" value="${ahi.mausac}"></td>
                <td><input type="text" name="mota" value="${ahi.mota}"></td>
                <td><input type="text" name="iddanhmuc" value="${ahi.iddanhmuc}"></td>

            </tr>
            <button type="submit" class="btn btn-info">Update sản phẩm</button>

            </tbody>
        </table>
    </form>
</div>

</body>
</html>
