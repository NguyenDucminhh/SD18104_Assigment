<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="f" uri="jakarta.tags.functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

    <!--Fontawesome CDN-->
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">

    <!--Custom styles-->
    <link rel="stylesheet" type="text/css" href="styles.css">
    <title>Nhân Viên</title>
</head>
<body class="container">
<div>
    <h1 class="mt-4">Nhân Viên</h1>
    <a class="d-flex" style="text-decoration: none" href="/nhan-vien/create"> <button class="btn btn-success">Thêm</button></a>
</div>
<br>
<table class="table table-striped">
    <thead>
    <tr>
        <td>Mã</td>
        <td>Tên</td>
        <td>Tên Đệm</td>
        <td>Ho</td>
        <td>Giới Tính</td>
        <td>Ngày Sinh</td>
        <td>Địa CHỉ</td>
        <td>Điện Thoại</td>
        <td>Trang Thái</td>
        <td colspan="2">Thao Tác</td>
    </tr>
    </thead>
    <tbody >
    <c:forEach items="${ data }" var="ds">
        <tr>
            <td>${ds.ma}</td>
            <td>${ds.ten}</td>
            <td>${ds.tenDem}</td>
            <td>${ds.ho}</td>
            <td>${ds.gioiTinh}</td>
            <td>${ds.ngaySinh}</td>
            <td>${ds.diaChi}</td>
            <td>${ds.sdt}</td>
            <td>${ds.trangThai==0?'Đang hoạt động':'Không hoạt động'}</td>
            <td><a href="/nhan-vien/edit/${ds.ma}">Update</a></td>
            <td><a href="/nhan-vien/delete/${ds.ma}">Delete</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>