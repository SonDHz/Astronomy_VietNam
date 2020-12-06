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
						<div>
							<form:form id="formSubmit" role="form" class="row">
								<c:forEach var="item" items="${entityView}">
									<div class="col-lg-4 col-md-4">
										<div class="single-post-item">
											<div class="post-thumb">
												<c:url var="display" value='/getImageView'>
													<c:param name="img" value="${item.image}" />
												</c:url> 
												<img alt="" src="${display}" width="auto" height="550px">
											</div>
											<div class="post-details">
												<h4>
													<a href="#">${item.name}</a>
												</h4>
												<p>${item.shortDecription}</p>
												<div class="blog-meta">
													<a href="#" class="btn btn-primary">Thêm vào giỏ hàng</a>
												</div>
											</div>
										</div>
									</div>
								</c:forEach>
							</form:form>
						</div>
						<div class="col-lg-12">
							<nav class="blog-pagination justify-content-center d-flex">
								<ul class="pagination">
									<c:if test="${currentPage  > 1}">
										<li class="page-item"><a
											href="/shoppingTools/${currentPage - 1}" class="page-link"
											aria-label="Previous"> <span aria-hidden="true"> <span
													class="lnr lnr-arrow-left"></span>
											</span>
										</a></li>
									</c:if>
									<c:forEach var="i" begin="1" end="${totalPages}">
										<c:choose>
											<c:when test="${currentPage == i}">
												<li class="page-item active "><a href="/shoppingTools/${i}"
													class="page-link">${i}</a></li>
											</c:when>
											<c:otherwise>
												<li class="page-item  "><a href="/shoppingTools/${i}"
													class="page-link">${i}</a></li>
											</c:otherwise>
										</c:choose>
									</c:forEach>
									<c:if test="${currentPage < totalPages}">
										<li class="page-item"><a
											href="/shoppingTools/${currentPage + 1}" class="page-link"
											aria-label="Next"> <span aria-hidden="true"> <span
													class="lnr lnr-arrow-right"></span>
											</span>
										</a></li>
									</c:if>
								</ul>
							</nav>
						</div>

					</section>
				</div>
				<!-- Start Post Area -->
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