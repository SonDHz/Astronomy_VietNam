<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
<!-- Mobile Specific Meta -->
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<!-- Favicon-->
<link rel="shortcut icon" href="../../template/web/img/fav.png">
<!-- Author Meta -->
<meta name="author" content="codepixer">
<!-- Meta Description -->
<meta name="description" content="">
<!-- Meta Keyword -->
<meta name="keywords" content="">
<!-- meta character set -->
<meta charset="UTF-8">
<!-- Site Title -->
<title>Đặt hàng thành công</title>
<style>
.row {
	display: -ms-flexbox; /* IE10 */
	display: flex;
	-ms-flex-wrap: wrap; /* IE10 */
	flex-wrap: wrap;
	margin: 0 -16px;
}

.icon-container {
	margin-bottom: 20px;
	padding: 7px 0;
	font-size: 55px;
}

label {
	margin-bottom: 10px;
	display: block;
}

input[type=text] {
	width: 100%;
	margin-bottom: 20px;
	padding: 12px;
	border: 1px solid #ccc;
	border-radius: 3px;
}

input[type=date] {
	width: 100%;
	margin-bottom: 20px;
	padding: 11px;
	border: 1px solid #ccc;
	border-radius: 3px;
}

p {
	color: #7c32ff;
}
h1{
font-size:40px;}
.cart{
height:400px;
weight:400px}
</style>
</head>
<body>
	<%@include file="/common/web/header.jsp"%>
	<!-- Start contact-page Area -->
	<section class="contact-page-area section-gap">
		<div class="container box_1170">
			<div class="d-flex justify-content-center">
				<h1><strong>Đặt hàng thành công</strong>&nbsp;&nbsp;<i class="fa fa-check-circle text-success"></i></h1>
			</div>
			<div class="d-flex justify-content-center">
			<img class="cart" src="../../template/web/img/cart.png" alt="">
			</div>
			<br>
			<div class="d-flex justify-content-center">
				<a href="/" class="btn btn-info">Quay lại trang chủ</a>
				</div>
		</div>

	</section>
	<!-- start footer Area -->
	<%@include file="/common/web/footer.jsp"%>
	<!-- End footer Area -->

	<!-- Javascript -->
	<%@include file="/common/web/js.jsp"%>
	<!-- End javascript -->
</body>

</html>