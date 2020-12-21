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

<!-- Author Meta -->
<meta name="author" content="codepixer">
<!-- Meta Description -->
<meta name="description" content="">
<!-- Meta Keyword -->
<meta name="keywords" content="">
<!-- meta character set -->
<meta charset="UTF-8">
<!-- Site Title -->
<title>Thiên Văn Việt</title>
<!-- css -->
<style>
.fa fa-user-circle fa-2x {
	padding: 10px;
}

h4 {
	font-size: 32px;
	font-family: 'Langar', cursive;
}
</style>
<%@include file="/common/web/style.jsp"%>

</head>

<body>
	<!-- ==========Start header========== -->
	<%@include file="/common/web/header.jsp"%>
	<!-- ==========Stop header========== -->

	<!-- Top Stories Area -->
	<div class="container">
		<div class="row" style="margin-top: 120px">
			<div class="col-6">
				<img alt="" src="../../template/web/img/account.gif" width="100%"
					height="350px" class="w-100"> 
					<a href="" class="btn btn-success">Xem thông tin cá nhân</a>
			</div>
			<div class="col-6">
				<img alt="" src="../../template/web/img/bill_animation.gif"
					idth="100%" height="350px" class="w-100">
					<a href="/user-bill-detail" class="btn btn-success">Xem thông tin hóa đơn</a>
			</div>
		</div>
		</br>
	</div>

	<!-- Start main body Area -->

	<!-- start footer Area -->
	<%@include file="/common/web/footer.jsp"%>
	<!-- End footer Area -->

	<!-- Javascript -->
	<%@include file="/common/web/js.jsp"%>
	<!-- End javascript -->
</body>

</html>