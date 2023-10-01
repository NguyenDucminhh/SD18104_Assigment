<%@ page language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Shop Homepage - Bootstrap 5</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.3.0/css/bootstrap.min.css">
    <style>
        body {
            font-family: Arial, sans-serif;
        }

        .header {
            background-color: #f8f9fa;
            padding: 20px;
            text-align: center;
        }

        .navbar {
            background-color: #1E90FF;
            color: #ffffff;
        }

        .navbar-brand {
            color: #ffffff;
            font-size: 24px;
        }

        .navbar-nav .nav-link {
            color: #ffffff;
        }

        .jumbotron {

            background-image: url('../webapp/imgs/background.jpg');
            background-size: cover;
            height: 600px;
            display: flex;
            align-items: center;
            justify-content: center;
            text-align: center;
            color: #1e56ff;
        }

        .jumbotron h1 {
            font-size: 48px;
            margin-bottom: 20px;
        }

        .jumbotron p {
            font-size: 24px;
            margin-bottom: 40px;
        }

        .featured-section {
            padding: 60px 0;
            background-color: #f8f9fa;
        }

        .product-card {
            background-color: #ffffff;
            border-radius: 5px;
            padding: 20px;
            margin-bottom: 30px;
        }

        .product-card img {
            width: 100%;
            margin-bottom: 20px;
        }

        .product-card h3 {
            font-size: 24px;
            margin-bottom: 10px;
        }

        .product-card p {
            font-size: 16px;
            color: #6c757d;
        }

        .footer {
            background-color: #f8f9fa;
            padding: 20px;
            text-align: center;
        }
    </style>
</head>
<body>
<header class="header">
    <div class="container">
        <h1>Shop Homepage</h1>
        <p>Welcome to our online store!</p>
    </div>
</header>

<nav class="navbar navbar-expand-lg">
    <div class="container">
        <a class="navbar-brand" href="#">Trang Chủ</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ml-auto">
                <li class="nav-item">
                    <a class="nav-link" href="#">Trang Chủ</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/san-pham/products">Sản Phẩm</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/chitiet-sanpham/index">Chi Tiết Sản Phẩm</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/mau-sac/index">Màu sắc</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/gio-hang/index">Giỏ Hàng</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<section class="jumbotron">
    <div class="container">
        <h1>Welcome to our Shop</h1>
        <p>Discover amazing products for every occasion.</p>
        <a href="#" class="btn btn-primary">Shop Now</a>
    </div>
</section>

<section class="featured-section">
    <div class="container">
        <h2>Featured Products</h2>
        <div class="row">
            <div class="col-md-4">
                <div class="product-card">
                    <img src="https://via.placeholder.com/400x300" alt="Product Image">
                    <h3>Product 1</h3>
                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
                    <a href="#" class="btn btn-primary">Buy Now</a>
                </div>
            </div>
            <div class="col-md-4">
                <div class="product-card">
                    <img src="https://via.placeholder.com/400x300"alt="Product Image">
                    <h3>Product 2</h3>
                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
                    <a href="#" class="btn btn-primary">Buy Now</a>
                </div>
            </div>
            <div class="col-md-4">
                <div class="product-card">
                    <img src="https://via.placeholder.com/400x300" alt="Product Image">
                    <h3>Product 3</h3>
                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
                    <a href="#" class="btn btn-primary">Buy Now</a>
                </div>
            </div>
        </div>
    </div>
</section>

<footer class="footer">
    <div class="container">
        <p>&copy; 2023 Shop. All rights reserved.</p>
    </div>
</footer>

<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.3.0/js/bootstrap.bundle.min.js"></script>
</body>
</html>