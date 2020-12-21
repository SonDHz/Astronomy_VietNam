<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<c:url var="productURL" value="/admin/productView" />
<c:url var="productAPI" value="/api/Product" />
<!DOCTYPE html>
<html>
<!-- BEGIN HEAD -->
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta content="width=device-width, initial-scale=1" name="viewport">
<meta name="description" content="Responsive Admin Template">
<meta name="author" content="SmartUniversity">
<title>Quản lý sản phẩm</title>
<!-- google font -->
<%@include file="/common/admin/style.jsp"%>
</head>
<!-- END HEAD -->
<body
	class="page-header-fixed sidemenu-closed-hidelogo page-content-white page-md header-white dark-sidebar-color logo-dark">
	<div class="page-wrapper">
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
			<%@include file="/common/admin/sidebar.jsp"%>
			<!-- end sidebar menu -->
			<!-- start page content -->
			<div class="page-content-wrapper">
				<div class="page-content">
					<div class="page-bar">
						<div class="page-title-breadcrumb">
							<div class=" pull-left">
								<c:url var="createModify" value="createModify/product" />
								<a href='${createModify}' type="button" aria-haspopup="true"
									aria-expanded="false" class="btn-shadow btn btn-info"> <span
									class="btn-icon-wrapper pr-2 opacity-7"> <i
										class="fa fa-business-time fa-w-20"></i>
								</span> Thêm sản phẩm
								</a>
								<button id="btnDelete" type="button" aria-haspopup="true"
									onclick="warningBeforeDelete()" aria-expanded="false"
									class="btn-shadow btn btn-danger">
									<span class="btn-icon-wrapper pr-2 opacity-7"> <i
										class="fa fa-business-time fa-w-20"></i>
									</span> Xóa sản phẩm
								</button>
							</div>
							<ol class="breadcrumb page-breadcrumb pull-right">
								<li><i class="fa fa-home"></i>&nbsp;<a class="parent-item"
									href="#">Home</a>&nbsp;</li>
								<li><i class="fa fa-angle-right"></i></li>
								<li class="active">Quản lý sản phẩm</li>
							</ol>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<div class="card card-topline-aqua">
								<div class="card-head">
									<header>Bảng quản lý dữ liệu sản phẩm</header>
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
													<th>#ID</th>
													<th>Loại sản phẩm</th>
													<th>Tên sản phẩm</th>
													<th>Nhà sản xuất</th>
													<th>Giá</th>
													<th>Số lượng</th>
													<th>Hình ảnh</th>
													<th>Tạo bởi</th>
													<th>Action</th>
												</tr>
											</thead>
											<tbody>
												<form:form id="formSubmit" role="form"
													class="form-horizontal">
													<c:forEach var="item" items="${entity}">
														<tr>
															<td><input type="checkbox" id="checkbox_${item.id}"
																value="${item.id}" /></td>
															<td><label>${item.id}</label></td>
															<td>${item.productCategory.name}</td>
															<td>${item.name}</td>
															<td>${item.manufacturer.name}</td>
															<td>${item.price}</td>
															<td>${item.quantity}</td>
															<td><c:url var="display" value='getImage'>
																	<c:param name="name" value="${item.image}" />
																</c:url> <img alt="" src="${display}" width="170px"
																height="90px"></td>
															<td>${item.createdBy}</td>
															<td>&nbsp;&nbsp; <input type="hidden" id="id"
																name="id" value="${item.id}" /> <a href='#exampleModal'
																data-toggle="modal" data-target=".bd-example-modal-lg"
																class="btn btn-outline-success vBtn">View</a>
																&nbsp;&nbsp; <c:url var="createModify"
																	value="createModify/product">
																	<c:param name="id" value="${item.id}" />
																</c:url> <a href='${createModify}'
																class="btn btn-outline-warning"
																data-original-title="Update">Update</a>
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
		<!-- Modal View-->
		<form>

			<div id="exampleModal" class="modal fade bd-example-modal-lg"
				tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel"
				aria-hidden="true">
				<div class="modal-dialog modal-lg">
					<div class="modal-content">
						<div class="modal-header">
							<h2 class="modal-title">Quản lý sản phẩm</h2>
							<button type="button" class="close" data-dismiss="modal"
								aria-label="Close">
								<span aria-hidden="true">&times;</span>
							</button>
						</div>
						<div class="modal-body">
							<input type="hidden" class="form-control" name="id" id="id"
								value="" /> <label data-error="wrong" data-success="right"><i
								class="fa fa-table"></i>&nbsp; <strong>Loại sản phẩm:</strong></label><br>
							&nbsp;&nbsp;&nbsp;&nbsp;<input id="productCategory"
								style="border: none;"><br> <label
								data-error="wrong" data-success="right"><i
								class="fa fa-table"></i>&nbsp; <strong>Nhà sản xuất:</strong></label><br>
							&nbsp;&nbsp;&nbsp;&nbsp;<input id="manufacturer"
								style="border: none;"><br> <label
								data-error="wrong" data-success="right"><i
								class="fa fa-table"></i>&nbsp; <strong>Tên sản phẩm:</strong></label><br>
							&nbsp;&nbsp;&nbsp;&nbsp;<input id="name" style="border: none;"><br>
							<label data-error="wrong" data-success="right"><i
								class="fa fa-table"></i>&nbsp; <strong>Hình ảnh:</strong></label><br>
							&nbsp;&nbsp;&nbsp;&nbsp;
							<input type="hidden" id="id"/>
							<c:url var="display" value='getImage'>
								<c:param name="image" value="#id" />
							</c:url>
							<img alt="" id="image" src="${display}" width="170px" height="90px"> <br>
							<label data-error="wrong" data-success="right"><i
								class="fa fa-table"></i>&nbsp; <strong>Giá:</strong></label><br>
							&nbsp;&nbsp;&nbsp;&nbsp;<input id="price" style="border: none;"><br>
							<label data-error="wrong" data-success="right"><i
								class="fa fa-table"></i>&nbsp; <strong>Số lượng:</strong></label><br>
							&nbsp;&nbsp;&nbsp;&nbsp;<input id="quantity"
								style="border: none;"><br> <label
								data-error="wrong" data-success="right"><i
								class="fa fa-table"></i>&nbsp; <strong>Mô tả ngắn:</strong></label><br>
							&nbsp;&nbsp;&nbsp;&nbsp;<input id="shortDecription"
								style="border: none;"><br> <label
								data-error="wrong" data-success="right"><i
								class="fa fa-table"></i>&nbsp; <strong>Giới thiệu:</strong></label><br>
							&nbsp;&nbsp;&nbsp;&nbsp;<input id="introduce"
								style="border: none;"><br> <label
								data-error="wrong" data-success="right"><i
								class="fa fa-table"></i>&nbsp; <strong>Trạng thái:</strong></label><br>
							&nbsp;&nbsp;&nbsp;&nbsp;<input id="status" style="border: none;"><br>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-secondary"
								data-dismiss="modal">Close</button>
						</div>
					</div>
				</div>
			</div>
		</form>
		<!-- end page container -->
		<!-- start footer -->
		<%@include file="/common/admin/footer.jsp"%>
		<!-- end footer -->
	</div>
	<!-- start js include path -->
	<%@include file="/common/admin/js.jsp"%>
	<!-- end js include path -->
	<script>
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
							var ids = $('tbody input[type=checkbox]:checked')
									.map(function() {
										return $(this).val();
									}).get();//Lấy được 1 mảng chứa id bài viết ta muốn xóa khi ta check
							deleteNew(ids);
						}
					});
		}
		function deleteNew(data) {
			$
					.ajax({
						url : '${productAPI}',
						type : 'DELETE',
						contentType : 'application/json',
						data : JSON.stringify(data),
						success : function(result) {
							window.location.href = "${orderURL}?message=delete_success";
						},
						error : function(error) {
							window.location.href = "${orderURL}?message=error_system";
						}
					});
		}
		/* View detail */
		$(document)
				.ready(
						function() {
							$('[data-toggle="tooltip"]').tooltip();
							$('tbody .vBtn')
									.on(
											'click',
											function() {
												var id = $(this).parent().find(
														'#id').val();
												$
														.ajax({
															type : 'GET',
															url : '${pageContext.request.contextPath}/api/Product/find/'
																	+ id,
															success : function(
																	product) {
																console
																		.log(product);
																$(
																		'#exampleModal #id')
																		.val(
																				product.id);
																$(
																		'#exampleModal #name')
																		.val(
																				product.name);
																$(
																		'#exampleModal #price')
																		.val(
																				product.price);
																$(
																		'#exampleModal #quantity')
																		.val(
																				product.quantity);
																$(
																		'#exampleModal #shortDecription')
																		.val(
																				product.shortDecription);
																$(
																		'#exampleModal #introduce')
																		.val(
																				product.introduce);
																$(
																		'#exampleModal #productCategory')
																		.val(
																				product.productCategory.name);
																$(
																		'#exampleModal #manufacturer')
																		.val(
																				product.manufacturer.name);
																$(
																		'#exampleModal #status')
																		.val(
																				product.status);
																$(
																		'#exampleModal #image')
																		.val(
																				product.image);

															}
														})
											})
						})
	</script>
</body>
</html>