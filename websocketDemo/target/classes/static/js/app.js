/**
 * 
 */
/*
 * var name = $("[ここに入力欄のinputのセレクタ]").val();



$.ajax({
  url: "/data/name.json",
  data: {name: name},
  type: "post"
}).done(function(data){
  $("sendName").val(data);
}); * */


/*　ダミ　
	$scope.alertData = [
						{title :'【竜巻】',content : '急上昇中！'},
						{title :'【土砂災害】',content : '発生！'},
						{title :'【洪水】',content : '予想！'},
						{title :'【洪水】',content : '注意！'},
						{title :'【氾濫】',content : '注意！'},
						{title :'【氾濫】',content : '緊急！'} 
						];
	
var app  = angular.module('demoScope',[]);

app.controller('demoCtrl',function($scope, $http){
//	url = 'http://localhost:8080/category-Alert';
//	  $http.get(url).success (function(response){
//		  $scope.alertData = response;
//	  });
	$scope.alertData = [
						{title :'【竜巻】',content : '急上昇中！'},
						{title :'【土砂災害】',content : '発生！'},
						{title :'【洪水】',content : '予想！'},
						{title :'【洪水】',content : '注意！'},
						{title :'【氾濫】',content : '注意！'},
						{title :'【氾濫】',content : '緊急！'} 
						];
	
});
					
						
*/

var myAppModule = angular.module('myApp', []);

//configure the module.
//in this example we will create a greeting filter
myAppModule.filter('greet', function() {
return function(name) {
 return 'Hello, ' + name + '!';
};
});
  