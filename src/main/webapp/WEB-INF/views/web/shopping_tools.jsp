<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp" %>

<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org"
	xmlns:layout="http://www.ultraq.net.nz/thymeleaf/layout">

<head>
<!-- Mobile Specific Meta -->
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<!-- Favicon-->
<link rel="shortcut icon" href="../../web/img/fav.png">
<!-- Author Meta -->
<meta name="author" content="codepixer">
<!-- Meta Description -->
<meta name="description" content="">
<!-- Meta Keyword -->
<meta name="keywords" content="">
<!-- meta character set -->
<meta charset="UTF-8">
<!-- Site Title -->
<title>Dụng cụ thiên văn</title>
<!-- css -->
<%@include file="/common/web/style.jsp" %>
<style>
.card-img-table {
  width: 38px;
  height: 38px;

}
</style>
</head>

<body>
	<!-- ==========Start header========== -->
	<%@include file="/common/web/header.jsp" %>
	<!-- ==========Stop header========== -->
	<!-- Top Stories Area -->
	<!-- Start main body Area -->
	<div class="main-body section-gap">
		<div class="container box_1170">
			<div class="row">
				<div class="col-lg-12 post-list">
					<!-- Start Post Area -->
					
						<div class="row">
							<div class="col-lg-4 col-md-4">
								<div class="single-post-item">
									<div class="post-thumb">
										<img src="<c:url value ='/template/web/img/archive/1.jpg'/>" height="529"
											width="auto" alt="">
									</div>
									<div class="post-details">
										<h4>
											<a href="#">Sản phẩm 1</a>
										</h4>
										<p class="card-text">Giá tiền: 20.000 VNĐ</p>
										<div class="blog-meta">
											  <a href="#" data-name="San-pham-1" data-price="20000" 
											  class="add-to-cart btn btn-primary">Thêm vào giỏ hàng</a>
										</div>
									</div>
								</div>
							</div>

							<div class="col-lg-4 col-md-4">
								<div class="single-post-item">
									<div class="post-thumb">
										<img src="<c:url value ='/template/web/img/archive/2.jpg'/>" height="529"
											width="auto" alt="">
									</div>
									<div class="post-details">
										<h4>
											<a href="#">Sản phẩm 2</a>
										</h4>
										 <p class="card-text">Giá tiền: 30.000 VNĐ</p>
										<div class="blog-meta">
											<a href="#" data-name="San-pham-2" data-price="30000"
											 class="add-to-cart btn btn-primary">Thêm vào giỏ hàng</a>
										</div>
									</div>
								</div>
							</div>
							
							<div class="col-lg-4 col-md-4">
								<div class="single-post-item">
									<div class="post-thumb">
										<img src="<c:url value ='/template/web/img/archive/3.jpg'/>" height="529"
											width="auto" alt="">
									</div>
									<div class="post-details">
										<h4>
											<a href="#">Sản phẩm 3</a>
										</h4>
										    <p class="card-text">Giá tiền: 40.000 VNĐ</p>
										<div class="blog-meta">
											<a href="#" data-name="San-pham-3" data-price="40000"
											 class="add-to-cart btn btn-primary">Thêm vào giỏ hàng</a>
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
				
				<!-- Start Post Area -->
			</div>
		</div>
	</div>

	<!-- Modal -->
<div class="modal fade" id="cart" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog modal-lg" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Giỏ hàng</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        <table class="show-cart table">
           

											
        </table>
        <div>Tổng cộng: <span class="total-cart"></span> VNĐ</div>
        <button class="clear-cart btn btn-danger">Xóa</button>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Đóng</button>
        <button type="button" class="btn btn-primary">Thanh toán</button>
      </div>
    </div>
  </div>
</div> 
	<!-- Start main body Area -->

	<!-- start footer Area -->
	<%@include file="/common/web/footer.jsp" %>
	<!-- End footer Area -->

	<!-- Javascript -->
	<%@include file="/common/web/js.jsp" %>
	<!-- End javascript -->
</body>

</html>