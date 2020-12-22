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
<title>Về chúng tôi</title>
<style>
.not {
	height: 400px;
	weight: 400px
}

p {
	text-align: justify;
}

.card-title {
	color: #7C32FF;
	font-size: 30px;
}

li {
	list-style-type: none;
}

.contact-page-area {
	background-image: url("../../template/web/img/1.gif");
	background-position: center;
	background-repeat: no-repeat;
	background-size: cover;
}
.card {
  opacity:0.9;
}
</style>
</head>
<body>
	<%@include file="/common/web/header.jsp"%>
	<!-- Start contact-page Area -->
	<section class="contact-page-area section-gap">
		<div class="container box_1170">
			<div class="card-deck">
				<div class="card">
					<img class="not" src="../../template/web/img/sp.jpg" alt="">
					<div class="card-body">
						<h5 class="card-title">
							<strong>Cung cấp sản phẩm thiên văn</strong>
						</h5>

						<p>- Chúng tôi: WWW.ASTRONOMY.COM là đơn vị hoạt động chuyên
							nghiệp về lĩnh vực quang học và thiết bị đo lường, chúng tôi
							chuyên cung cấp và chế tạo các thiết bị quang học như: ống nhòm,
							kính thiên văn, kính hiển vi, thiết bị quan trắc và các thiết bị
							quang học cao cấp của nhiều hãng khác nhau với chất lượng tốt
							nhất, giá cả luôn cạnh tranh và dịch vụ chăm sóc, tư vấn khách
							hàng chuyên nghiệp tận tình chu đáo.</p>
					</div>
					<!-- <div class="card-footer">
						<small class="text-muted">Last updated 3 mins ago</small>
					</div> -->
				</div>
				<div class="card">
					<img class="not" src="../../template/web/img/sp2.jpg" alt="">
					<div class="card-body">
						<h5 class="card-title">
							<strong>Blog thiên văn</strong>
						</h5>

						<p>
						<li>- Giới thiệu bộ môn Thiên văn học và Vật lý thiên văn cho
							tất cả người Việt Nam đang học tập và làm việc tại mọi nơi trong
							và ngoài nước dưới hình thức một môn khoa học.</li>
						<li>- Phổ biến kiến thức Thiên văn học và Vật ly thiên văn để
							mở rộng thế giới quan cho cộng đồng.</li>
						<li>- Chuẩn hóa thông tin, thuật ngữ chuyên ngành về thiên
							văn học, vật lý thiên văn và các lĩnh vực có liên quan.</li>
						</p>

					</div>
				</div>
				<!-- <div class="card">
					<img class="not" src="../../template/web/img/404.webp" alt="">
					<div class="card-body">
						<h5 class="card-title">Chưa biết</h5>
						<p class="card-text">This is a wider card with supporting text
							below as a natural lead-in to additional content. This card has
							even longer content than the first to show that equal height
							action.</p>
					</div>
					<div class="card-footer">
						<small class="text-muted">Last updated 3 mins ago</small>
					</div>
				</div> -->
				<!-- <div class="card">
					<img class="not" src="../../template/web/img/404.webp" alt="">
					<div class="card-body">
						<h5 class="card-title">Chưa biết</h5>
						<p class="card-text">This is a wider card with supporting text
							below as a natural lead-in to additional content. This card has
							even longer content than the first to show that equal height
							action.</p>
					</div>
					<div class="card-footer">
						<small class="text-muted">Last updated 3 mins ago</small>
					</div>
				</div> -->
			</div>
		</div>
	</section>
	<!-- start footer Area -->
	<%@include file="/common/web/footer.jsp"%>
	<!-- End footer Area -->

	<!-- Javascript -->
	<%@include file="/common/web/js.jsp"%>
	<!-- End javascript -->
</body>

</html>