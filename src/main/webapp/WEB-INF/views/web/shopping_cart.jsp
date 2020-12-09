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
<title>Giỏ hàng</title>
<!-- css -->
<style>
table {
  width: 100%;
}
p{
color:#7c32ff;}
b{
display:flex;}
</style>
<%@include file="/common/web/style.jsp"%>
</head>

<body>
	<!-- ==========Start header========== -->
	<%@include file="/common/web/header.jsp"%>
	<!-- ==========Stop header========== -->
	<!-- Top Stories Area -->
	<!-- Start main body Area -->
	<div class="main-body section-gap">
		<div class="container box_1170">
			<div class="row">
				<div class="col-lg-12 post-list">
					<!-- Start Post Area -->
					<section class="post-area">
					<p style="font-size:40px"><strong>Giỏ hàng</strong></p>
					<br>
					
						<div>
							<table class="table table-bordered">
								<thead class="thead-dark">
									<tr class="text-center">
										<th>Tên sản phẩm</th>
										<th>Hình ảnh</th>
										<th>Số lượng</th>
										<th>Giá tiền</th>
										<th>Tổng cộng</th>
									</tr>
								</thead>
								<tbody>
									<tr class="text-center">
										<td>Sách thiên văn</td>
										<td>Otto</td>
										<td>1</td>
										<th>10.000VNĐ</th>
										<td>10.000VNĐ&nbsp;<button class="btn btn-info">Xóa</button></td>
										
									</tr>
									<tr class="text-center">
										<td>Ống nhòm thiên văn</td>
										<td>Thornton</td>
										<td>2</td>
										<td>20.000VNĐ</td>
										<td>20.000VNĐ&nbsp;<button class="btn btn-info">Xóa</button></td>
									</tr>
									<tr class="text-center">
										<td>Kính thiên văn</td>
										<td>Alice</td>
										<td>3</td>
										<td>30.000VNĐ</td>
										<td>30.000VNĐ&nbsp;<button class="btn btn-info">Xóa</button></td>
									</tr>
								</tbody>
							</table>
							<br>
							<div class="b">
							<button class="btn btn-primary">Hình thức thanh toán</button>&nbsp;&nbsp;
							<button class="btn btn-danger">Tiến hành đặt hàng</button>
							</div>
						</div>
					</section>
				</div>
				
			</div>
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