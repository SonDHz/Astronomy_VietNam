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

<!-- Author Meta -->
<meta name="author" content="codepixer">
<!-- Meta Description -->
<meta name="description" content="">
<!-- Meta Keyword -->
<meta name="keywords" content="">
<!-- meta character set -->
<meta charset="UTF-8">
<!-- Site Title -->
<title>Thiên Văn Việt</title>
<!-- css -->
<style>
.fa fa-user-circle fa-2x{
padding:10px;}
</style>
<%@include file="/common/web/style.jsp"%>

</head>

<body>
	<!-- ==========Start header========== -->
	<%@include file="/common/web/header.jsp"%>
	<!-- ==========Stop header========== -->

	<!-- Top Stories Area -->
	<section class="top-stories-area">
		<div class="container-fluid">
			<div class="row">
				<div class="col-lg-12">
				<form:form id="formSubmit" role="form" class="owl-carousel active-stories-carousel" >
						<c:forEach var="posts" items="${entity}">
					<div >
						<!-- single stories carousel -->
						
						<div class="single-stories-carousel d-flex align-items-center">
						
							<div class="stories-thumb">
							<c:url var="display" value='/getImageViewPost'>
													<c:param name="img" value="${posts.thumbnail}"/>
												</c:url>
												<img width="50px" height="100px" alt="" src="${display}" >
							</div>
							<div class="stories-details">
								<h6>
									<c:url var="view" value="/postViewDetail">
												<c:param name="id" value="${posts.id}"></c:param>
											</c:url>
											<a href="${view}">${posts.title}</a>
								</h6>
							</div>
							
						</div>
						
					</div>
					</c:forEach>
							</form:form>
				</div>
			</div>
		</div>
	</section>
	<!-- End Stories Area -->

	<!-- Start Post Silder Area -->
	<section class="post-slider-area">
		<div class="container-fluid">
			<div class="row justify-content-center">
				<div class="col-lg-12">
				<form:form id="formSubmit" role="form" class="owl-carousel active-post-carusel" >
						<c:forEach var="postsramdom" items="${entityramdom}">
					<div >
						<!-- single carousel item -->
						<div class="single-post-carousel">
							<div class="post-thumb">
							<c:url var="display" value='/getImageViewPost'>
													<c:param name="img" value="${postsramdom.thumbnail}"/>
												</c:url>
												<img alt="" src="${display}" height="500px" width="400px" >
							</div>
							<div class="post-details">
								<h2>
									<c:url var="view" value="/postViewDetail">
												<c:param name="id" value="${postsramdom.id}"></c:param>
											</c:url>
											<a href="${view}">${postsramdom.title}</a>
								</h2>
								<div class="post-content d-flex justify-content-between">
									<div class="details">
										<p>${postsramdom.shortDescription}</p>
									</div>
								</div>
							</div>
						</div>
					</div>
					</c:forEach>
					</form:form>
				</div>
			</div>
		</div>
	</section>
	<!-- Start Post Silder Area -->

	<!-- Start main body Area -->
	<div class="main-body section-gap">
		<div class="container box_1170">
			<div class="row">
				<div class="col-lg-8 post-list">
					<!-- Start Post Area -->
					<section class="post-area">
						<div class="row">
						<form:form id="formSubmit" role="form" class="row ">
						<c:forEach var="post" items="${postView}">
							<div class="col-lg-5 col-md-7">
								<div class="single-post-item"> 
									<div class="post-thumb">
										<c:url var="display" value='/getImageViewPost'>
													<c:param name="img" value="${post.thumbnail}"/>
												</c:url>
												<img alt="" src="${display}" width="800px" height="600px">
									</div>
									<div class="post-details">
										<h4>
											<c:url var="view" value="/postViewDetail">
												<c:param name="id" value="${post.id}"></c:param>
											</c:url>
											<a href="${view}">${post.title}</a>
										</h4>
										<p>${post.shortDescription  }</p>
									</div>
								</div>
							
							</div>
						</c:forEach>
								</form:form>
							<div class="col-lg-12">
								<nav class="blog-pagination justify-content-center d-flex">
									<ul class="pagination">
										<c:if test="${currentPage  > 1}">
										<li class="page-item"><a
											href="/${currentPage - 1}" class="page-link"
											aria-label="Previous"> <span aria-hidden="true"> <span
													class="lnr lnr-arrow-left"></span>
											</span>
										</a></li>
									</c:if>						
									<c:forEach var="i" begin="1" end="${totalPages}">
										<c:choose>
											<c:when test="${currentPage == i}">
												<li class="page-item active "><a
													href="/${i}" class="page-link">${i}</a></li>
											</c:when>
											<c:otherwise>
												<li class="page-item  "><a href="/${i}"
													class="page-link">${i}</a></li>
											</c:otherwise>
										</c:choose>
									</c:forEach>
									
									<c:if test="${currentPage < totalPages}">
										<li class="page-item"><a
											href="/${currentPage + 1}" class="page-link"
											aria-label="Next"> <span aria-hidden="true"> <span
													class="lnr lnr-arrow-right"></span>
											</span>
										</a></li>

									</c:if>
									</ul>
								</nav>
							</div>
						</div>
					</section>
					
				</div>
<!-- Start Post Area -->
				<div class="col-lg-4 sidebar">
					<div class="single-widget protfolio-widget">
						<img class="img-fluid" src="../../template/web/img/blog/user2.png" alt="">
						<a href="#">
							<h4>Peter Anderson</h4>
						</a>
						<p class="p-text">Boot camps have its supporters andit
							sdetractors. Some people do not understand why you should have to
							spend money on boot camp whenyou can get. Boot camps have
							itssuppor ters andits detractors.</p>
						<ul class="social-links">
							<li><a href="#"><i class="fa fa-facebook"></i></a></li>
							<li><a href="#"><i class="fa fa-twitter"></i></a></li>
							<li><a href="#"><i class="fa fa-dribbble"></i></a></li>
							<li><a href="#"><i class="fa fa-behance"></i></a></li>
						</ul>
						<img src="../../template/web/img/sign.png" alt="">
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
</body>

</html>