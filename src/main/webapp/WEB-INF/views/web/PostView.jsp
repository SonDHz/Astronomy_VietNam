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
.fa fa-user-circle fa-2x {
	padding: 10px;
}
</style>
<%@include file="/common/web/style.jsp"%>

</head>

<body>
	<!-- ==========Start header========== -->
	<%@include file="/common/web/header.jsp"%>
	<!-- ==========Stop header========== -->

	<!-- Top Stories Area -->
	<div class="container">
		<div class="row" style="margin-top: 150px">
			<form:form role="form" class="form-horizontal" modelAttribute="model"
				method="GET">
							<h4>${ model.title }</h4>	
								${ model.content } 
								<Strong></Strong>
			</form:form>
			<%-- <c:forEach var="item" items="${model}">
								 ${ item.title }
							</c:forEach> --%>
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