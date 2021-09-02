<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<%@include file="/common/taglib.jsp"%>
<%@include file="/common/web/style.jsp"%>
<c:url var="productcategoryURL" value="/admin/productCategoryView" />
<c:url var="productcategoryAPI" value="/api/ProductCategory" />

<!--================ Start header Top Area =================-->

<section class="header-top">
	<div class="container box_1170">
		<div class="row align-items-center justify-content-between">
			<div class="col-lg-6 col-md-6 col-sm-6">
				<a href="/">
					<p class="logo">Astronomy</p>
				</a>
			</div>

			<div class="col-lg-6 col-md-6 col-sm-6 search-trigger ">
				<!-- <a href="/login" class="genric-btn info circle arrow text-gray"
					style="font-size: 12px;"><Strong> <i
						class="fa fa-user-circle fa-3x,font-size:1000px"></i>&nbsp;&nbsp;&nbsp;ĐĂNG
						NHẬP
				</Strong></a> -->
				<security:authorize access="isAuthenticated()">
					<security:authentication property="principal" var="user" />
					<a href="/logout" class="genric-btn info circle arrow text-gray"
						style="font-size: 12px;"><Strong> <i
							class="fa fa-sign-out fa-3x,font-size:1000px"></i>&nbsp;&nbsp;&nbsp;ĐĂNG
							XUẤT
					</Strong></a>
				</security:authorize>
				<security:authorize access="!isAuthenticated()">
					<a href="/login" class="genric-btn info circle arrow text-gray"
						style="font-size: 12px;"><Strong> <i
							class="fa fa-user-circle fa-3x,font-size:1000px"></i>&nbsp;&nbsp;&nbsp;ĐĂNG
							NHẬP
					</Strong></a>
				</security:authorize>
			</div>
		</div>
	</div>
</section>
<!--================ End header top Area =================-->

<!-- Start header Area -->
<header id="header">
	<div class="container box_1170 main-menu">
		<div>
			<nav id="nav-menu-container">
				<ul class="nav-menu">
					<li><a href="/"><Strong><i
								class="fa fa-home fa-lg,font-size:10px"></i>&nbsp;&nbsp;Trang
								chủ</Strong></a></li>


					<li><a href="/about_us"><strong> <i
								class="fa fa-newspaper-o fa-lg,font-size:10px"></i>&nbsp;&nbsp;Giới thiệu
								
						</strong> </a></li>



					<li><a href="#"><Strong><i
								class="fa fa-gift fa-lg,font-size:10px"></i>&nbsp;&nbsp;Sản phẩm</Strong></a>
						<ul>
							<c:forEach var="item" items="${productCategorySession}">
								<li><a href='<c:url value= "/shoppingTools/${item.id}"/>'><h6>
											<i class="fa fa-newspaper-o fa-lg,font-size:10px"></i>&nbsp;&nbsp;${item.name}
										</h6></a></li>
							</c:forEach>
						</ul></li>

					<!-- <li class="menu-has-children"><a href="#"><Strong><i
								class="fa fa-table fa-lg,font-size:10px"></i>&nbsp;&nbsp;Tham
								khảo</Strong></a>
						<ul>
							<li><a href="blog-details.html"><h6>
										<i class="fa fa-newspaper-o fa-lg,font-size:10px"></i>&nbsp;&nbsp;Bài
										viết
									</h6></a></li>
							<li><a href="blog-details.html"><h6>
										<i class="fa fa-list fa-lg,font-size:10px"></i>&nbsp;&nbsp;Giải
										trí
									</h6></a></li>
						</ul></li>

					<li><a href="#"><Strong><i
								class="fa fa-info fa-lg,font-size:10px"></i>&nbsp;&nbsp;Tin tức</Strong></a></li> -->
					<li><a href="/contact"><Strong><i
								class="fa fa-comment-o fa-lg,font-size:10px"></i>&nbsp;&nbsp;Liên
								hệ </Strong></a></li>

				</ul>
				<div class="d-flex justify-content-end">
					<security:authorize access="isAuthenticated()">
						<security:authentication property="principal" var="user" />
						<ul class="nav-menu">
							<li><a href="/user-bill-detail/${ user.id }">Welcome, ${ user.fullName }</a></li>
						</ul>
					</security:authorize>
					<nav id="nav-menu-container">
						<div class="header_cart">
							<div class="header_cart-wrap">
								<!--Has cart: header_cart-no-cart -->
								<a href="/shopping_cart"><i
									class=" header_cart-icon fa fa-shopping-cart text-muted"></i> <span
									class="header_cart-notice">${SESSION_TOTAL_QUANTITY}</span></a>
							</div>
						</div>
					</nav>
				</div>
			</nav>
		</div>
	</div>
</header>
<!-- End header Area -->