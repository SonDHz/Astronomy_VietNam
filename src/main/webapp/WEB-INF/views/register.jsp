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
<title>Smile Admin | Bootstrap Responsive Admin Template</title>
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
<body>
	<div class="form-title">
		<h1>Đăng kí tài khoản</h1>
	</div>
	<!-- Login Form-->
	<div class="login-form text-center">
		<div class="form formLogin">
			<div>
				<c:if test="${ param.success }">
					<div class="alert alert-info">Đăng kí tài khoản thành công</div>
				</c:if>
			</div>
		</div>
		<div class="form formRegister">
			<h2>Tạo tài khoản</h2>
			<form:form action="/registration" method="POST"
				modelAttribute="userDTO">
				<form:hidden path="id" name="id" value="${userDto.id}" />
				<form:input path="username" name="username" type="text" value="${userDto.username}"
					placeholder="Tên tài khoản" />
				<form:input path="password" name="password" type="password" value="${userDto.password}"
					placeholder="Password" />
				<form:input path="fullName" name="fullName" type="text" value="${userDto.fullName}"
					placeholder="Họ tên" />
				<form:input path="email" name="email" type="email" value="${userDto.email}"
					placeholder="Email" />
				<form:input path="phoneNumber" name="phoneNumber" type="number" value="${userDto.phoneNumber}"
					placeholder="Số điện thoại" />
				<form:input path="address" name="address" type="text" value="${userDto.address}"
					placeholder="Địa chỉ" />
				<form:hidden path="status" name="status" value="1" />
				<button type="submit">Đăng kí</button>
			</form:form>
		</div>
	</div>
	<!-- start js include path -->
	<script src="../../template/admin/assets/plugins/jquery/jquery.min.js"></script>
	<script src="../../template/admin/assets/js/pages/extra_pages/pages.js"></script>
	<!-- end js include path -->
</body>
</html>