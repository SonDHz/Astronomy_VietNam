<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp" %>
<div class="page-header navbar navbar-fixed-top">
	<div class="page-header-inner ">
		<!-- logo start -->
		<div class="page-logo">
			<a href="/admin/dashboard"> <img class="text-center" alt=""
				src="../../template/admin/assets/img/astronomy-logo.png" width="65px" height="auto"> <span
				class="logo-default">Team 4</span>
			</a>
		</div>
		<!-- logo end -->
		<ul class="nav navbar-nav navbar-left in">
			<li><a href="#" class="menu-toggler sidebar-toggler"><i
					class="icon-menu"></i></a></li>
		</ul>
		
		<!-- start mobile menu -->
		<a href="javascript:;" class="menu-toggler responsive-toggler"
			data-toggle="collapse" data-target=".navbar-collapse"> <span></span>
		</a>
		<!-- end mobile menu -->
		<!-- start header menu -->
		<div class="top-menu">
			<ul class="nav navbar-nav pull-right">
				<li class="dropdown dropdown-user"><a href="javascript:;"
					class="dropdown-toggle" data-toggle="dropdown"
					data-hover="dropdown" data-close-others="true"> <img alt=""
						class="img-circle " src="../../template/admin/assets/img/dp.jpg"> <span
						class="username username-hide-on-mobile"> Astronomy </span> <i
						class="fa fa-angle-down"></i>
				</a>
					<ul class="dropdown-menu dropdown-menu-default animated jello">
						<li class="divider"></li>
						<li><a href="/logout"> <i class="icon-logout"></i> Đăng xuất
						</a></li>
					</ul></li>
			</ul>
		</div>
	</div>
</div>