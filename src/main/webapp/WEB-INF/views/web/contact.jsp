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
<title>Liên hệ</title>
<%@include file="/common/web/style.jsp"%>
</head>

<body>
	<%@include file="/common/web/header.jsp"%>
	<!-- Start contact-page Area -->
	<section class="contact-page-area section-gap">
		<div class="container box_1170">
			<div>
				<iframe
					src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3919.4961465198016!2d106.69845251488363!3d10.7732607121978!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x31752f4743648f3d%3A0x16ce95918cb14834!2sSaigon+Centre+Shopping+Mall!5e0!3m2!1sen!2s!4v1517406862987"
					width="1140" height="500" frameborder="0" style="border: 0"
					allowfullscreen></iframe>
			</div>
			<br>
			<div class="row">

				<div class="col-lg-4 d-flex flex-column address-wrap">
					<div class="single-contact-address d-flex flex-row">
						${ mesage }
						<div class="icon">
							<span class="lnr lnr-home"></span>
						</div>
						<div class="contact-details">
							<h5>Thành phố Hồ Chí Minh, Việt Nam</h5>

						</div>
					</div>
					<div class="single-contact-address d-flex flex-row">
						<div class="icon">
							<span class="lnr lnr-phone-handset"></span>
						</div>
						<div class="contact-details">
							<h5>0929324691</h5>

						</div>
					</div>
					<div class="single-contact-address d-flex flex-row">
						<div class="icon">
							<span class="lnr lnr-envelope"></span>
						</div>
						<div class="contact-details">
							<h5>thienvanvietnam@gmail.com</h5>

						</div>
					</div>
				</div>
				<div class="col-lg-8">
					<form class="form-areas" action="send" method="POST" class="contact-form text-right">
						<div class="row">
							<div class="col-lg-6 form-group">
								<!-- <input name="name" placeholder="Họ và tên"
									onfocus="this.placeholder = ''"
									onblur="this.placeholder = 'Họ và tên'"
									class="common-input mb-20 form-control" required="" type="text"> -->

								<input name="from" placeholder="Địa chỉ email"
									pattern="[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Za-z]{1,63}$"
									onfocus="this.placeholder = ''"
									onblur="this.placeholder = 'Enter email address'"
									class="common-input mb-20 form-control" required=""
									type="email"/>
								
								<input name="to"
									placeholder="to" onfocus="this.placeholder = ''"
									onblur="this.placeholder = 'to'"
									class="common-input mb-20 form-control" required="" type="text"/> 
								
								<input name="subject"
									placeholder="Chủ đề" onfocus="this.placeholder = ''"
									onblur="this.placeholder = 'Chủ đề'"
									class="common-input mb-20 form-control" required="" type="text"/>
							</div>
							<div class="col-lg-6 form-group">
								<textarea class="common-textarea form-control" name="body"
									placeholder="Nội dung" onfocus="this.placeholder = ''"
									onblur="this.placeholder = 'Nội dung'" required=""></textarea>
							</div> 
							<div class="col-lg-12 d-flex justify-content-between">
								<div class="alert-msg" style="text-align: left;"></div> 
								<button class="genric-btn primary circle text-uppercase" type="submit"
									style="float: right;">Gửi</button>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</section>
	<!-- start footer Area -->
	<%@include file="/common/web/footer.jsp"%>
	<!-- End footer Area -->

	<!-- Javascript -->
	<%@include file="/common/web/js.jsp"%>
	<!-- End javascript -->
</body>

</html>