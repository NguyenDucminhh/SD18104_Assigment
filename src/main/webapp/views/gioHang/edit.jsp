<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Cart</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.3.0/css/bootstrap.min.css">
    <style>
        body {
            display: flex;
            align-items: center;
            justify-content: center;

        }
    </style>
</head>
<body>
<div class="container">
    <h1 class="mt-4">Add New Cart</h1>
    <sf:form action="/gio-hang/update/${gh.ma}" method="post" modelAttribute="gh">

        <div class="col-4 ">
            <div class="mb-3">
                <label for="idKH" class="form-label">ID Khách Hàng:</label>
                <sf:input path="idKH" type="text" id="idKH" name="idKH" class="form-control" />

            </div>

            <div class="mb-3">
                <label for="idNV" class="form-label">ID Nhân viên:</label>
                <sf:input path="idNV" type="text" id="idNV" name="idNV" class="form-control" />
            </div>

            <div class="mb-3">
                <label for="ma" class="form-label">Mã:</label>
                <sf:input path="ma" type="text" id="ma" name="ma" class="form-control" />
            </div>

            <div class="mb-3">
                <label for="ngayTao" class="form-label">Ngày tạo:</label>
                <sf:input path="ngayTao" type="date" id="ngayTao" name="ngayTao" class="form-control" />
            </div>
            <div class="mb-3">
                <label for="ngayThanhToan" class="form-label">Ngày thanh toán:</label>
                <sf:input path="ngayThanhToan" type="date" id="ngayThanhToan" name="ngayThanhToan" class="form-control" />
            </div>
            <div class="mb-3">
                <label for="tenNguoiNhan" class="form-label">Tên người nhận:</label>
                <sf:input path="tenNguoiNhan" type="text" id="tenNguoiNhan" name="tenNguoiNhan" class="form-control" />
            </div>
            <div class="mb-3">
                <label for="diaChi" class="form-label">Địa chỉ:</label>
                <sf:input path="diaChi" type="text" id="diaChi" name="diaChi" class="form-control" />
            </div>
            <div class="mb-3">
                <label for="sdt" class="form-label">SĐT:</label>
                <sf:input path="sdt" type="text" id="sdt" name="sdt" class="form-control" />
            </div>
<%--            <div class="mb-3">--%>
<%--                <label for="tinhTrang" class="form-label">Tình trạng:</label>--%>
<%--                <sf:input path="tinhTrang" type="text" id="tinhTrang" name="tinhTrang" class="form-control" />--%>
<%--            </div>--%>
        </div>

        <button type="submit" class="btn btn-primary">Update Cart</button>

    </sf:form>
</div>

<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.3.0/js/bootstrap.bundle.min.js"></script>
</body>
</html>