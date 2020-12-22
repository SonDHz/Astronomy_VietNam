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
<title>Đăng nhập</title>
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
		<h1>Đăng nhập và trải nghiệm</h1>
	</div>
	<!-- Login Form-->
	<div class="login-form text-center">
		<div class="toggle">
			
		</div>
		<div class="form formLogin">
			<h2>Đăng nhập</h2>
			<form:form action="/j_spring_security_login" method='POST'>
				<input type="text" id="username" required=""
					oninvalid="this.setCustomValidity('Hãy nhập tên tài khoản!')"
					oninput="setCustomValidity('')" name="j_username"
					placeholder="Tài khoản">
				<input type="password" id="password" required=""
					oninvalid="this.setCustomValidity('Hãy nhập mật khẩu!')"
					oninput="setCustomValidity('')" name="j_password"
					placeholder="Mật khẩu">
				<div class="remember text-left">
					<!-- <div class="checkbox checkbox-primary">
                        <input id="checkbox2" type="checkbox" checked="">
                        <label for="checkbox2">
                            Nhớ mật khẩu
                        </label>
                    </div> -->
				</div>
				<button type="submit">Đăng nhập</button>
				<div class="forgetPassword">
					<a href="/registration">Đăng kí tài khoản</a>
				</div>
			</form:form>
		</div>
		<div class="form formRegister">
			<h2>Tạo tài khoản</h2>
			<form:form action="/registration" method="POST"
				modelAttribute="userDTO">
				<form:hidden path="id" name="id" value="${userDto.id}" />
				<form:input path="username" name="username" type="text"
					placeholder="Tên tài khoản" />
				<form:input path="password" name="password" type="password"
					placeholder="Password" />
				<form:input path="fullName" name="fullName" type="text"
					placeholder="Họ tên" />
				<form:input path="email" name="email" type="email"
					placeholder="Email" />
				<form:input path="phoneNumber" name="phoneNumber" type="number"
					placeholder="Số điện thoại" />
				<form:input path="address" name="address" type="text"
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