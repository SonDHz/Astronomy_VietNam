<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
<!-- Mobile Specific Meta -->
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<!-- Author Meta -->
<meta name="author" content="codepixer">
<!-- Meta Description -->
<meta name="description" content="">
<!-- Meta Keyword -->
<meta name="keywords" content="">
<!-- meta character set -->
<meta charset="UTF-8">
<!-- Site Title -->
<title>400 Bad-Request</title>
<style>
.not {
	height: 400px;
	weight: 400px
}

p {
	font-size: 50px;
}
</style>
<%@include file="/common/web/style.jsp"%>
</head>
<body>
	<br>
	<div class="d-flex justify-content-center">
		<p>Yêu cầu bị từ chối</p>
	</div>
	<br>
	<br>
	<div class="d-flex justify-content-center">
		<img class="not" src="../../template/web/img/400.png" alt="">
	</div>
	<!-- start footer Area -->

	<!-- End footer Area -->

	<!-- Javascript -->
	<%@include file="/common/web/js.jsp"%>
	<!-- End javascript -->
</body>

</html>