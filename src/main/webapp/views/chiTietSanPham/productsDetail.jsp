<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="f" uri="jakarta.tags.functions" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Product Detail</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.3.0/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <div>
        <h1 class="mt-4">Product Details</h1>
        <a class="d-flex" style="text-decoration: none" href="/chitiet-sanpham/add"> <button class="btn btn-success">Thêm</button></a>
    </div>
    <table class="table  col-9">
        <thead>
        <tr class="table-header summary-table">
            <%--            <th scope="col">ID</th>--%>
            <th scope="col">Mã</th>
            <th scope="col">Mã sản phẩm</th>
                <th>Mã NSX</th>
                <th>Màu sắc</th>
                <th>Mã Dòng Sản phẩm</th>
                <th>Năm bảo hành</th>
                <th>Mô tả</th>
                <th>Số lượng tồn</th>
                <th>Giá nhập</th>
                <th>Giá bán</th>

            <th class="text-end" scope="col">Thao tác</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${ data }" var="rq">
            <tr>
                <td>${ rq.id }</td>
                <td>${ rq.idSP }</td>
                <td>${ rq.idNsx }</td>
                <td>${ rq.idMauSac }</td>
                <td>${ rq.idDongSP }</td>
                <td>${ rq.namBH }</td>
                <td>${ rq.moTa }</td>
                <td>${ rq.soLuongTon }</td>
                <td>${ rq.giaNhap }</td>
                <td>${ rq.giaBan }</td>
                <td class="text-end">
                    <a href="/san-pham/edit/${rq.id}"><button class="btn btn-primary">Sửa</button></a>
                    <a href="/san-pham/delete/${rq.id}"><button class="btn btn-danger">Xóa</button></a>
                </td>

            </tr>
        </c:forEach>

        </tbody>
    </table>
</div>

<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.3.0/js/bootstrap.bundle.min.js"></script>
</body>
</html>
