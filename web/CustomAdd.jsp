<%--
  Created by IntelliJ IDEA.
  User: wzly
  Date: 17-5-22
  Time: 下午5:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html class="no-js">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>订单管理</title>
    <meta name="description" content="这是一个 index 页面">
    <meta name="keywords" content="index">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <link rel="icon" type="image/png" href="assets/i/favicon.png">
    <link rel="apple-touch-icon-precomposed" href="assets/i/app-icon72x72@2x.png">
    <meta name="apple-mobile-web-app-title" content="Amaze UI" />
    <link rel="stylesheet" href="assets/css/amazeui.min.css"/>
    <link rel="stylesheet" href="assets/css/admin.css">
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/js/app.js"></script>
</head>
<body>
<!--[if lte IE 9]><p class="browsehappy">升级你的浏览器吧！ <a href="http://se.360.cn/" target="_blank">升级浏览器</a>以获得更好的体验！</p><![endif]-->
<header class="am-topbar admin-header">
    <div class="am-topbar-brand"><img src="assets/i/logo.png"></div>

    <div class="am-collapse am-topbar-collapse" id="topbar-collapse">
        <ul class="am-nav am-nav-pills am-topbar-nav ">

            <li ><a href="/ProductListServlet">商品管理</a></li>
            <li><a href="/OrderListServlet">订单管理</a></li>
            <li  class="am-active"><a  href="/CustomListServlet">客户管理</a></li>
            <li ><a href="/ManufactureList">供应商管理</a> </li>
            <li><a href="/EmployeeListServlet">员工管理</a> </li>
        </ul>
    </div>
</header>

<div class="am-cf admin-main">

    <div class="nav-navicon admin-main admin-sidebar">


        <div class="sideMenu am-icon-dashboard" style="color:#aeb2b7; margin: 10px 0 0 0;"> 欢迎系统管理员：王正</div>
        <div class="sideMenu">
            <h3 class="am-icon-flag"><em></em> <a href="#">商品管理</a></h3>
            <ul>
                <li><a href="/ProductListServlet">商品列表</a></li>
            </ul>
            <h3 class="am-icon-cart-plus"><em></em> <a href="#"> 订单管理</a></h3>
            <ul>
                <li><a href="/OrderListServlet">订单列表</a></li>
                <li><a href="/OrderDetail.jsp">订单详细信息</a></li>
                <li><a href="OrderAdd.jsp">添加订单</a></li>
                <li><a href="Receive.jsp">发货单列表</a></li>
                <li><a href="Wait.jsp">换货单列表</a></li>
            </ul>
            <h3 class="am-icon-users  on"><em></em> <a href="#">客户管理</a></h3>
            <ul>
                <li><a href="/CustomListServlet">客户列表</a> </li>
            </ul>
            <h3 class="am-icon-flag "><em></em> <a href="#">供应商管理</a></h3>
            <ul>
                <li><a href="/ManufactureList">供应商列表</a></li>
            </ul>
            <h3 class="am-icon-volume-up"><em></em> <a href="#">员工管理</a></h3>
            <ul>
                <li><a href="/EmployeeListServlet">员工列表</a> </li>
            </ul>

        </div>
        <!-- sideMenu End -->

        <script type="text/javascript">
            jQuery(".sideMenu").slide({
                titCell:"h3", //鼠标触发对象
                targetCell:"ul", //与titCell一一对应，第n个titCell控制第n个targetCell的显示隐藏
                effect:"slideDown", //targetCell下拉效果
                delayTime:300 , //效果时间
                triggerTime:150, //鼠标延迟触发时间（默认150）
                defaultPlay:true,//默认是否执行效果（默认true）
                returnDefault:true //鼠标从.sideMen移走后返回默认状态（默认false）
            });
        </script>


    </div>

    <div class=" admin-content">


        <div class="admin-biaogelist">

            <div class="listbiaoti am-cf">
                <ul class="am-icon-flag on"> 新增客户</ul>

                <dl class="am-icon-home" style="float: right;"> 当前位置： 首页 > <a href="#">新增客户

            </div>

            <div class="fbneirong">
                <form class="am-form" method="post" action="/CustomAddServlet">
                    <div class="am-form-group am-cf">
                        <div class="zuo">客户姓名：</div>
                        <div class="you">
                            <input type="text" class="am-input-sm" name="cname" placeholder="请输入客户姓名">
                        </div>
                    </div>
                    <div class="am-form-group am-cf">
                        <div class="zuo">客户邮箱：</div>
                        <div class="you">
                            <input type="text" class="am-input-sm" name="cemail" placeholder="请输入客户邮箱">
                        </div>
                    </div>
                    <div class="am-form-group am-cf">
                        <div class="zuo">联系电话：</div>
                        <div class="you">
                            <input type="text" class="am-input-sm" name="cphone" placeholder="请输入联系电话">
                        </div>
                    </div>


                    <div class="am-form-group am-cf">
                        <div class="you" style="margin-left: 11%;">
                            <input type="submit" id="submit" value="新增">
                        </div>
                    </div>
                </form>
            </div>

            <div class="foods">
                <ul>
                    版权所有@2017
                </ul>
                <dl>
                    <a href="" title="返回头部" class="am-icon-btn am-icon-arrow-up"></a>
                </dl>
            </div>

        </div>

    </div>

</div>

<!--[if lt IE 9]>
<script src="http://libs.baidu.com/jquery/1.11.1/jquery.min.js"></script>
<script src="http://cdn.staticfile.org/modernizr/2.8.3/modernizr.js"></script>
<script src="assets/js/polyfill/rem.min.js"></script>
<script src="assets/js/polyfill/respond.min.js"></script>
<script src="assets/js/amazeui.legacy.js"></script>
<![endif]-->

<!--[if (gte IE 9)|!(IE)]><!-->
<script src="assets/js/amazeui.min.js"></script>
<!--<![endif]-->



</body>
</html>