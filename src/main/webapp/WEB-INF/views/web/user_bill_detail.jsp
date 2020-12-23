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
<title>Lịch sử đơn hàng</title>
<!-- css -->
<style>
.fa fa-user-circle fa-2x {
	padding: 10px;
}

.a {
	font-size: 40px;
	color: #7c32ff;
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
			<span class="a">Lịch sử đơn hàng</span>
			<br><br><br>
			<table class="table table-bordered" style="width: 100%;">
				<thead class="thead-dark">
					<tr class="text-center">
						<th>Hóa đơn</th>
						<th>Số Lượng</th>
						<th>Sản phẩm</th>
						<th>Tổng cộng</th>
						<th>Ngày đặt hàng</th>
						<th>Đặt bởi</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="item" items="${ listOrderDetailByUserID }">
						<tr class="text-center">
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
	<br><br><br>
	<!-- Start main body Area -->

	<!-- start footer Area -->
	<%@include file="/common/web/footer.jsp"%>
	<!-- End footer Area -->

	<!-- Javascript -->
	<%@include file="/common/web/js.jsp"%>
	<!-- End javascript -->
</body>
</html>