<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <title>权限管理系统</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/layui-v2.4.4/layui/css/layui.css"/>
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
  <div class="layui-header">
    <div class="layui-logo">layui 权限系统</div>
    <!-- 头部区域（可配合layui已有的水平导航） -->
    <ul class="layui-nav layui-layout-left">
      <li class="layui-nav-item"><a href="">控制台</a></li>
      <li class="layui-nav-item"><a href="">用户管理</a></li>
      <li class="layui-nav-item">
        <a href="javascript:;">其它系统</a>
        <dl class="layui-nav-child">
          <dd><a href="">邮件管理</a></dd>
          <dd><a href="">消息管理</a></dd>
          <dd><a href="">授权管理</a></dd>
        </dl>
      </li>
    </ul>
    <ul class="layui-nav layui-layout-right">
      <li class="layui-nav-item">
        <a href="javascript:;">
          <img src="http://t.cn/RCzsdCq" class="layui-nav-img">
          潘彪
        </a>
        <dl class="layui-nav-child">
          <dd><a href="">基本资料</a></dd>
          <dd><a href="">安全设置</a></dd>
        </dl>
      </li>
      <li class="layui-nav-item"><a href="">退了</a></li>
    </ul>
  </div>

  <div class="layui-side layui-bg-black">
    <div class="layui-side-scroll">
      <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
      <ul class="layui-nav layui-nav-tree"  lay-filter="test">
        <li class="layui-nav-item layui-nav-itemed">
          <a class="" href="javascript:;">权限系统</a>
          <dl class="layui-nav-child">
            <dd><a href="${pageContext.request.contextPath}/user/user_main.do">用户</a></dd>
            <dd><a href="${pageContext.request.contextPath}/user/role_main.do">角色</a></dd>
            <dd><a href="${pageContext.request.contextPath}/user/menu_main.do">权限</a></dd>
            <dd><a href="">超链接</a></dd>
          </dl>
        </li>
        <li class="layui-nav-item layui-nav-itemed">
          <a href="javascript:;">新增</a>
          <dl class="layui-nav-child">
            <!-- <dd><a href="javascript:;">新增用户</a></dd> -->
            <dd><a href="${pageContext.request.contextPath}/user/role_add.do">新增角色</a></dd>
            <dd><a href="${pageContext.request.contextPath}/user/menu_add.do">新增权限</a></dd>
          </dl>
        </li>
        <li class="layui-nav-item"><a href="">云市场</a></li>
        <li class="layui-nav-item"><a href="">发布商品</a></li>
      </ul>
    </div>
  </div>

  <div class="layui-body">
    <div style="margin-bottom: 5px;">

	<!-- 示例-970 -->
	<ins class="adsbygoogle" style="display:inline-block;width:970px;height:90px" data-ad-client="ca-pub-6111334333458862" data-ad-slot="3820120620"></ins>

	</div>
	<div class="layui-container">
		<div style="color: green" id="tipInfo" align="justify">${message}</div>
			<div class="layui-tab-item layui-show">
			<div class="layui-form layui-form-pane">
				<form method="post" action="${pageContext.request.contextPath}/user/menuAdd.do">
				<div class="layui-form-item">
					<label for="L_username" class="layui-form-label">权限名</label>
					<div class="layui-input-inline">
						<input type="text" id="L_username" name="mname" required lay-verify="required" autocomplete="off" class="layui-input">
					</div>
					<div class="layui-form-mid layui-word-aux">请输入权限名</div>
				</div>
				  <div class="layui-form-item layui-form-text">
				    <label class="layui-form-label">请填权限描述</label>
				    <div class="layui-input-block">
				      <textarea placeholder="请输入内容" class="layui-textarea" name="minfo"></textarea>
				    </div>
				  </div>
				<div class="layui-form-item">
					<button class="layui-btn" lay-filter="*" lay-submit>添加</button>
					<a href="">&nbsp;&nbsp;返回</a>
				</div>
				</form>
			</div>
		</div>
	</div>


	<script src="${pageContext.request.contextPath}/layui-v2.4.4/layui/layui.all.js"></script>
  </div>

  <div class="layui-footer">
    <!-- 底部固定区域 -->
    © layui.com - 底部固定区域
  </div>
</div>

<script src="${pageContext.request.contextPath}/layui-v2.4.4/layui/jquery-1.8.2.min.js"></script>
<script>
//JavaScript代码区域
layui.use('element', function(){
  var element = layui.element;

});
</script>
</body>
</html>