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
			<h1>Lịch sử đơn hàng</h1>
			<table class="table table-striped" style="width: 100%;">
				<thead>
					<tr>
						<th>Hóa đơn</th>
						<th>Số Lượng</th>
						<th>Sản phẩm</th>
						<th>Tổng cộng</th>
						<th>Ngày tạo</th>
						<th>Tạo bởi</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="item" items="${ listOrderDetailByUserID }">
						<tr>
							<td>${item.order.id}</td>
							<td>${item.quantity}</td>
							<td>${item.product.name}</td>
							<td>${item.total}</td>
							<td>${item.createdDate}</td>
							<td>${item.createdBy}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
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