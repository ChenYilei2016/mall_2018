<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored="false"  %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath %>">
<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>硅谷商城</title>
</head>
<body>
	商品属性信息管理
	<hr>
	一级：<select id="attr_class_1_select" onchange="get_attr_class_2(this.value);"><option>请选择</option></select>
	二级：<select  id="attr_class_2_select" onchange="get_attr_list(this.value)"><option>请选择</option></select>
	<br>
	查询<br>
	<a href="javascript:goto_attr_add()">添加</a><br>
	删除<br>
	编辑<br>
	<hr>
	<div id="attrListInner"></div>
	
	<script type="text/javascript">
	$(function (){
		$.getJSON("js/json/class_1.js",function(data){
			$(data).each(function(i,json){
				$("#attr_class_1_select").append("<option value="+json.id+">"+json.flmch1+"</option>");
			});
		});
	});
	
	function get_attr_class_2(class_1_id){
		$.getJSON("js/json/class_2_"+class_1_id+".js",function(data){
			$("#attr_class_2_select").empty();
			$(data).each(function(i,json){
				$("#attr_class_2_select").append("<option value="+json.id+">"+json.flmch2+"</option>");
			});
		});
	}
	
	function goto_attr_add(){
		var class_2_id = $("#attr_class_2_select").val();		
		window.location.href="goto_attr_add.do?flbh2="+class_2_id;
	}
	
	function get_attr_list(flbh2){
		// 异步查询
		$.post("get_attr_list.do",{flbh2:flbh2},function(data){
			$("#attrListInner").html(data);
		});
		
	}
</script>
</body>
</html>