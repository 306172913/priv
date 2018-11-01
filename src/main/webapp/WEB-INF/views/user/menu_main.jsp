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

	<div class="layui-btn-group demoTable">
	  <button class="layui-btn" data-type="getCheckData">获取选中行数据</button>
	  <button class="layui-btn" data-type="getCheckLength">获取选中数目</button>
	  <button class="layui-btn" data-type="isAll">验证是否全选</button>
	</div>

	<table class="layui-table" lay-data="{width: 1200, height:560, url:'${pageContext.request.contextPath}/user/findAllMenu.do', page:true, id:'idTest'}" lay-filter="demo">
	  <thead>
	    <tr>
	      <th lay-data="{type:'checkbox', fixed: 'left'}"></th>
	      <th lay-data="{field:'mid', width:70, sort: true, fixed: true}">MID</th>
	      <th lay-data="{field:'mname', width:100}">权限名</th>
	      <th lay-data="{field:'minfo', width:400}">权限信息</th>
	      <th lay-data="{fixed: 'right', width:178, align:'center', toolbar: '#barDemo'}"></th>
	    </tr>
	  </thead>
	</table>

	<script type="text/html" id="barDemo">
  		<a class="layui-btn layui-btn-primary layui-btn-xs" lay-event="detail">查看</a>
  		<a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
  		<a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
	</script>
	<!-- 这个js必须比下面的js先加载，不然下面的js不可用 -->
	<script src="${pageContext.request.contextPath}/layui-v2.4.4/layui/layui.all.js"></script>
	<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
	<script>
		layui.use('table', function(){
		  var table = layui.table;
		  //监听表格复选框选择
		  table.on('checkbox(demo)', function(obj){
		    console.log(obj)
		  });
		  //监听工具条
		  table.on('tool(demo)', function(obj){
		    var data = obj.data;
		    if(obj.event === 'detail'){
		      layer.msg('ID：'+ data.id + ' 的查看操作');
		    } else if(obj.event === 'del'){
		      layer.confirm('真的删除行么', function(index){
		        obj.del();
		        layer.close(index);
		      });
		    } else if(obj.event === 'edit'){
		      layer.alert('编辑行：<br>'+ JSON.stringify(data))
		    }
		  });

		  var $ = layui.$, active = {
		    getCheckData: function(){ //获取选中数据
		      var checkStatus = table.checkStatus('idTest')
		      ,data = checkStatus.data;
		      layer.alert(JSON.stringify(data));
		    }
		    ,getCheckLength: function(){ //获取选中数目
		      var checkStatus = table.checkStatus('idTest')
		      ,data = checkStatus.data;
		      layer.msg('选中了：'+ data.length + ' 个');
		    }
		    ,isAll: function(){ //验证是否全选
		      var checkStatus = table.checkStatus('idTest');
		      layer.msg(checkStatus.isAll ? '全选': '未全选')
		    }
		  };

		  $('.demoTable .layui-btn').on('click', function(){
		    var type = $(this).data('type');
		    active[type] ? active[type].call(this) : '';
		  });
		});
</script>
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