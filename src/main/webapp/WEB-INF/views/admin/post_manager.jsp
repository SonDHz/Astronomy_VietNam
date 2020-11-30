﻿<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp" %>
<!DOCTYPE html>
<html>
<!-- BEGIN HEAD -->
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta content="width=device-width, initial-scale=1" name="viewport">
<meta name="description" content="Responsive Admin Template">
<meta name="author" content="SmartUniversity">
<title>Quản lý bài viết</title>
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
								<button type="button" aria-haspopup="true"
										aria-expanded="false" class="btn-shadow btn btn-info"
										data-toggle="modal" data-target="#exampleModal">
										<span class="btn-icon-wrapper pr-2 opacity-7"> <i
											class="fa fa-business-time fa-w-20"></i>
										</span> Thêm bài viết
									</button>
							</div>
							<ol class="breadcrumb page-breadcrumb pull-right">
								<li><i class="fa fa-home"></i>&nbsp;<a class="parent-item"
									href="#">Home</a>&nbsp;
								</li>
								<li><i class="fa fa-angle-right"></i></li>
								<li class="active">Quản lý bài viết</li>
							</ol>
						</div>
					</div>
					<div class="row">
                        <div class="col-md-12">
                            <div class="card card-topline-aqua">
                                <div class="card-head">
                                    <header>Bảng quản lý dữ liệu bài viết</header>
                                    <div class="tools">
                                        <a class="fa fa-repeat btn-color box-refresh" href="javascript:;"></a>
	                                    <a class="t-collapse btn-color fa fa-chevron-down" href="javascript:;"></a>
	                                    <a class="t-close btn-color fa fa-times" href="javascript:;"></a>
                                    </div>
                                </div>
                                <div class="card-body ">
                                  <div class="table-scrollable">
                                  <table id="example1" class="display" style="width: 100%;">
											<thead>
												<tr>
													<th>#ID</th>
													<th>Thể loại</th>
													<th>Mô tả ngắn</th>
													<th>Nội dung</th>
													<th>Tiêu đề</th>
													<th>Action</th>
												</tr>
											</thead>
											<tbody>
												<tr>
													<td>1</td>
													<td>Trái Đất</td>
													<td>123459</td>
													<td>123456</td>
													<td>Trái Đất</td>
													<td> &nbsp;&nbsp; <button
														class="btn btn-outline-success" data-toggle="modal"
														data-target="#exampleModalView" data-original-title="View">
															View </button> &nbsp;&nbsp;<button
														 class="btn btn-outline-warning"
														data-toggle="modal" data-target="#exampleModalUpdate" data-original-title="Update">
															Update </button> &nbsp;&nbsp; <button 
														class="btn btn-outline-danger" data-toggle="tooltip"
														data-original-title="Delete"> Delete </button>
													</td>
												</tr>
												<tr>
													<td>2</td>
													<td>Trái Đất</td>
													<td>123459</td>
													<td>123456</td>
													<td>Trái Đất</td>
													<td> &nbsp;&nbsp; <button
														class="btn btn-outline-success" data-toggle="modal"
														data-target="#exampleModalView" data-original-title="View">
															View </button> &nbsp;&nbsp;<button
														 class="btn btn-outline-warning"
														data-toggle="modal" data-target="#exampleModalUpdate" data-original-title="Update">
															Update </button> &nbsp;&nbsp; <button 
														class="btn btn-outline-danger" data-toggle="tooltip"
														data-original-title="Delete"> Delete </button>
													</td>
												</tr>
												<tr>
													<td>3</td>
													<td>Trái Đất</td>
													<td>123459</td>
													<td>123456</td>
													<td>Trái Đất</td>
													<td> &nbsp;&nbsp; <button
														class="btn btn-outline-success" data-toggle="modal"
														data-target="#exampleModalView" data-original-title="View">
															View </button> &nbsp;&nbsp;<button
														 class="btn btn-outline-warning"
														data-toggle="modal" data-target="#exampleModalUpdate" data-original-title="Update">
															Update </button> &nbsp;&nbsp; <button 
														class="btn btn-outline-danger" data-toggle="tooltip"
														data-original-title="Delete"> Delete </button>
												</tr>
												<tr>
													<td>4</td>
													<td>Trái Đất</td>
													<td>123459</td>
													<td>123456</td>
													<td>Trái Đất</td>
													<td> &nbsp;&nbsp; <button
														class="btn btn-outline-success" data-toggle="modal"
														data-target="#exampleModalView" data-original-title="View">
															View </button> &nbsp;&nbsp;<button
														 class="btn btn-outline-warning"
														data-toggle="modal" data-target="#exampleModalUpdate" data-original-title="Update">
															Update </button> &nbsp;&nbsp; <button 
														class="btn btn-outline-danger" data-toggle="tooltip"
														data-original-title="Delete"> Delete </button>
												</tr>
												<tr>
													<td>5</td>
													<td>Trái Đất</td>
													<td>123459</td>
													<td>123456</td>
													<td>Trái Đất</td>
													<td> &nbsp;&nbsp; <button
														class="btn btn-outline-success" data-toggle="modal"
														data-target="#exampleModalView" data-original-title="View">
															View </button> &nbsp;&nbsp;<button
														 class="btn btn-outline-warning"
														data-toggle="modal" data-target="#exampleModalUpdate" data-original-title="Update">
															Update </button> &nbsp;&nbsp; <button 
														class="btn btn-outline-danger" data-toggle="tooltip"
														data-original-title="Delete"> Delete </button>
												</tr>
												<tr>
													<td>Brielle Williamson</td>
													<td>Integration Specialist</td>
													<td>New York</td>
													<td>61</td>
													<td>2012/12/02</td>
													<td> &nbsp;&nbsp; <button
														class="btn btn-outline-success" data-toggle="modal"
														data-target="#exampleModalView" data-original-title="View">
															View </button> &nbsp;&nbsp;<button
														 class="btn btn-outline-warning"
														data-toggle="modal" data-target="#exampleModalUpdate" data-original-title="Update">
															Update </button> &nbsp;&nbsp; <button 
														class="btn btn-outline-danger" data-toggle="tooltip"
														data-original-title="Delete"> Delete </button>
												</tr>
												<tr>
													<td>Herrod Chandler</td>
													<td>Sales Assistant</td>
													<td>San Francisco</td>
													<td>59</td>
													<td>2012/08/06</td>
													<td> &nbsp;&nbsp; <button
														class="btn btn-outline-success" data-toggle="modal"
														data-target="#exampleModalView" data-original-title="View">
															View </button> &nbsp;&nbsp;<button
														 class="btn btn-outline-warning"
														data-toggle="modal" data-target="#exampleModalUpdate" data-original-title="Update">
															Update </button> &nbsp;&nbsp; <button 
														class="btn btn-outline-danger" data-toggle="tooltip"
														data-original-title="Delete"> Delete </button>
												</tr>
												<tr>
													<td>Rhona Davidson</td>
													<td>Integration Specialist</td>
													<td>Tokyo</td>
													<td>55</td>
													<td>2010/10/14</td>
													<td> &nbsp;&nbsp; <button
														class="btn btn-outline-success" data-toggle="modal"
														data-target="#exampleModalView" data-original-title="View">
															View </button> &nbsp;&nbsp;<button
														 class="btn btn-outline-warning"
														data-toggle="modal" data-target="#exampleModalUpdate" data-original-title="Update">
															Update </button> &nbsp;&nbsp; <button 
														class="btn btn-outline-danger" data-toggle="tooltip"
														data-original-title="Delete"> Delete </button>
												</tr>
												<tr>
													<td>Colleen Hurst</td>
													<td>Javascript Developer</td>
													<td>San Francisco</td>
													<td>39</td>
													<td>2009/09/15</td>
													<td> &nbsp;&nbsp; <button
														class="btn btn-outline-success" data-toggle="modal"
														data-target="#exampleModalView" data-original-title="View">
															View </button> &nbsp;&nbsp;<button
														 class="btn btn-outline-warning"
														data-toggle="modal" data-target="#exampleModalUpdate" data-original-title="Update">
															Update </button> &nbsp;&nbsp; <button 
														class="btn btn-outline-danger" data-toggle="tooltip"
														data-original-title="Delete"> Delete </button>
												</tr>
												<tr>
													<td>Sonya Frost</td>
													<td>Software Engineer</td>
													<td>Edinburgh</td>
													<td>23</td>
													<td>2008/12/13</td>
													<td> &nbsp;&nbsp; <button
														class="btn btn-outline-success" data-toggle="modal"
														data-target="#exampleModalView" data-original-title="View">
															View </button> &nbsp;&nbsp;<button
														 class="btn btn-outline-warning"
														data-toggle="modal" data-target="#exampleModalUpdate" data-original-title="Update">
															Update </button> &nbsp;&nbsp; <button 
														class="btn btn-outline-danger" data-toggle="tooltip"
														data-original-title="Delete"> Delete </button>
												</tr>
												<tr>
													<td>Jena Gaines</td>
													<td>Office Manager</td>
													<td>London</td>
													<td>30</td>
													<td>2008/12/19</td>
													<td> &nbsp;&nbsp; <button
														class="btn btn-outline-success" data-toggle="modal"
														data-target="#exampleModalView" data-original-title="View">
															View </button> &nbsp;&nbsp;<button
														 class="btn btn-outline-warning"
														data-toggle="modal" data-target="#exampleModalUpdate" data-original-title="Update">
															Update </button> &nbsp;&nbsp; <button 
														class="btn btn-outline-danger" data-toggle="tooltip"
														data-original-title="Delete"> Delete </button>
												</tr>
												<tr>
													<td>Quinn Flynn</td>
													<td>Support Lead</td>
													<td>Edinburgh</td>
													<td>22</td>
													<td>2013/03/03</td>
													<td> &nbsp;&nbsp; <button
														class="btn btn-outline-success" data-toggle="modal"
														data-target="#exampleModalView" data-original-title="View">
															View </button> &nbsp;&nbsp;<button
														 class="btn btn-outline-warning"
														data-toggle="modal" data-target="#exampleModalUpdate" data-original-title="Update">
															Update </button> &nbsp;&nbsp; <button 
														class="btn btn-outline-danger" data-toggle="tooltip"
														data-original-title="Delete"> Delete </button>
												</tr>
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
 						<div class="tab-pane active chat-sidebar-chat in active show animated slideInRight" role="tabpanel" id="quick_sidebar_tab_1">  
                        <!-- End User Chat --> 
 						<!-- Start Setting Panel --> 
 						<div class="tab-pane chat-sidebar-settings animated slideInUp" role="tabpanel" id="quick_sidebar_tab_3">
                            <div class="chat-sidebar-settings-list slimscroll-style">
                                <div class="chat-header"><h5 class="list-heading"><i class="fa fa-cog"></i>&nbsp;&nbsp;Cài đặt </h5></div>
	                            <div class="chatpane inner-content ">
									<div class="settings-list">
					                    <div class="setting-item">
					                        <div class="setting-text">Sidebar Position</div>
					                        <div class="setting-set">
					                           <select class="sidebar-pos-option form-control input-inline input-sm input-small ">
	                                                <option value="left" selected="selected">Left</option>
	                                                <option value="right">Right</option>
                                            	</select>
					                        </div>
					                    </div>
					                    <div class="setting-item">
					                        <div class="setting-text">Header</div>
					                        <div class="setting-set">
					                           <select class="page-header-option form-control input-inline input-sm input-small ">
	                                                <option value="fixed" selected="selected">Fixed</option>
	                                                <option value="default">Default</option>
                                            	</select>
					                        </div>
					                    </div>
					                    <div class="setting-item">
					                        <div class="setting-text">Sidebar Menu </div>
					                        <div class="setting-set">
					                           <select class="sidebar-menu-option form-control input-inline input-sm input-small ">
	                                                <option value="accordion" selected="selected">Accordion</option>
	                                                <option value="hover">Hover</option>
                                            	</select>
					                        </div>
					                    </div>
					                    <div class="setting-item">
					                        <div class="setting-text">Footer</div>
					                        <div class="setting-set">
					                           <select class="page-footer-option form-control input-inline input-sm input-small ">
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
					<label data-error="wrong" data-success="right"><i class="fa fa-table"></i>&nbsp;
							<strong>#ID:</strong>:</label><br>
							&nbsp;&nbsp;&nbsp;&nbsp;<label>1</label> 
							<br>
					<label data-error="wrong" data-success="right"><i class="fa fa-table"></i>&nbsp;
							<strong>Thể loại:</strong></label><br>
							&nbsp;&nbsp;&nbsp;&nbsp;<label>Sao Hỏa</label>
							<br>
					<label data-error="wrong" data-success="right"><i class="fa fa-table"></i>&nbsp;
							<strong>Mô tả ngắn:</strong></label><br>
							&nbsp;&nbsp;&nbsp;&nbsp;<label>123456</label>
							<br>
					<label data-error="wrong" data-success="right"><i class="fa fa-table"></i>&nbsp;
							<strong>Nội dung:</strong></label><br>
							&nbsp;&nbsp;&nbsp;&nbsp;<label>Sao hỏa</label> 
							<br>
					<label data-error="wrong" data-success="right"><i class="fa fa-table"></i>&nbsp;
							<strong>Tiêu đề:</strong></label><br>
							&nbsp;&nbsp;&nbsp;&nbsp;<label>Sao Hỏa</label>
							<br>
					<label data-error="wrong" data-success="right"><i class="fa fa-table"></i>&nbsp;
							<strong>Hình ảnh:</strong></label><br>
							&nbsp;&nbsp;&nbsp;&nbsp;<label>123.jpg</label>
							<br>
					<label data-error="wrong" data-success="right"><i class="fa fa-table"></i>&nbsp;
							<strong>Tạo bởi:</strong></label><br>
							&nbsp;&nbsp;&nbsp;&nbsp;<label>tien</label>
							<br>
					<label data-error="wrong" data-success="right"><i class="fa fa-table"></i>&nbsp;
							<strong>Sửa bởi:</strong></label><br>
							&nbsp;&nbsp;&nbsp;&nbsp;<label>ti</label> 
							<br>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-dismiss="modal">Đóng</button>
				</div>
			</div>
		</div>
	</div>
	
			<!-- Modal Update-->
	<div class="modal fade" id="exampleModalUpdate" tabindex="-1"
		role="dialog" aria-labelledby="exampleModalLabelUpdate"
		aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Update</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
							<input class="form-control validate" type="hidden" value="1">
							<br>
					<label data-error="wrong" data-success="right"><i class="fa fa-table"></i>&nbsp;
							Thể loại:</label>
							<input class="form-control validate" type="text" value="Sao Hỏa">
							<br>
					<label data-error="wrong" data-success="right"><i class="fa fa-table"></i>&nbsp;
							Mô tả ngắn:</label>
							<input class="form-control validate" type="text" value="123456">
							<br>
					<label data-error="wrong" data-success="right"><i class="fa fa-table"></i>&nbsp;
							Nội dung:</label>
							<input class="form-control validate" type="text" value="Sao Hỏa">
							<br>
					<label data-error="wrong" data-success="right"><i class="fa fa-table"></i>&nbsp;
							Tiêu đề:</label>
							<input class="form-control validate" type="text" value="Sao Hỏa">
							<br>
					<label data-error="wrong" data-success="right"><i class="fa fa-table"></i>&nbsp;
							Hình ảnh:</label>
							<input class="form-control validate" type="text" value="123.jpg">
							<br>
					<label data-error="wrong" data-success="right"><i class="fa fa-table"></i>&nbsp;
							Tạo bởi:</label>
							<input class="form-control validate" type="text" value="tien">
							<br>
					<label data-error="wrong" data-success="right"><i class="fa fa-table"></i>&nbsp;
							Sửa bởi:</label>
							<input class="form-control validate" type="text" value="ti">
							<br>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-dismiss="modal">Đóng</button>
						<button type="button" class="btn btn-primary"
						data-dismiss="modal">Lưu</button>
				</div>
			</div>
		</div>
	</div>
	
	<!-- Modal -->
	<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">
						<i class="fa fa-edit"></i>&nbsp;Thêm bài viết
					</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<div class="md-form mb-5"> <label
									data-error="wrong" data-success="right"><i
									class="fa fa-table"></i>&nbsp; Thể loại</label> <input
									class="form-control validate"> <label
									data-error="wrong" data-success="right"> <i
									class="fa fa-table"></i>&nbsp; Mô tả ngắn
								</label> <input class="form-control validate"><label
									data-error="wrong" data-success="right"><i
									class="fa fa-table	"></i>&nbsp; Nội dung</label> <input
									class="form-control validate"> <label
									data-error="wrong" data-success="right"><i
									class="fa fa-table"></i>&nbsp; Tiêu đề</label> <input
									class="form-control validate">
						<label data-error="wrong" data-success="right"><i
									class="fa fa-table"></i>&nbsp; Hỉnh ảnh</label> <input
									class="form-control validate">  <label
									data-error="wrong" data-success="right"><i
									class="fa fa-table"></i>&nbsp; Tạo bởi</label> <input
									class="form-control validate"> <label
									data-error="wrong" data-success="right"> <i
									class="fa fa-table"></i>&nbsp; Sửa bởi
								</label> <input class="form-control validate">
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-dismiss="modal">Đóng</button>
					<button type="button" class="btn btn-primary">Lưu</button>
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
</body>
</html>