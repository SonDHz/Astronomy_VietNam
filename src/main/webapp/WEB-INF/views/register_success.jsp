<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<c:url var="registerAPI" value="/api/registration" />
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta content="width=device-width, initial-scale=1" name="viewport">
<meta name="description" content="Responsive Admin Template">
<meta name="author" content="SmartUniversity">
<title>Đăng kí tài khoản thành công</title>
<!-- google font -->
<link
	href="../../../../../../admin/css.css?family=Poppins:300,400,500,600,700"
	rel="stylesheet" type="text/css">
<!-- icons -->
<link
	href="../../template/admin/fonts/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
<link
	href="../../template/admin/fonts/material-design-icons/material-icon.css"
	rel="stylesheet" type="text/css">
<!-- bootstrap -->
<link
	href="../../template/admin/assets/plugins/bootstrap/css/bootstrap.min.css"
	rel="stylesheet" type="text/css">
<!-- style -->
<link rel="stylesheet"
	href="../../template/admin/assets/css/pages/extra_pages.css">
<!-- favicon -->
<link rel="shortcut icon"
	href="../../template/admin/assets/img/favicon.ico">
</head>
<style>
h1{
font-size:25px;
font-family: 'Roboto', sans-serif;
}
.cart{
height:400px;
weight:400px}
</style>
<body>
	<div class="form-title">
		<h1><strong>Đăng kí tài khoản thành công</strong> &nbsp;&nbsp;<i class="fa fa-check-circle"></i></h1>
	</div>
	<!-- Login Form-->

		<div class="d-flex justify-content-center">
			<img class="cart" src="../../template/web/img/welcome1.png" alt="">
			</div>
		<br>
		<div class="d-flex justify-content-center">
		<a href="/login" class="btn btn-info"
			style="font-size: 12px;"><Strong> <i
				class="fa fa-user-circle fa-3x,font-size:1000px"></i>&nbsp;&nbsp;&nbsp;ĐĂNG NHẬP
		</Strong></a>
		</div>

	<!-- start js include path -->
	<script src="../../template/admin/assets/plugins/jquery/jquery.min.js"></script>
	<script src="../../template/admin/assets/js/pages/extra_pages/pages.js"></script>
	<!-- end js include path -->
</body>
</html>