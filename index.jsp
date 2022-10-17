<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<html>
<head>
    <meta charset="utf-8">
    <title>登录界面</title>
    <link rel="stylesheet" href="css/style.css" charset="UTF-8">
</head>
<body>
<form method="post" action="LoginServlet">
    <div class="box">
        <h2>欢迎登录xxx系统</h2>
        <div class="input-box">
            <label>账号</label>
            <input type="text" name="id">
        </div>
        <div class="input-box">
            <label>密码</label>
            <input type="password" name="pwd">
        </div>
        <div class="btn-box">
            <a href="#">忘记密码?</a>
            <div>
                <input type="submit" value="登录">
                <button>登录</button>
                <button>注册</button>
            </div>
        </div>
    </div>
</form>
<script src="js/javascript.js"></script>
<script src="https://code.jquery.com/jquery-3.2.1.min.js" charset="UTF-8"></script>

</body>
</html>
