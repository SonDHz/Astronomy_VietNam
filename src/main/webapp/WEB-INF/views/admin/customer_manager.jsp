<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp" %>
<c:url var="customerURL" value="/admin/customerView" />
<c:url var="customerAPI" value="/api/User"/>
<!DOCTYPE html>
<html>
<!-- BEGIN HEAD -->
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta content="width=device-width, initial-scale=1" name="viewport">
<meta name="description" content="Responsive Admin Template">
<meta name="author" content="SmartUniversity">
<title>Quản lý khách hàng</title>
<!-- google font -->
<%@include file="/common/admin/style.jsp" %>
</head>
<!-- END HEAD -->
<body
	class="page-header-fixed sidemenu-closed-hidelogo page-content-white page-md header-white dark-sidebar-color logo-dark">
	<div class="page-wrapper">
		<!-- start header -->
		<%@include file="/common/admin/header.jsp" %>
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
								data-theme="red"><span class="head"></span><span
								class="cont"></span></a>
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
			<%@include file="/common/admin/sidebar.jsp" %>
			<!-- end sidebar menu -->
			<!-- start page content -->
			<div class="page-content-wrapper">
				<div class="page-content">
					<div class="page-bar">
						<div class="page-title-breadcrumb">
							<div class=" pull-left">
								<c:url var="createModify" value="createModify/customer" />
								<a href='${createModify}' type="button" aria-haspopup="true"
									aria-expanded="false" class="btn-shadow btn btn-info"> <span
									class="btn-icon-wrapper pr-2 opacity-7"> <i
										class="fa fa-business-time fa-w-20"></i>
								</span> Thêm tài khoản
								</a>
								<button id="btnDelete" type="button" aria-haspopup="true"
									onclick="warningBeforeDelete()" aria-expanded="false"
									class="btn-shadow btn btn-danger">
									<span class="btn-icon-wrapper pr-2 opacity-7"> <i
										class="fa fa-business-time fa-w-20"></i>
									</span> Xóa tài khoản
								</button>							</div>
							<ol class="breadcrumb page-breadcrumb pull-right">
								<li><i class="fa fa-home"></i>&nbsp;<a class="parent-item"
									href="#">Home</a>&nbsp;</li>
								<li><i class="fa fa-angle-right"></i></li>
								<li class="active">Quản lý tài khoản</li>
							</ol>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<div class="card card-topline-aqua">
								<div class="card-head">
									<header>Bảng quản lý dữ liệu tài khoản</header>
									<div class="tools">
										<a class="fa fa-repeat btn-color box-refresh"
											href="javascript:;"></a> <a
											class="t-collapse btn-color fa fa-chevron-down"
											href="javascript:;"></a> <a
											class="t-close btn-color fa fa-times" href="javascript:;"></a>
									</div>
								</div>
								<div class="card-body ">
									<div class="table-scrollable">
										<table id="example1" class="display" style="width: 100%;">
											<thead>
												<tr>
													<th><input type="checkbox" id="checkAll"></th>
													<th>Username</th>
													<th>Họ và tên</th>
													<th>Email</th>
													<th>Phone</th>
													<th>Birthday</th>
													<th>Ngày tạo</th>
													<th>Ngày sửa</th>
													<th>Tạo bởi</th>
													<th>Sửa bởi</th>
													<th>Action</th>
												</tr>
											</thead>
											<tbody>
												<form:form id="formSubmit" role="form" class="form-horizontal">
											<c:forEach var="item" items="${userentity}">
												<tr>
													<td><input type="checkbox" id="checkbox_${item.id}"
																value="${item.id}" /></td>
													<td>${item.username}</td>
													<td>${item.fullName }</td>
													<td>${item.email }</td>
													<td>${item.phoneNumber }</td>
													<td>${item.birthday}</td>
													<td>${item.createdDate}</td>
													<td>${item.modifiedDate}</td>
													<td>${item.createdBy}</td>
													<td>${item.modifiedBy}</td>
													<td>&nbsp;&nbsp; <c:url var="createModify"
																	value="createModify/customer">
																	<c:param name="id" value="${item.id}" />
																</c:url> <a href='${createModify}'
																class="btn btn-outline-warning"
																data-original-title="Update">Update</a> &nbsp;&nbsp;
															</td>
												</tr>
												</c:forEach>
												</form:form>
											</tbody>
										</table>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
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
	<!-- Modal View-->
	<div class="modal fade" id="exampleModalView" tabindex="-1"
		role="dialog" aria-labelledby="exampleModalLabelView"
		aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">View</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<label data-error="wrong" data-success="right"><i
						class="fa fa-table"></i>&nbsp; <strong>#ID:</strong>:</label><br>
					&nbsp;&nbsp;&nbsp;&nbsp;<label>1</label> <br> <label
						data-error="wrong" data-success="right"><i
						class="fa fa-user"></i>&nbsp; <strong>Username:</strong></label><br>
					&nbsp;&nbsp;&nbsp;&nbsp;<label>tien123</label> <br> <label
						data-error="wrong" data-success="right"><i
						class="fa fa-lock"></i>&nbsp; <strong>Password:</strong></label><br>
					&nbsp;&nbsp;&nbsp;&nbsp;<label>123456</label> <br> <label
						data-error="wrong" data-success="right"><i
						class="fa fa-user"></i>&nbsp; <strong>Họ và tên:</strong></label><br>
					&nbsp;&nbsp;&nbsp;&nbsp;<label>Đặng Anh Tiến</label> <br> <label
						data-error="wrong" data-success="right"><i
						class="fa fa-table"></i>&nbsp; <strong>Email:</strong></label><br>
					&nbsp;&nbsp;&nbsp;&nbsp;<label>tien123@gmail.com</label> <br>
					<label data-error="wrong" data-success="right"><i
						class="fa fa-table"></i>&nbsp; <strong>Địa chỉ:</strong></label><br>
					&nbsp;&nbsp;&nbsp;&nbsp;<label>12 Hồng Hà, quận 10, TP.HCM</label>
					<br> <label data-error="wrong" data-success="right"><i
						class="fa fa-phone"></i>&nbsp; <strong>SĐT:</strong></label><br>
					&nbsp;&nbsp;&nbsp;&nbsp;<label>0932156789</label> <br> <label
						data-error="wrong" data-success="right"><i
						class="fa fa-table"></i>&nbsp; <strong>Giới tính:</strong></label><br>
					&nbsp;&nbsp;&nbsp;&nbsp;<label>Nam</label> <br> <label
						data-error="wrong" data-success="right"><i
						class="fa fa-birthday-cake"></i>&nbsp; <strong>Ngày sinh:</strong></label><br>
					&nbsp;&nbsp;&nbsp;&nbsp;<label>0932156789</label> <br> <label
						data-error="wrong" data-success="right"><i
						class="fa fa-user"></i>&nbsp; <strong>Avatar:</strong></label><br>
					&nbsp;&nbsp;&nbsp;&nbsp;<label>123.jpg</label> <br> <label
						data-error="wrong" data-success="right"><i
						class="fa fa-table"></i>&nbsp; <strong>Trạng thái:</strong></label><br>
					&nbsp;&nbsp;&nbsp;&nbsp;<label>Đang hoạt động</label> <br> <label
						data-error="wrong" data-success="right"><i
						class="fa fa-table"></i>&nbsp; <strong>Tạo bởi:</strong></label><br>
					&nbsp;&nbsp;&nbsp;&nbsp;<label>tien</label> <br> <label
						data-error="wrong" data-success="right"><i
						class="fa fa-table"></i>&nbsp; <strong>Sửa bởi:</strong></label><br>
					&nbsp;&nbsp;&nbsp;&nbsp;<label>tien</label> <br>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-dismiss="modal">Đóng</button>
				</div>
			</div>
		</div>
	</div>
	<!-- end page container -->
		<!-- start footer -->
		<%@include file="/common/admin/footer.jsp" %>
		<!-- end footer -->
	</div>
	<!-- start js include path -->
	
	<%@include file="/common/admin/js.jsp" %>
	<!-- end js include path -->
		<script >
	function warningBeforeDelete() {
		swal({
			title : "Xác nhận xóa",
			text : "Bạn có chắc chắn muốn xóa hay không",
			type : "warning",
			showCancelButton : true,
			confirmButtonClass : "btn-success",
			cancelButtonClass : "btn-danger",
			confirmButtonText : "Xác nhận",
			cancelButtonText : "Hủy bỏ",
		}).then(
				function(result) {
					if (result.value) {
						//call api delete
						var ids = $('tbody input[type=checkbox]:checked').map(function() {
									return $(this).val();
								}).get();//Lấy được 1 mảng chứa id bài viết ta muốn xóa khi ta check
						deleteNew(ids);
					}
				});
	}
	function deleteNew(data) {
		$.ajax({
			url : '${customerAPI}',
			type : 'DELETE',
			contentType: 'application/json',
			data: JSON.stringify(data), 
			success : function(result) {
				window.location.href = "${customerURL}?message=delete_success"; 
		    },
			error : function(error) {
			    window.location.href = "${customerURL}?message=error_system";
			}
		});	
	}
	</script>
</body>
</html>