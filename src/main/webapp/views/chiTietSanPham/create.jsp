<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Product Details</title>
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
    <h1 class="mt-4">Add Product Details</h1>
    <sf:form action="/chitiet-sanpham/index" method="post" modelAttribute="sp">

        <div class="col-4 ">
            <div class="mb-3">
                <label for="id" class="form-label">ID:</label>
                <sf:input path="id" type="text" id="id" name="id" class="form-control" />

            </div>

            <div class="mb-3">
                <label for="idSP" class="form-label">ID sản phẩm</label>
                <sf:input path="idSP" type="text" id="idSP" name="idSP" class="form-control" />
            </div>
            <div class="mb-3">
                <label for="idNsx" class="form-label">idNSX:</label>
                <sf:input path="idNsx" type="text" id="idNsx" name="idNsx" class="form-control" />
            </div>
            <div class="mb-3">
                <label for="idMauSac" class="form-label">idMauSac:</label>
                <sf:input path="idMauSac" type="text" id="idMauSac" name="idMauSac" class="form-control" />
            </div>
            <div class="mb-3">
                <label for="idDongSP" class="form-label">idDongSP:</label>
                <sf:input path="idDongSP" type="text" id="idDongSP" name="idDongSP" class="form-control" />
            </div>
            <div class="mb-3">
                <label for="namBH" class="form-label">namBH:</label>
                <sf:input path="namBH" type="text" id="namBH" name="namBH" class="form-control" />
            </div>
            <div class="mb-3">
                <label for="moTa" class="form-label">moTa:</label>
                <sf:input path="moTa" type="text" id="moTa" name="moTa" class="form-control" />
            </div>
            <div class="mb-3">
                <label for="soLuongTon" class="form-label">soLuongTon:</label>
                <sf:input path="soLuongTon" type="text" id="soLuongTon" name="soLuongTon" class="form-control" />
            </div>
            <div class="mb-3">
                <label for="giaNhap" class="form-label">giaNhap:</label>
                <sf:input path="giaNhap" type="text" id="giaNhap" name="giaNhap" class="form-control" />
            </div>

            <div class="mb-3">
                <label for="giaBan" class="form-label">giaBan:</label>
                <sf:input path="giaBan" type="text" id="giaBan" name="giaBan" class="form-control" />
            </div>

        </div>

        <button type="submit" class="btn btn-primary">Thêm chi tiết sản phẩm</button>

    </sf:form>
</div>

<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.3.0/js/bootstrap.bundle.min.js"></script>
</body>
</html>