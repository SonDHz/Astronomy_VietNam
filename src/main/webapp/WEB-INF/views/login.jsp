<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta content="width=device-width, initial-scale=1" name="viewport">
    <meta name="description" content="Responsive Admin Template">
    <meta name="author" content="SmartUniversity">
    <title>Smile Admin | Bootstrap Responsive Admin Template</title>
    <!-- google font -->
    <link href="../../../../../../admin/css.css?family=Poppins:300,400,500,600,700" rel="stylesheet" type="text/css">
	<!-- icons -->
    <link href="../../template/admin/fonts/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
	<link href="../../template/admin/fonts/material-design-icons/material-icon.css" rel="stylesheet" type="text/css">
    <!-- bootstrap -->
	<link href="../../template/admin/assets/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css">
    <!-- style -->
    <link rel="stylesheet" href="../../template/admin/assets/css/pages/extra_pages.css">
	<!-- favicon -->
    <link rel="shortcut icon" href="../../template/admin/assets/img/favicon.ico"> 
</head>
<body>
    <div class="form-title">
        <h1>Đăng nhập và trải nghiệm</h1>
    </div>
    <!-- Login Form-->
    <div class="login-form text-center">
        <div class="toggle"><i class="fa fa-user-plus"></i>
        </div>
        <div class="form formLogin">
            <h2>Đăng nhập</h2>
            <form>
                <input type="text" placeholder="Tài khoản">
                <input type="password" placeholder="Mật khẩu">
                <div class="remember text-left">
                    <div class="checkbox checkbox-primary">
                        <input id="checkbox2" type="checkbox" checked="">
                        <label for="checkbox2">
                            Nhớ mật khẩu
                        </label>
                    </div>
                </div>
                <button>Đăng nhập</button>
                <div class="forgetPassword"><a href="javascript:void(0)">Quên mật khẩu</a>
                </div>
            </form>
        </div>
        <div class="form formRegister">
            <h2>Create an account</h2>
            <form>
                <input type="text" placeholder="Tên tài khoản">
                <input type="password" placeholder="Password">
                <input type="text" placeholder="Họ tên">
                <input type="email" placeholder="Email">
                <input type="tel" placeholder="Phone Number">
                <input type="text" placeholder="Địa chỉ">
                <input type="radio" placeholder="Giới tính">
                <input type="date" placeholder="Ngày sinh">
                <button>Register</button>
            </form>
        </div>
        <div class="form formReset">
            <h2>Reset your password?</h2>
            <form>
                <input type="email" placeholder="Email Address">
                <button>Send Verification Email</button>
            </form>
        </div>
    </div>
    <!-- start js include path -->
    <script src="../../template/admin/assets/plugins/jquery/jquery.min.js"></script>
    <script src="../../template/admin/assets/js/pages/extra_pages/pages.js"></script>
    <!-- end js include path -->
</body>
</html>