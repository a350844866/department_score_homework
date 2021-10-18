<%@ page language="java" pageEncoding="UTF-8" %>
<%@ include file="base.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html lang="en">
<style>
    body {
        text-align: center;
        background: url("../staticfile/images/sh.jpeg");
        background-size: cover;
        text-align: center;
    }

    h1 {
        color: indianred;
        text-align: center;
        font-size: 100px;
    }

    a {
        text-align: center;
        width: auto;
        height: auto;
        font-size: 50px;
    }

</style>

<head>


</head>

<body class="">
<h1>
    感谢您的反馈!
</h1>
<br>
<a align="center" href="${ctx}/login">退出登录</a>
<br>
<a align="center" href="${ctx}/score">查看/重新投票</a>
</body>

</html>


