<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="f" uri="jakarta.tags.functions" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Product List</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.3.0/css/bootstrap.min.css">
</head>
<body>
<div class="container">
   <div>
       <h1 class="mt-4">Product List</h1>
       <a class="d-flex" style="text-decoration: none" href="/san-pham/add"> <button class="btn btn-success">Thêm</button></a>
   </div>
    <table class="table  col-9">
        <thead>
        <tr class="table-header summary-table">
<%--            <th scope="col">ID</th>--%>
            <th scope="col">Mã</th>
            <th scope="col">Tên sản phẩm</th>
            <th class="text-end" scope="col">Thao tác</th>
        </tr>
        </thead>
        <tbody>
       <c:forEach items="${ data }" var="rq">
       <tr>
           <td>${ rq.ma }</td>
           <td>${ rq.ten }</td>
           <td class="text-end">
               <a href="/san-pham/edit/${rq.ma}"><button class="btn btn-primary">Sửa</button></a>
               <a href="/san-pham/delete/${rq.ma}"><button class="btn btn-danger">Xóa</button></a>
           </td>

       </tr>
       </c:forEach>

        </tbody>
    </table>
</div>

<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.3.0/js/bootstrap.bundle.min.js"></script>
</body>
</html>
