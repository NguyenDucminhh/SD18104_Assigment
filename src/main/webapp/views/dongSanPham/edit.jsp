<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Chỉnh sửa màu số ${rq.ma}</title>
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
    <h1 class="mt-4">Chỉnh sửa dòng sản phẩm ${rq.ma}</h1>
    <sf:form action="/mau-sac/update/${ rq.ma }" method="post" modelAttribute="rq">

        <div class="col-4 ">
            <div class="mb-3">
                <label for="ma" class="form-label">Mã:</label>
                <sf:input path="ma" type="text" id="ma" name="ma"  disabled="true" class="form-control" />
                <sf:errors path="ma" class="text-danger" />
            </div>

            <div class="mb-3">
                <label for="ten" class="form-label">Tên:</label>
                <sf:input path="ten" type="text" id="ten" name="ten" class="form-control" />
            </div>
        </div>

        <button type="submit" class="btn btn-primary">Update</button>

    </sf:form>
</div>

<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.3.0/js/bootstrap.bundle.min.js"></script>
</body>
</html>