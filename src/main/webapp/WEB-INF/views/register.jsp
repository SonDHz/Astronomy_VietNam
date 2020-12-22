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
<title>Đăng kí tài khoản</title>
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
				<input name="username" type="text" required=""
					oninvalid="this.setCustomValidity('Hãy nhập tên tài khoản!')"
					oninput="setCustomValidity('')" value="${userDto.username}"
					placeholder="Tên tài khoản" />
					
				<input name="password" type="password" required=""
					oninvalid="this.setCustomValidity('Hãy nhập mật khẩu!')"
					oninput="setCustomValidity('')" value="${userDto.password}"
					placeholder="Password" />
					
				<input name="fullName" type="text" required=""
					oninvalid="this.setCustomValidity('Hãy nhập họ và tên!')"
					oninput="setCustomValidity('')" value="${userDto.fullName}"
					placeholder="Họ tên" />
					
				<input name="email" type="email" required=""
					oninvalid="this.setCustomValidity('Hãy nhập địa chỉ email!')"
					oninput="setCustomValidity('')" value="${userDto.email}"
					placeholder="Email" />
					
				<input name="phoneNumber" type="number"
					value="${userDto.phoneNumber}" required=""
					oninvalid="this.setCustomValidity('Hãy số điện thoại!')"
					oninput="setCustomValidity('')" placeholder="Số điện thoại" />
					
				<input name="address" type="text" required=""
					oninvalid="this.setCustomValidity('Hãy nhập địa chỉ!')"
					oninput="setCustomValidity('')" value="${userDto.address}"
					placeholder="Địa chỉ" />
					
				<form:hidden path="status" name="status" value="1" />
				<button type="submit" class="btn btn-light">Đăng kí</button>
			</form:form>
		</div>
	</div>
	<!-- start js include path -->
	<script src="../../template/admin/assets/plugins/jquery/jquery.min.js"></script>
	<script src="../../template/admin/assets/js/pages/extra_pages/pages.js"></script>
	<!-- end js include path -->

</body>
</html>