/**
 * 
 */
var myAppModule = angular.module('myApp', []);

//configure the module.
//in this example we will create a greeting filter

myAppModule.controller('demoCtrl',function($scope,$http){
	url = 'http://localhost:8080/data/alertData.json';
	  $http.get(url).success (function(response){
		  $scope.alertData = response;
	  });
	
	  $scope.client;
	  $scope.name = '';
	  $scope.message = '';

	  $scope.init = function() {
	    var socket = new SockJS('http://localhost:8080/endpoint'); //SockJS endpoint를 이용
	    $scope.client = Stomp.over(socket); //Stomp client 구성
	    $scope.client.connect({}, function(frame) {
	      console.log('connected stomp over sockjs');
	      // subscribe message
	      $scope.client.subscribe('/subscribe/echo', function(message) {
	        console.log('receive subscribe');
	        console.log(message);
	      });
	    });
	  };

	// send message
	  $scope.send = function() {
	    var data = {
	      name: $scope.name,
	      message: $scope.message
	    };
	    $scope.client.send('/app/echo', {}, JSON.stringify(data));
	  };
});