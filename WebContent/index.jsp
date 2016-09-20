<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello World</title>
</head>
<script
	src="http://cdn.static.runoob.com/libs/angular.js/1.4.6/angular.min.js"></script>

<body ng-app="myapp">
	<div ng-controller="loginController as login">
		{{login.name}}

		<div>
			ID：<input type="text" ng-model="login.user.id">
		</div>
		<div>
			账号：<input type="text" ng-model="login.user.code">
		</div>
		<div>
			姓名：<input type="text" ng-model="login.user.name">
		</div>
		<div>
			密码：<input type="password" ng-model="login.user.password">
		</div>
		<div ng-click="login.login();">GET</div>
		<div ng-click="login.regit();">POST</div>
		<div ng-click="login.update();">POST</div>
		<div ng-click="login.del();">DELETE</div>
		<div ng-click="login.put();">PUT</div>
		<div ng-click="login.zhanweifu();">占位符</div>
	</div>

	${message}
</body>
<script>
	var app = angular.module('myapp', []);
	app.controller('loginController', function($http) {
		var l = 'http://localhost:9090/SSMDemo/login';
		var id = 1;

		this.user = {};
		
		this.name = "jack";
		this.login = function() {
			$http.get(
					l + '/add?code=' + this.code + '&password='
							+ this.password).success(function(result) {
				console.log(result);
			}).error(function(result) {
				console.log(result);
			});
		}

		

		this.regit = function() {
			$http.post(l, angular.fromJson(this.user)).success(function(result) {
				console.log(result);
			}).error(function(result) {
				console.log(result);
			});
			console.log(JSON.stringify(user));
		}

		this.update = function() {

			$http.post(l + '/update?id=' + id, this.user).success(function(result) {
				console.log(result);
			}).error(function(result) {
				console.log(result);
			});
		}

		this.del = function() {
			$http({
				method : 'DELETE',
				url : l + '?id=' + id
			}).success(function(result) {
				console.log(result);
			}).error(function(result) {
				console.log(result);
			});
		}

		this.put = function() {
			$http({
				method : 'PUT',
				url : l + '/put?id=' + id,
				data : user
			}).success(function(result) {
				console.log(result);
			}).error(function(result) {
				console.log(result);
			});
		}
		
		
		this.zhanweifu = function(){
			console.log('占位符');
			$http.get(
					l + '/1').success(function(result) {
				console.log(result);
			}).error(function(result) {
				console.log(result);
			});
		}
	});
</script>
</html>
