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
<title>Thanh toán</title>
<style>
.row {
  display: -ms-flexbox; /* IE10 */
  display: flex;
  -ms-flex-wrap: wrap; /* IE10 */
  flex-wrap: wrap;
  margin: 0 -16px;
}
.icon-container {
  margin-bottom: 20px;
  padding: 7px 0;
  font-size: 55px;
}
label {
  margin-bottom: 10px;
  display: block;
}
input[type=text] {
  width: 100%;
  margin-bottom: 20px;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 3px;
}
input[type=date] {
  width: 100%;
  margin-bottom: 20px;
  padding: 11px;
  border: 1px solid #ccc;
  border-radius: 3px;
}
p {
	color: #7c32ff;
}

</style>
</head>

<body>
	<%@include file="/common/web/header.jsp"%>
	<!-- Start contact-page Area -->
	<section class="contact-page-area section-gap">
		<div class="container box_1170">
			<div class="row">
      <form >
        <div class="row">
          <div class="col-lg-7">
            <p style="font-size: 40px">
			<strong>Thông tin khách hàng</strong>
			</p>
            <br>
            <label for="fname"><i class="fa fa-user"></i>&nbsp; Họ và tên</label>
            <input type="text" >
            <label for="email"><i class="fa fa-envelope"></i>&nbsp; Email</label>
            <input type="text"  >
            <label for="adr"><i class="fa fa-phone"></i>&nbsp; SĐT</label>
            <input type="text"  >
            <label for="city"><i class="fa fa-address-card-o"></i>&nbsp; Địa chỉ</label>
            <input type="text"  >   
            <label for="city"><i class="fa fa-table"></i>&nbsp; Ghi chú</label>
            <input type="text"  >     
          </div>
          <div class="col-lg-5">
		  <img class="gif"
			src="../../template/web/img/giphy (1).gif" alt="">		
          </div>
        </div>
        <a href="#" class="btn btn-info">Thanh toán</a>
      </form>
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