<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>

<!DOCTYPE html>
<html lang="en">
<!-- BEGIN HEAD -->
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta content="width=device-width, initial-scale=1" name="viewport">
<meta name="description" content="Responsive Admin Template">
<meta name="author" content="SmartUniversity">
<title>Trang chủ</title>
<!-- google font -->
<%@include file="/common/admin/style.jsp"%>
</head>
<!-- END HEAD -->
<body
	class="page-header-fixed sidemenu-closed-hidelogo page-content-white page-md header-white dark-sidebar-color logo-dark">

	<!-- start header -->
	<%@include file="/common/admin/header.jsp"%>
	<!-- end header -->
	<!-- start color quick setting -->
	<div class="quick-setting-main">
		<button class="control-sidebar-btn btn" data-toggle="control-sidebar">
			<i class="fa fa-cog fa-spin"></i>
		</button>
		<div class="quick-setting display-none">
			<ul id="themecolors">

				<li><p class="selector-title">Sidebar Color</p></li>
				<li class="complete"><div class="theme-color sidebar-theme">
						<a href="#" data-theme="white"><span class="head"></span><span
							class="cont"></span></a> <a href="#" data-theme="dark"><span
							class="head"></span><span class="cont"></span></a> <a href="#"
							data-theme="blue"><span class="head"></span><span
							class="cont"></span></a> <a href="#" data-theme="indigo"><span
							class="head"></span><span class="cont"></span></a> <a href="#"
							data-theme="cyan"><span class="head"></span><span
							class="cont"></span></a> <a href="#" data-theme="green"><span
							class="head"></span><span class="cont"></span></a> <a href="#"
							data-theme="red"><span class="head"></span><span class="cont"></span></a>
					</div></li>
				<li><p class="selector-title">Header Brand color</p></li>
				<li class="theme-option"><div class="theme-color logo-theme">
						<a href="#" data-theme="logo-white"><span class="head"></span><span
							class="cont"></span></a> <a href="#" data-theme="logo-dark"><span
							class="head"></span><span class="cont"></span></a> <a href="#"
							data-theme="logo-blue"><span class="head"></span><span
							class="cont"></span></a> <a href="#" data-theme="logo-indigo"><span
							class="head"></span><span class="cont"></span></a> <a href="#"
							data-theme="logo-cyan"><span class="head"></span><span
							class="cont"></span></a> <a href="#" data-theme="logo-green"><span
							class="head"></span><span class="cont"></span></a> <a href="#"
							data-theme="logo-red"><span class="head"></span><span
							class="cont"></span></a>
					</div></li>
				<li><p class="selector-title">Header color</p></li>
				<li class="theme-option"><div class="theme-color header-theme">
						<a href="#" data-theme="header-white"><span class="head"></span><span
							class="cont"></span></a> <a href="#" data-theme="header-dark"><span
							class="head"></span><span class="cont"></span></a> <a href="#"
							data-theme="header-blue"><span class="head"></span><span
							class="cont"></span></a> <a href="#" data-theme="header-indigo"><span
							class="head"></span><span class="cont"></span></a> <a href="#"
							data-theme="header-cyan"><span class="head"></span><span
							class="cont"></span></a> <a href="#" data-theme="header-green"><span
							class="head"></span><span class="cont"></span></a> <a href="#"
							data-theme="header-red"><span class="head"></span><span
							class="cont"></span></a>
					</div></li>
			</ul>
		</div>
	</div>
	<!-- end color quick setting -->
	<!-- start page container -->
	<div class="page-container">
		<!-- start sidebar menu -->
		<%@include file="/common/admin/sidebar.jsp"%>
		<!-- end sidebar menu -->
		<!-- start page content -->
		<div class="page-content-wrapper">
			<div class="page-content">
				<div class="page-bar">
					<div class="page-title-breadcrumb">
						<div class=" pull-left">
							<div class="page-title">Trang chủ</div>
						</div>
						<ol class="breadcrumb page-breadcrumb pull-right">
							<li><i class="fa fa-home"></i>&nbsp;<a class="parent-item"
								href="#">Home</a>&nbsp;</li>
						</ol>
					</div>
				</div>
				<!-- start widget -->
				<div class="row">
					<div class="col-lg-3 col-md-6 col-sm-6 col-12">
						<div class="analysis-box m-b-0 bg-b-purple">
							<h3 class="text-white box-title">
								Số lượng hóa đơn <span class="pull-right">${order}</span>
							</h3>
							<i class="fa fa-credit-card text-white fa fa-2x"></i>
						</div>
					</div>
					<div class="col-lg-3 col-md-6 col-sm-6 col-12">
						<div class="analysis-box m-b-0 bg-b-danger">
							<h3 class="text-white box-title">
								Số lượng sản phẩm <span class="pull-right">${product}</span>
							</h3>
							<i class="fa fa-tasks text-white fa fa-2x"></i>
						</div>
					</div>
					<div class="col-lg-3 col-md-6 col-sm-6 col-12">
						<div class="analysis-box m-b-0 bg-b-cyan">
							<h3 class="text-white box-title">
								Số lượng tài khoản<span class="pull-right">${accout}</span>
							</h3>
							<i class="fa fa-users text-white fa fa-2x"></i>
						</div>
					</div>
					<div class="col-lg-3 col-md-6 col-sm-6 col-12">
						<div class="analysis-box m-b-0 bg-b-blue">
							<h3 class="text-white box-title">
								Số lượng bài viết <span class="pull-right">${post}</span>
							</h3>
							<i class="fa fa-file text-white fa fa-2x"></i>
						</div>
					</div>
				</div>
				<!-- end widget -->
				<!-- chart start -->
				<div class="row">
					<div class="col-lg-6 col-md-12 col-sm-12 col-12">
						<div class="card card-box">
							<div class="card-head">
								<header>Income/Expense Report </header>
								<div class="tools">
									<a class="fa fa-repeat btn-color box-refresh"
										href="javascript:;"></a> <a
										class="t-collapse btn-color fa fa-chevron-down"
										href="javascript:;"></a> <a
										class="t-close btn-color fa fa-times" href="javascript:;"></a>
								</div>
							</div>
							<div class="card-body no-padding height-9">
								<div class="row">
									<canvas id="bar-chart"></canvas>
								</div>
							</div>
						</div>
					</div>
					<div class="col-lg-6 col-md-12 col-sm-12 col-12">
						<div class="card card-box">
							<div class="card-head">
								<header>Income/Expense Report</header>
								<div class="tools">
									<a class="fa fa-repeat btn-color box-refresh"
										href="javascript:;"></a> <a
										class="t-collapse btn-color fa fa-chevron-down"
										href="javascript:;"></a> <a
										class="t-close btn-color fa fa-times" href="javascript:;"></a>
								</div>
							</div>
							<div class="card-body no-padding height-9">
								<div class="row">
									<canvas id="myChart"></canvas>
								</div>
							</div>
						</div>
					</div>
				</div>
				<!-- Chart end -->
				<!-- start course list -->

				<%-- <div>
					<form:form id="formSubmit" role="form" class="row ">
						<c:forEach var="postdashboard" items="${entity}">
							<div class="col-lg-3 col-md-6 col-12 col-sm-6">
								<div class="blogThumb">
									<div class="thumb-center">
										<c:url var="display" value='/admin/getImageViewPostDashboard'>
											<c:param name="img" value="${postdashboard.thumbnail}" />
										</c:url>
										<img alt="" src="${display}" width="260px" height="200px">
									</div>
									<div class="white-box">
										<div class="text-muted">
											<span class="m-r-10">${postdashboard.createdDate}</span> <a
												class="text-muted m-l-10" href="#"><i
												class="fa fa-heart-o"></i></a>
										</div>
										<h3 class="m-t-20 m-b-20">${postdashboard.title}</h3>
										<p>${postdashboard.shortDescription}</p>
										<c:url var="view" value="/postViewDetail">
											<c:param name="id" value="${postdashboard.id}"></c:param>
										</c:url>
										<a href="${view}"
											class="btn btn-success btn-rounded waves-effect waves-light m-t-20">
											Xem thêm</a>
									</div>
								</div>
							</div>
						</c:forEach>
					</form:form>
				</div> --%>
				<!-- end page content -->
				<!-- start chat sidebar -->
				<div class="chat-sidebar-container" data-close-on-body-click="false">
					<div class="chat-sidebar">
						<div class="tab-content">
							<!-- Start User Chat -->
							<div
								class="tab-pane active chat-sidebar-chat in active show animated slideInRight"
								role="tabpanel" id="quick_sidebar_tab_1">
								<!-- End User Chat -->
								<!-- Start Setting Panel -->
								<div class="tab-pane chat-sidebar-settings animated slideInUp"
									role="tabpanel" id="quick_sidebar_tab_3">
									<div class="chat-sidebar-settings-list slimscroll-style">
										<div class="chat-header">
											<h5 class="list-heading">
												<i class="fa fa-cog"></i>&nbsp;&nbsp;Cài đặt
											</h5>
										</div>
										<div class="chatpane inner-content ">
											<div class="settings-list">
												<div class="setting-item">
													<div class="setting-text">Sidebar Position</div>
													<div class="setting-set">
														<select
															class="sidebar-pos-option form-control input-inline input-sm input-small ">
															<option value="left" selected="selected">Left</option>
															<option value="right">Right</option>
														</select>
													</div>
												</div>
												<div class="setting-item">
													<div class="setting-text">Header</div>
													<div class="setting-set">
														<select
															class="page-header-option form-control input-inline input-sm input-small ">
															<option value="fixed" selected="selected">Fixed</option>
															<option value="default">Default</option>
														</select>
													</div>
												</div>
												<div class="setting-item">
													<div class="setting-text">Sidebar Menu</div>
													<div class="setting-set">
														<select
															class="sidebar-menu-option form-control input-inline input-sm input-small ">
															<option value="accordion" selected="selected">Accordion</option>
															<option value="hover">Hover</option>
														</select>
													</div>
												</div>
												<div class="setting-item">
													<div class="setting-text">Footer</div>
													<div class="setting-set">
														<select
															class="page-footer-option form-control input-inline input-sm input-small ">
															<option value="fixed">Fixed</option>
															<option value="default" selected="selected">Default</option>
														</select>
													</div>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<!-- end chat sidebar -->
			</div>
			<!-- end page container -->
			<!-- start footer -->
			<%@include file="/common/admin/footer.jsp"%>
			<!-- end footer -->
			<!-- start js include path -->
			<%@include file="/common/admin/js.jsp"%>
			<!-- end js include path -->
</body>
</html>