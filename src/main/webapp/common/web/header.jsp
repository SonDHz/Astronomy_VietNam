<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>

<!--================ Start header Top Area =================-->

<section class="header-top">
	<div class="container box_1170">
		<div class="row align-items-center justify-content-between">
			<div class="col-lg-6 col-md-6 col-sm-6">
				<a href="index.html" class="logo"> <img
					src="<c:url value ='/template/web/img/logo.png'/>" alt="">
				</a>
			</div>
			<div class="col-lg-6 col-md-6 col-sm-6 search-trigger">
				<a href="#" class="search"> <i class="lnr lnr-magnifier"
					id="search"></i></a>
			</div>
		</div>
	</div>
</section>
<!--================ End header top Area =================-->

<!-- Start header Area -->
<header id="header">
	<div class="container box_1170 main-menu">
		<div class="row align-items-center justify-content-center d-flex">
			<nav id="nav-menu-container">
				<ul class="nav-menu">
					<li class="menu-active"><a href="/"><Strong>Trang
								chủ</Strong></a></li>
					<li><a href="/shoppingTools"><Strong>Sản phẩm</Strong></a></li>
					<li class="menu-has-children"><a href="#"><Strong>Tham
								khảo</Strong></a>
						<ul>
							<li><a href="blog-details.html"><h6>Bài viết</h6></a></li>
							<li><a href="blog-details.html"><h6>Giải trí</h6></a></li>
						</ul></li>
					<li><a href="#"><Strong>Tin tức</Strong></a></li>
					<li><a href="#"><Strong>Liên hệ</Strong></a></li>
					<li><a href="/login"
						class="genric-btn success circle arrow text-success"><Strong>Đăng
								nhập<Strong></a></li>
				</ul>
			</nav>
		</div>
	</div>

	<div class="search_input" id="search_input_box">
		<div class="container box_1170">
			<form class="d-flex justify-content-between">
				<input type="text" class="form-control" id="search_input"
					placeholder="Search Here">
				<button type="submit" class="btn"></button>
				<span class="lnr lnr-cross" id="close_search" title="Close Search"></span>
			</form>
		</div>
	</div>
</header>
<!-- End header Area -->