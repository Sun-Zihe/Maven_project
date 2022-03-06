<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: wo
  Date: 2022-01-16
  Time: 10:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主页</title>
    <script src="../js/jquery-1.8.3.min.js"></script>
</head>
<style>
    #button{
        margin-top: 5px ;
        border:0;
        background: #5795DB ;
        outline:none;
        border-radius: 50%;
        color: #EEEEEE;
    }
    #newspaper-a
    {
        margin: 20px auto 0;
        font-family: "Lucida Sans Unicode", "Lucida Grande", Sans-Serif;
        font-size: 15px;

        width: 1000px;
        text-align: left;
        border-collapse: collapse;
        border: 1px solid #69c;

    }
    #newspaper-a th
    {
        padding: 12px 17px 12px 17px;
        font-weight: normal;
        font-size: 18px;
        color: #039;
        border-bottom: 1px dashed #69c;
    }
    #newspaper-a td
    {
        padding: 7px 17px 7px 17px;
        color: #669;
        text-align: center;
    }
    #newspaper-a tbody tr:hover td
    {
        color: #339;
        background: #d0dafd;
    }

    /*分页*/

    #menu {
        list-style: none;
        padding: 0 12px;
        margin: 0 auto;

        background: #4080be;

        height: 50px;
        overflow: hidden;
        border-radius: 5px;

        /* 3d effect using box-shadows */
        box-shadow: 0px 4px #1253a3, 0px 4px 6px rgba(0, 0, 0, 0.3);
    }

    /* Now the list items */
    #menu td {
        margin-left: 10px;
        display: inline-block;
        position: relative;
        bottom: -11px;
    }

    #menu td:first-child {margin: 0}

    /* The real fun begins here :D */
    #menu td a {
        background: #5795db;
        display: block;
        border-radius: 3px;
        padding: 0 12px;
        color: white;
        position: relative;
        text-decoration: none;
        height: 27px;
        font: 12px / 27px "PT Sans", Arial, sans-serif;
        /* Now the 3d effect */
        box-shadow: 0px 3px #5b98c0, 0px 4px 5px rgba(0, 0, 0, 0.3);
        transition: all 0.3s ease;
    }


    #menu td a:hover {background: #bae0ea}
    #menu td a:active {
        background: #bae0ea;
        /* Now, let's make it look like its pressed down when clicked */
        bottom: -3px;
        box-shadow: 0px 0px #7fafbc, 0px 1px 3px rgba(0, 0, 0, 0.3);
    }


/*导航栏*/
    .container { position: relative; width: 1200px;
        padding: 0;
        margin: 10px auto 0;
        font: 18px/21px "Open Sans",Arial, sans-serif; color: #446cb3; z-index:1}


    .menu{display:block;position:relative}
    .menu,
    .menu ul{margin:0;padding:0;list-style:none;position:relative; background-color:#ffffff;border: 1px solid #E1E1E1; border-radius: 5px;}
    .menu ul a{float:left}
    .menu ul ul a{float:none;}
    .menu
    .mega-menu a{float:none;padding:3px;}
    .menu ul ul,
    .menu
    .mega-menu,
    .menu
    .mega-menu ol li{opacity:0;visibility:hidden;display:none ! important;-webkit-transition:opacity 150ms ease-in-out;-moz-transition:opacity 150ms ease-in-out;-o-transition:opacity 150ms ease-in-out;-ms-transition:opacity 150ms ease-in-out;transition:opacity 150ms ease-in-out}
    .menu li:hover>ul,
    .menu li:hover>
    .mega-menu,
    .menu li:hover>
    .mega-menu ol li{opacity:1;visibility:visible;display:block ! important}
    .menu ul:after{content:"";clear:both;display:block}
    .menu ul li{float:left;-webkit-transition:all 150ms ease-in-out;-moz-transition:all 150ms ease-in-out;-o-transition:all 150ms ease-in-out;-ms-transition:all 150ms ease-in-out;transition:all 150ms ease-in-out}
    .menu ul li a{display:block;padding:14px 20px 15px 20px;color:#fff;text-decoration:none; border-right: 1px solid rgba(211, 208, 206, 0.9);
        box-shadow: 1px 0 0 rgba(255, 255, 255, 0.1);}
    .menu .arrow:after{content:"";float:right;text-align:right;width:0;height:0;display:block;border-left:3px solid rgba(0,0,0,0);border-right:3px solid rgba(0,0,0,0);border-top:3px solid #fff;top:9px;margin:0 0 0 5px;position:relative;border-left:3px solid transparent;border-right:3px solid transparent}
    .menu ul li ul li .arrow:after{border-top:3px solid transparent;border-bottom:3px solid transparent;border-left:3px solid #bbb;margin:-2px 0 0 5px}
    .menu i{font-size:14px;font-style:normal;float:left;margin:4px 4px 0 -2px;line-height:14px;padding:0}
    .menu .right{float:right;}
    .menu .right ul,
    .menu .right
    .mega-menu{right:0}
    .menu ul ul{background:#fff;border:1px solid #e0e0e0;border-top:0;border-bottom:0;position:absolute;top:100%;width:170px;-webkit-box-shadow:0 1px 1px rgba(0,0,0,.04);box-shadow:0 1px 1px rgba(0,0,0,.04)}
    .menu ul ul ul{position:absolute;left:100%;border-top:1px solid #e0e0e0;top:-1px}
    .menu ul ul li a{padding:8px 12px;color:#777;border-bottom:1px solid #e4e4e4; background:#FFFFFF;}
    .menu ul ul li{float:none;position:relative;-webkit-transition:none;-moz-transition:none;-o-transition:none;-ms-transition:none;transition:none}
    .menu ul ul li a:active,
    .menu ul ul li:hover{background:#f5f5f5}
    .menu ul ul li{background:#fff}
    .mega-menu{position:absolute;top:100%;padding:18px 11px;background-color:#fff;border:1px solid #e0e0e0;border-top:none;color:#777;-webkit-box-shadow:0 1px 1px rgba(0,0,0,.04);box-shadow:0 1px 1px rgba(0,0,0,.04);-webkit-box-sizing:border-box;-moz-box-sizing:border-box;box-sizing:border-box}
    .mega-menu ol{list-style:none;padding:0}
    .mega-menu ol li{width:100%}
    .mega-menu ol li:hover,
    .mega-menu ol li a{color:#777;font-size:14px;padding:0;background-color:#fff;background-image:none;}
    .mega-menu ol li a:hover{color:#505050; background-color:#edf1f8; padding-left:8px;}
    .mega-menu div h4{font-size:16px;color:#404040;border-bottom:1px solid #e4e4e4;padding:0 0 8px 0;margin:0 0 10px 0; font-weight:normal}
    .mega-menu div h4 a{color:#000;}
    .mega-menu .col-1{width:135px}
    .mega-menu .col-2{width:288px}
    .mega-menu .col-3{width:441px}
    .mega-menu .col-4{width:594px}
    .mega-menu .col-5{width:747px}
    .mega-menu .col-6{width:900px}
    .mega-menu .col-1,
    .mega-menu .col-2,
    .mega-menu .col-3,
    .mega-menu .col-4,
    .mega-menu .col-5,
    .mega-menu .col-6{float:left;margin:0 9px}
    .mega-menu.full-width{left:0;width:100%;padding:18px 0}.full-width .col-1{width:14.1%}.full-width .col-2{width:30.4%}.full-width .col-3{width:46.7%}.full-width .col-4{width:63%}.full-width .col-5{width:79.3%}.full-width .col-6{width:95.6%}.full-width .col-1,.full-width .col-2,.full-width .col-3,.full-width .col-4,.full-width .col-5,.full-width .col-6{float:left;margin:0 0 0 2.2%}@media only screen and (max-width: 767px){
        .menu ul li{width:100%;cursor:pointer}
        .menu ul li{position:relative}
        .menu
        .mega-menu ol li{height:0}
        .menu li:hover>
        .mega-menu ol li{height:auto}
        .mega-menu,
        .menu ul ul{z-index:100}
        .menu ul ul{width:100%;-webkit-box-sizing:border-box;-moz-box-sizing:border-box;box-sizing:border-box}
        .menu ul ul ul{left:0}
        .menu ul ul li:hover>ul{position:relative;border:none;border-top:1px solid #e4e4e4;-webkit-box-shadow:none;box-shadow:none}
        .menu ul li ul li .arrow:after{border-left:3px solid transparent;border-right:3px solid transparent;border-top:3px solid #bbb;margin:0}
        .mega-menu{padding:18px 0}
        .mega-menu ol li:last-child{margin:0 0 20px 0}
        .menu .col-1,.full-width .col-1,
        .menu .col-2,.full-width .col-2,
        .menu .col-3,.full-width .col-3,
        .menu .col-4,.full-width .col-4,
        .menu .col-5,.full-width .col-5,
        .menu .col-6,.full-width .col-6{float:left;margin:0 0 0 5%;width:90%}}
    .style-1
    .menu, .style-1
    .menu ul li  { background-color: #446cb3; background-image: linear-gradient(bottom, rgba(0,0,0, 0) 50%, rgba(255,255,255, 0.04) 0%); background-image: -o-linear-gradient(bottom, rgba(0,0,0, 0) 50%, rgba(255,255,255, 0.04) 0%); background-image: -moz-linear-gradient(bottom, rgba(0,0,0, 0) 50%, rgba(255,255,255, 0.04) 0%); background-image: -webkit-linear-gradient(bottom, rgba(0,0,0, 0) 50%, rgba(255,255,255, 0.04) 0%); background-image: -ms-linear-gradient(bottom, rgba(0,0,0, 0) 50%, rgba(255,255,255, 0.04) 0%); } .style-1
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           .menu ul li:hover { background-color: #eb4e01; background-image: linear-gradient(bottom, rgba(0,0,0, 0) 50%, rgba(255,255,255, 0.08) 0%); background-image: -o-linear-gradient(bottom, rgba(0,0,0, 0) 50%, rgba(255,255,255, 0.08) 0%); background-image: -moz-linear-gradient(bottom, rgba(0,0,0, 0) 50%, rgba(255,255,255, 0.08) 0%); background-image: -webkit-linear-gradient(bottom, rgba(0,0,0, 0) 50%, rgba(255,255,255, 0.08) 0%); background-image: -ms-linear-gradient(bottom, rgba(0,0,0, 0) 50%, rgba(255,255,255, 0.08) 0%); }

    a.rss:hover{ background:#ffaa31; color:#fff; padding-left:20px;}
    a.twitter:hover{background:#07beed; color:#fff; padding-left:20px;}
    a.facebook:hover{background:#314d91; color:#fff; padding-left:20px;}
    a.googleplus:hover{background:#2d2d2d; color:#fff; padding-left:20px;}
    a.pinterest:hover{background:#cd1d1f; color:#fff; padding-left:20px;}
    a.stumbleupon:hover{background:#ec4b24; color:#fff; padding-left:20px;}

    #sitesearchform fieldset {
        float: left;
        color: #888;
        border: 1px solid #DFDFDF;
        -webkit-box-shadow: 0 0 0 3px rgba(0, 0, 0, 0.04), inset 0 2px 8px 0 rgba(0, 0, 0, 0.075);
        -moz-box-shadow: 0 0 0 3px rgba(0, 0, 0, 0.04), inset 0 2px 8px 0 rgba(0, 0, 0, 0.075);
        box-shadow: 0 0 0 3px rgba(0, 0, 0, 0.04), inset 0 2px 8px 0 rgba(0, 0, 0, 0.075);
        -webkit-transition: all 0.25s linear;
        -moz-transition: all 0.25s linear;
        transition: all 0.25s linear;
        -webkit-box-sizing: border-box;
        -moz-box-sizing: border-box;
        box-sizing: border-box;
        border-radius: 3px;
        width: 250px;
        margin: 5px 0 0 60px;
        height:40px;
        background-color:#fff;
    }
    #sitesearchform fieldset:hover {
        border: 1px solid #275468;
        -webkit-box-shadow: 0 0 0 3px rgba(199, 0, 0, 0.04), inset 0 2px 8px 0 rgba(0, 0, 199, 0.4);
        -moz-box-shadow: 0 0 0 3px rgba(199, 0, 0, 0.04), inset 0 2px 8px 0 rgba(0, 0, 199, 0.4);
        box-shadow: 0 0 0 3px rgba(199, 0, 0, 0.04), inset 0 2px 8px 0 rgba(0, 0, 199, 0.4);
    }
    #sitesearchform {
        margin: 0 10px 10px 0;
        display: block;
        -webkit-transition: all 0.25s linear;
        -moz-transition: all 0.25s linear;
        transition: all 0.25s linear;
    }
    .sidesearch_input {
        margin: 5px 0px 0px;
        border: 0px solid #fff;
        background-color: transparent;
        height: 18px;
        width:185px;
        font-size: 14px;
        float: left;
        color: #555;
        padding:3px;
    }
    .sidesearch_submit {
        margin-top:5px;
        margin-left:11px;
        float:left;
        border:0px solid red;
        background-color:transparent;
    }

/*应用栏*/
    #operation{
        padding: 20px;
        width: 900px;
        margin: 25px auto 0;
    }

    #operation #left-AP input{
        color:  #ffffff;
        margin: 0;
        padding: 5px;
        border-radius: 4px;
        border: 1px solid transparent;
        background-color: coral;
    outline: none;
        float: left;
    }

    #operation #rg-AP{
        float: right;
    }

    #operation #rg-AP #search{
        color: #ffffff;
        margin: 0;
        padding: 5px;
        border-radius: 4px;
        border: 1px solid transparent;
        background-color: #529a52;
        outline: none;

    }

</style>
<body>
<%--导航栏--%>
<div class="container">
    <div class="menu style-1">
        <ul class="menu">
            <li><a href="#">主页</a></li>
            <li><a href="#" class="arrow">IT学习课程</a>
                <div class="mega-menu full-width">
                    <div class="col-1">
                        <h4><a href="#">Graphic Design</a></h4>
                        <ol>
                            <li><a href="#">Design</a></li>
                            <li><a href="#">Logo Design</a></li>
                            <li><a href="#">Tutorials</a></li>
                            <li><a href="#">Mehndi Designs</a></li>
                            <li><a href="#">Vector Graphics</a></li>
                            <li><a href="#">Wallpapers</a></li>
                        </ol>
                    </div>

                    <div class="col-1">
                        <h4><a href="#">Web Design</a></h4>
                        <ol>
                            <li><a href="#">Website Design</a></li>
                            <li><a href="#">HTML5 &amp; CSS3</a></li>
                            <li><a href="#">jQuery</a></li>
                            <li><a href="#">Javascript</a></li>
                            <li><a href="#">Coding</a></li>
                        </ol>
                    </div>

                    <div class="col-1">
                        <h4><a href="#">Freebies</a></h4>
                        <ol>
                            <li><a href="#">Free Fonts</a></li>
                            <li><a href="#">Icons</a></li>
                            <li><a href="#">Free PSD Files</a></li>
                            <li><a href="#">PSD Templats</a></li>
                            <li><a href="#">Software &amp; Utilities</a></li>
                        </ol>
                    </div>

                    <div class="col-1">
                        <h4><a href="#">Inspiration</a></h4>
                        <ol>
                            <li><a href="#">Business Cards</a></li>
                            <li><a href="#">Photography</a></li>
                            <li><a href="#">Poster Design</a></li>
                            <li><a href="#">Typography</a></li>
                            <li><a href="#">Illustration Art</a></li>
                        </ol>
                    </div>

                    <div class="col-1">
                        <h4><a href="#">Wordpress</a></h4>
                        <ol>
                            <li><a href="#">Wordpress Themes</a></li>
                            <li><a href="#">Wordpress Plugins</a></li>
                        </ol>
                    </div>

                    <div class="col-1">
                        <h4><a href="#">Technology</a></h4>
                        <ol>
                            <li><a href="#">Apple</a></li>
                            <li><a href="#">Google</a></li>
                            <li><a href="#">Facebook</a></li>
                            <li><a href="#">iPhone Games</a></li>
                            <li><a href="#">iPhone Apps</a></li>
                        </ol>
                    </div>
                </div>
            </li>
            <li><a href="#">Advertise</a></li>
            <li><a href="#">Write For Us</a></li>
            <li><a href="#">Contact Us</a></li>
            <li>
                <div id="sidesearch">
                    <form id="sitesearchform" style="display:inline" method="get" action="http://js.itivy.com/?">
                        <fieldset style="border: none">
                            <input class="sidesearch_input" type="text" value="e.g: Web Design" onfocus="if (this.value == 'e.g: Web Design') {this.value = '';}"  x-webkit-speech="" onwebkitspeechchange="transcribe(this.value)" onblur="if (this.value == '') {this.value = 'e.g: Web Design';}" name="s" id="s">
                            <input type="image" class="sidesearch_submit" src="../img/sidesearchsubmit.png" />
                        </fieldset>
                    </form>
                </div>

            </li>
            <li class="right"><a href="#" class="arrow">${user.username}</a>
                <ul>
                    <li><a href="./userInfo.html" class="rss" title="Subscribe to RSS" style="text-align: center">个人信息</a></li>
                    <li><a href="#" class="twitter" title="Follow us on Twitter" style="text-align: center">我的收藏</a></li>
                    <li><a href="#" class="facebook" title="Follow us on Facebook" style="text-align: center">修改记录</a></li>
                    <li><a href="#" class="googleplus" title="Follow us on Google+" style="text-align: center">我的关注</a></li>
                    <li><a href="#" class="pinterest" title="Follow us on Pinterest" style="text-align: center">我的日志</a></li>
                    <li><a href="./logout" class="stumbleupon" title="Follow us on Stumbleupon" style="text-align: center">退出登录</a></li>
                </ul>
            </li>

        </ul>
    </div>
</div>
<div style="background-color:#e5e5e5 ; width: 1200px;margin: 0 auto; padding-bottom: 100px;border-radius: 9px;">
<div style="margin: 0 auto; border-radius: 20px;border-bottom:1px dotted black;background-color: #e5e5e5;padding-top: 55px;padding-bottom: 55px ;width: 1200px" ><span style="color: #5488a8;font-size: 40px; margin-left: 30px ">学生信息</span></div>
<%--应用栏--%>
<div id="operation">
    <div id="left-AP">
        <input type="submit" value="批量删除">
    </div>
    <div id="rg-AP">
        <form action="pages" method="get">
        <input type="text" placeholder="请输入学生姓名" id="name-search" name="inputName">
        <input type="radio" name="gender" checked >男
        <input type="radio" name="gender" >女
        <input type="submit" value="查询" id="search">
        </form>
    </div>
</div>
<%--表格--%>
<table id="newspaper-a" align="center" summary="2007 Major IT Companies' Profit" >
    <thead align="center">
    <tr>
        <th scope="col">编号</th>
        <th scope="col">姓名</th>
        <th scope="col">年龄</th>
        <th scope="col">性别</th>
        <th scope="col">信息</th>
        <th scope="col">操作</th>
    </tr>
    <c:if test="${not empty pageInfo.list}">
    <c:forEach var="student" items="${pageInfo.list}">
    </thead>
    <tbody>
    <tr>
        <td>${student.id}</td>
        <td>${student.name}</td>
        <td>${student.age}</td>
        <td>${student.gender}</td>
        <td>${student.info}</td>
        <td>
            <a href="select?id=${student.id}">修改</a>
            <a id="id${student.id}" onmouseover="over(${student.id})" onmouseout="out(${student.id})"
               onclick="del(${student.id})">删除</a>
        </td>
    </tr>

    </tbody>
    </c:forEach>
    </c:if>
    <tr>
        <td colspan="6" align="center">
            <a href="addStudent.jsp">添加学生</a>
        </td>
    </tr>
</table>
<form action="pages" method="get">
    <table  id="menu">
        <tr>

            <c:if test="${pageInfo.pageNo == 1}">
                <td><a style="color: #da0816">首页</a></td>
            </c:if>

            <c:if test="${pageInfo.pageNo != 1}">
                <td><a style="color: #EEEEEE" href="pages?pageNo=1">首页</a></td>
            </c:if>


            <c:if test="${pageInfo.pageNo == 1}">
                <td><a style="color: #da0816">上一页</a></td>
            </c:if>

            <c:if test="${pageInfo.pageNo != 1}">
                <td><a style="color: #EEEEEE" href="pages?pageNo=${pageInfo.pageNo - 1}">上一页</a></td>
            </c:if>

            <c:forEach begin="1" end="${pageInfo.pageCount}" var="pageNo" varStatus="pageStatus">
                <td><a><input id="button" type="submit" name="pageNo" value="${pageNo}"></a></td>
            </c:forEach>

            <c:if test="${pageInfo.pageNo == pageInfo.pageCount}">
                <td><a style="color: #da0816">下一页</a></td>
            </c:if>

            <c:if test="${pageInfo.pageNo != pageInfo.pageCount}">
                <td><a style="color: #EEEEEE" href="pages?pageNo=${pageInfo.pageNo + 1}">下一页</a></td>
            </c:if>

            <c:if test="${pageInfo.pageNo == pageInfo.pageCount}">
                <td><a style="color:#da0816">尾页</a></td>
            </c:if>

            <c:if test="${pageInfo.pageNo != pageInfo.pageCount}">
                <td><a style="color: #EEEEEE" href="pages?pageNo=${pageInfo.pageCount}">尾页</a></td>
            </c:if>
            <td style="color: #EEEEEE">共${pageInfo.totalCount}条内容</td>&nbsp&nbsp&nbsp
            <td style="color: #EEEEEE">共${pageInfo.pageCount}页</td>
        </tr>
    </table>
</form>
</div>
</body>
<script>
    function del(id) {
        if (confirm('是否确认删除？') === true) {
            window.location.href = 'delete?id=' + id;
        }
    }

    function over(id) {
        var a = document.getElementById('id' + id);

        a.style.color = 'red';
        a.style.cursor = 'pointer';
    }

    function out(id) {
        var a = document.getElementById('id' + id);

        a.style.color = 'black';
    }

    function logout() {
        if (confirm('是否确认退出？') === true) {
            window.location.href = 'logout';
        }
    }

</script>
</html>
