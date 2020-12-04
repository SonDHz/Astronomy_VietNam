<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>

<!DOCTYPE html>
<html lang="en" >

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
<title>Ruft Blog</title>
<!-- css -->

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
						<div class="row">
							<div class="col-lg-4 col-md-4">
								<div class="single-post-item">
									<div class="post-thumb">
										<img src="../../template/web/img/archive/1.jpg" height="529"
											width="auto" alt="">
									</div>
									<div class="post-details">
										<h4>
											<a href="#">An Stormy Evening</a>
										</h4>
										<p>There is a moment in the life of any aspiring
											astronomer that it is time to buy that first telescope. Itâs
											exciting to think about setting up your own viewing station.</p>
										<div class="blog-meta">
											<a href="#" class="btn btn-primary">Thêm vào giỏ hàng</a>
										</div>
									</div>
								</div>
							</div>

							<div class="col-lg-4 col-md-4">
								<div class="single-post-item">
									<div class="post-thumb">
										<img src="../../template/web/img/archive/2.jpg" height="529"
											width="auto" alt="">
									</div>
									<div class="post-details">
										<h4>
											<a href="#">An Stormy Evening</a>
										</h4>
										<p>There is a moment in the life of any aspiring
											astronomer that it is time to buy that first telescope. Itâs
											exciting to think about setting up your own viewing station.</p>
										<div class="blog-meta">
											<a href="#" class="btn btn-primary">Thêm vào giỏ hàng</a>
										</div>
									</div>
								</div>
							</div>
							
							<div class="col-lg-4 col-md-4">
								<div class="single-post-item">
									<div class="post-thumb">
										<img src="../../template/web/img/archive/3.jpg" height="529"
											width="auto" alt="">
									</div>
									<div class="post-details">
										<h4>
											<a href="#">An Stormy Evening</a>
										</h4>
										<p>There is a moment in the life of any aspiring
											astronomer that it is time to buy that first telescope. Item
											exciting to think about setting up your own viewing station.</p>
										<div class="blog-meta">
											<a href="#" class="btn btn-primary">Thêm vào giỏ hàng</a>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="col-lg-12">
							<nav class="blog-pagination justify-content-center d-flex">
								<ul class="pagination">
									<li class="page-item"><a href="#" class="page-link"
										aria-label="Previous"> <span aria-hidden="true"> <span
												class="lnr lnr-arrow-left"></span>
										</span>
									</a></li>
									<li class="page-item"><a href="#" class="page-link">01</a></li>
									<li class="page-item active"><a href="#" class="page-link">02</a></li>
									<li class="page-item"><a href="#" class="page-link">03</a></li>
									<li class="page-item"><a href="#" class="page-link">04</a></li>
									<li class="page-item"><a href="#" class="page-link">09</a></li>
									<li class="page-item"><a href="#" class="page-link"
										aria-label="Next"> <span aria-hidden="true"> <span
												class="lnr lnr-arrow-right"></span>
										</span>
									</a></li>
								</ul>
							</nav>
						</div>
				</div>
				</section>
				<!-- Start Post Area -->
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