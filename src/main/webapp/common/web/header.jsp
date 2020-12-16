<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<%@include file="/common/taglib.jsp"%>
<%@include file="/common/web/style.jsp"%>
<%@ page import="com.astronomy.Utils.SecurityUtils"%>
<c:url var="productcategoryURL" value="/admin/productCategoryView"/>
<c:url var="productcategoryAPI" value="/api/ProductCategory"/>
<!--================ Start header Top Area =================-->

<section class="header-top">
	<div class="container box_1170">
		<div class="row align-items-center justify-content-between">
			<div class="col-lg-6 col-md-6 col-sm-6">
				<a href="index.html" class="logo"> <img
					src="<c:url value ='/template/web/img/logo.png'/>" alt="">
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
					<a href="#">
                        Welcome, ${ user.username }
                    </a>
					<a href="/logout" class="genric-btn info circle arrow text-gray"
						style="font-size: 12px;"><Strong> <i
							class="fa fa-user-circle fa-3x,font-size:1000px"></i>&nbsp;&nbsp;&nbsp;ĐĂNG
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
								
					<li><a href="#"><Strong><i
								class="fa fa-gift fa-lg,font-size:10px"></i>&nbsp;&nbsp;Sản phẩm</Strong></a>
								<ul>
								<c:forEach var="item" items="${productCategorySession}">
							<li><a href='<c:url value= "/shoppingTools/${item.id}"/>'><h6>
										<i class="fa fa-newspaper-o fa-lg,font-size:10px"></i>&nbsp;&nbsp;${item.name}
									</h6></a></li>
								</c:forEach>	
						</ul>
								</li>
		
					<li class="menu-has-children"><a href="#"><Strong><i
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
								class="fa fa-info fa-lg,font-size:10px"></i>&nbsp;&nbsp;Tin tức</Strong></a></li>
					<li><a href="#"><Strong><i
								class="fa fa-comment-o fa-lg,font-size:10px"></i>&nbsp;&nbsp;Liên
								hệ</Strong></a></li>
				</ul>

			</nav>
			<div class="d-flex justify-content-end">
				<nav id="nav-menu-container">
					<div class="header_cart">
						<div class="header_cart-wrap">
							<i class=" header_cart-icon fa fa-shopping-cart text-warning"></i>
							<span class="header_cart-notice">${TotalQuanty}</span>
							<!--Has cart: header_cart-no-cart -->
							<div class="header_cart-list ">
								<img src="./assets/img/no-cart.png" alt=""
									class="header_cart-no-cart-img"> <span
									class="header_cart-list-no-cart-msg"> Chưa có sản phẩm </span>
								<h4 class="hedear_cart-heading">Sản phẩm đã thêm</h4>
								<ul class="hedear_cart-list-item">
									<!--Cart item-->
									<li class="hedear_cart-item"><img
										src="https://img.abaha.vn/photos/resized/1024x/73-1573713479-myohui.png"
										alt="" class="header_cart-img">
										<div class="header_cart-item-info">
											<div class="header_cart-item-head">
												<h5 class="header_cart-item-name">Kính</h5>
												<div class="header_cart-item-price-wrap">
													<span class="header_cart-item-price">2.000.000đ</span> <span
														class="header_cart-item-multiply">x</span> <span
														class="header_cart-item-quantlity">2</span>
												</div>
											</div>
											<br>
											<div class="header_cart-item-body">
												<span class="header_cart-item-des">Thương hiệu:</span> <span
													class="header_cart-item-del">Xóa</span>
											</div>
										</div></li>
									<li class="hedear_cart-item"><img
										src="https://img.abaha.vn/photos/resized/1024x/73-1573713479-myohui.png"
										alt="" class="header_cart-img">
										<div class="header_cart-item-info">
											<div class="header_cart-item-head">
												<h5 class="header_cart-item-name">Sách</h5>
												<div class="header_cart-item-price-wrap">
													<span class="header_cart-item-price">2.000.000đ</span> <span
														class="header_cart-item-multiply">x</span> <span
														class="header_cart-item-quantlity">2</span>
												</div>
											</div>
											<br>
											<div class="header_cart-item-body">
												<span class="header_cart-item-des">Thương hiệu:</span> <span
													class="header_cart-item-del">Xóa</span>
											</div>
										</div></li>
									<li class="hedear_cart-item"><img
										src="https://img.abaha.vn/photos/resized/1024x/73-1573713479-myohui.png"
										alt="" class="header_cart-img">
										<div class="header_cart-item-info">
											<div class="header_cart-item-head">
												<h5 class="header_cart-item-name">Tài liệu</h5>
												<div class="header_cart-item-price-wrap">
													<span class="header_cart-item-price">2.000.000đ</span> <span
														class="header_cart-item-multiply">x</span> <span
														class="header_cart-item-quantlity">2</span>
												</div>
											</div>
											<br>
											<div class="header_cart-item-body">
												<span class="header_cart-item-des">Thương hiệu:</span> <span
													class="header_cart-item-del">Xóa</span>
											</div>
										</div></li>
									<li class="hedear_cart-item"><img
										src="https://img.abaha.vn/photos/resized/1024x/73-1573713479-myohui.png"
										alt="" class="header_cart-img">
										<div class="header_cart-item-info">
											<div class="header_cart-item-head">
												<h5 class="header_cart-item-name">Tài liệu</h5>
												<div class="header_cart-item-price-wrap">
													<span class="header_cart-item-price">2.000.000đ</span> <span
														class="header_cart-item-multiply">x</span> <span
														class="header_cart-item-quantlity">2</span>
												</div>
											</div>
											<br>
											<div class="header_cart-item-body">
												<span class="header_cart-item-des">Thương hiệu:</span> <span
													class="header_cart-item-del">Xóa</span>
											</div>
										</div></li>
									<li class="hedear_cart-item"><img
										src="https://img.abaha.vn/photos/resized/1024x/73-1573713479-myohui.png"
										alt="" class="header_cart-img">
										<div class="header_cart-item-info">
											<div class="header_cart-item-head">
												<h5 class="header_cart-item-name">Tài liệu</h5>
												<div class="header_cart-item-price-wrap">
													<span class="header_cart-item-price">2.000.000đ</span> <span
														class="header_cart-item-multiply">x</span> <span
														class="header_cart-item-quantlity">2</span>
												</div>
											</div>
											<br>
											<div class="header_cart-item-body">
												<span class="header_cart-item-des">Thương hiệu:</span> <span
													class="header_cart-item-del">Xóa</span>
											</div>
										</div></li>
									<li class="hedear_cart-item"><img
										src="https://img.abaha.vn/photos/resized/1024x/73-1573713479-myohui.png"
										alt="" class="header_cart-img">
										<div class="header_cart-item-info">
											<div class="header_cart-item-head">
												<h5 class="header_cart-item-name">Tài liệu</h5>
												<div class="header_cart-item-price-wrap">
													<span class="header_cart-item-price">2.000.000đ</span> <span
														class="header_cart-item-multiply">x</span> <span
														class="header_cart-item-quantlity">2</span>
												</div>
											</div>
											<br>
											<div class="header_cart-item-body">
												<span class="header_cart-item-des">Thương hiệu:</span> <span
													class="header_cart-item-del">Xóa</span>
											</div>
										</div></li>
								</ul>
								<a href="/shopping_cart"
									class="header_cart-view-cart btn btn-primary">Xem giỏ hàng</a>
							</div>
						</div>
					</div>
				</nav>
			</div>
		</div>
	</div>
</header>
<!-- End header Area -->