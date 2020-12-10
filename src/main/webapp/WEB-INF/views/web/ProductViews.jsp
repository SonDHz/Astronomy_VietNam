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
<title>Sản phẩm 1</title>
<!-- css -->
<style>
.price {
	font-size: 20px
}

.title {
	font-size: 30px
}

.code {
	font-size: 30px
}

.pb-product-details-ul {
	list-style-type: none;
	padding-left: 0;
	color: black;
}

.pb-product-details-ul>li {
	padding-bottom: 5px;
	font-size: 15px;
}

#gradient {
	/* Permalink - use to edit and share this gradient: http://colorzilla.com/gradient-editor/#feffff+0,ddf1f9+31,a0d8ef+62 */
	background: #feffff; /* Old browsers */
	background: -moz-linear-gradient(left, #feffff 0%, #ddf1f9 31%, #a0d8ef 62%);
	/* FF3.6-15 */
	background: -webkit-linear-gradient(left, #feffff 0%, #ddf1f9 31%, #a0d8ef 62%);
	/* Chrome10-25,Safari5.1-6 */
	background: linear-gradient(to right, #feffff 0%, #ddf1f9 31%, #a0d8ef 62%);
	/* W3C, IE10+, FF16+, Chrome26+, Opera12+, Safari7+ */
	filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#feffff',
		endColorstr='#a0d8ef', GradientType=1); /* IE6-9 */
	border: 1px solid #f2f2f2;
	padding: 20px;
}

#hits {
	border-right: 1px solid white;
	border-left: 1px solid white;
	vertical-align: middle;
	padding-top: 15px;
	font-size: 17px;
	color: white;
}

#fan {
	vertical-align: middle;
	padding-top: 15px;
	font-size: 17px;
	color: white;
}

.pb-product-details-fa>span {
	padding-top: 20px;
}
</style>
<!-- Responsive Product Details - END -->
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
		
			<div id="gradient">
			<form:form id="formSubmit" role="form" class="form-horizontal row" action="/api/Product"
				modelAttribute="model" method="post" enctype="multipart/form-data">					
				<div class="col-md-4">
					<c:url var="display" value='/getImageView'>
						<c:param name="img" value="${model.image}" />
							</c:url> 
						<img alt="" src="${display}" width="auto" height="350px">
				</div>
				<div class="col-md-8" >
					<div class="row">
						<div class="col-xs-6 col-md-6">
							<ul class="pb-product-details-ul">
								<li><span class="fa fa-table fa-2x">
										<div class="code">
											<strong>${model.name}</strong>
										</div>
								</span></li>
							</ul>
						</div>
					</div>
					<br>
					<p>Mô tả: ${model.shortDecription}</p>
					<br>
					<div class="price">Giá: ${model.price}</div>
					<br> <br>
					<button type="button" class="btn btn-danger">Mua hàng</button>
					&nbsp;&nbsp;&nbsp;
					<button type="button" class="btn btn-primary">Thêm vào giỏ
						hàng</button>
				</div>
				</form:form>
			</div>
			<br>
			<div class="row">
				<div class="tabs_div">
					<ul>
						<li>Thông số kỹ thuật</li>
						<li>Phụ kiện đi kèm</li>
						<li>Tham khảo</li>
						<li>Giới thiệu</li>
					</ul>
					<div>
						<table class="table">
							<tbody>
								<tr>
									<td class="success">Thiết kế quang học:</td>
									<td>Phản xạ Newton</td>
								</tr>
								<tr>
									<td class="success">Đường kính:</td>
									<td>130mm (5.11 “)</td>
								</tr>
								<tr>
									<td class="success">Độ dài tiêu cự:</td>
									<td>650mm (25,6 “)</td>
								</tr>
								<tr>
									<td class="success">Khẩu độ:</td>
									<td>f /5</td>
								</tr>
								<tr>
									<td class="success">Kính định vị tìm mục tiêu</td>
									<td></td>
								</tr>
								<tr>
									<td class="success">Lớp phủ:</td>
									<td>Quang nhôm</td>
								</tr>
							</tbody>
						</table>
					</div>
					<div>
						<table class="table">
							<tbody>
								<tr>
									<td class="success">Bộ điều khiển tinh chỉnh</td>
									<td></td>
								</tr>
								<tr>
									<td class="success">Chân máy:</td>
									<td>Đường kính ống chân 1.25 ”</td>
								</tr>
								<tr>
									<td class="success">Phần mềm Starry Night Basic Edition</td>
									<td></td>
								</tr>
								<tr>
									<td class="success">Khay phụ kiện</td>
									<td></td>
								</tr>
							</tbody>
						</table>
					</div>
					<div>
						<table class="table">
							<tbody>
								<tr>
									<td>Kính thiên văn Celestron Astromaster 114EQ</td>
								</tr>
								<tr>
									<td>Kính thiên văn Celestron Astromater 70EQ</td>
									
								</tr>
								<tr>
									<td>Kính thiên văn Celestron Deluxe 130EQ </td>
								</tr>
							</tbody>
						</table>
					</div>
					<div>
						<table class="table">
							<tbody>
								<tr>
									
									<td>Celestron AstroMaster 130EQ là dòng kính thiên văn
										chính hãng rất tiện lợi cho các bạn mang đi du lịch, có thể
										được lắp ráp rất dễ dàng mà không cần thêm bất cứ dụng cụ phụ
										trợ nào. Nó còn là một món quà giải trí, học tập tuyệt vời của
										các ông bố bà mẹ dành tặng cho các bạn nhỏ muốn khám phá bầu
										trời, là chiếc kính rất phù hợp dành cho những bạn mới bắt đầu
										quan tâm đến thiên văn, vũ trụ muốn có một chiếc kính cho
										riêng mình. Với kính thiên văn Celestron AstroMaster 130EQ,
										bạn có thể quan sát được Mặt Trăng, sao Mộc, sao Thổ,…hay quan
										sát địa văn như một chiếc ống nhòm.r</td>
								</tr>
							</tbody>
						</table>
					</div>
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

	<script type="text/javascript"
		src="http://www.shieldui.com/shared/components/latest/js/shieldui-all.min.js"></script>
	<script type="text/javascript">
		jQuery(function($) {
			$(".tabs_div").shieldTabs();
		});
	</script>
</body>
<link rel="stylesheet" type="text/css"
	href="http://www.shieldui.com/shared/components/latest/css/light-glow/all.min.css" />
</html>