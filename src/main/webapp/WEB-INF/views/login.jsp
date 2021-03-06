<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="utf-8" />
		<title></title>
		<script src="layui-v2.4.4/layui/layui.all.js"></script>
		<script src="layui-v2.4.4/layui/jquery-1.8.2.min.js"></script>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/layui-v2.4.4/layui/css/font_24081_qs69ykjbea.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/layui-v2.4.4/layui/css/global.css" charset="utf-8">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/layui-v2.4.4/layui/css/layui.css"/>
	</head>
	<body>
		<div class="layui-container">
		<div class="layui-tab-item layui-show">
		<div class="layui-form layui-form-pane">
		<form method="post" action="${pageContext.request.contextPath}/user/userLogin.do">
			<div class="layui-form-item">
				<label for="L_email" class="layui-form-label">手机/邮箱</label>
				<div class="layui-input-inline">
					<input type="text" id="L_loginName" name="username" required lay-verify="required" autocomplete="off" class="layui-input">
				</div>
				<div class="layui-form-mid layui-word-aux">
					使用手机或者邮箱中的任意一个均可（若采用手机，请确保你的帐号已绑定过该手机）
				</div>
			</div>
			<div class="layui-form-item">
				<label for="L_pass" class="layui-form-label">密码</label>
				<div class="layui-input-inline">
					<input type="password" id="L_pass" name="password" required lay-verify="required" autocomplete="off" class="layui-input">
				</div>
			</div>
<!-- 			<div class="layui-form-item">
				<label for="L_vercode" class="layui-form-label">图形码</label>
				<div class="layui-input-inline">
					<input type="text" id="L_imagecode" name="imagecode" required lay-verify="required" autocomplete="off" class="layui-input">
				</div>
				<div class="layui-form-mid" style="padding: 0!important;">
					<img src="/auth/imagecode?t=1540955608824" class="fly-imagecode">
				</div>
			</div> -->
			<div class="layui-form-item">
				<div style="color: red" id="tipInfo" align="justify">${message}</div>
				<button class="layui-btn" lay-filter="*" lay-submit>立即登录</button>
				<a href="../register.html">&nbsp;&nbsp;&nbsp;注册</a>
				<!-- <span style="padding-left:20px;"> <a href="/user/forget">忘记密码？</a> </span> -->
			</div>
<!-- 			<div class="layui-form-item fly-form-app">
				<span>或者使用社交账号登入</span>
				<a href="/app/qq" onclick="layer.msg('正在通过QQ登入', {icon:16, shade: 0.1, time:0})" class="iconfont icon-qq" title="QQ登入"></a>
				<a href="/app/weibo/" onclick="layer.msg('正在通过微博登入', {icon:16, shade: 0.1, time:0})" class="iconfont icon-weibo" title="微博登入"></a>
			</div> -->
			</form>
		</div>
		</div>
		</div>
		<script>
		//Demo
		layui.use('form', function(){
		  var form = layui.form;
		  $()
		  //监听提交
		  form.on('submit(formDemo)', function(data){
		    layer.msg(JSON.stringify(data.field));
		    //return false;
		  });
		});
</script>
	</body>
</html>
