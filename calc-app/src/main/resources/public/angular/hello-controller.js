app.controller('helloController', [ '$scope', '$http', function($scope, $http) {
	$scope.result = "unset";

	$scope.calculate = function(a, b) {
		console.log('Calculating: ' + a + '+' + b);
		$http({
			method : 'GET',
			url : '/calc/add/' + a + '/' + b
		}).then(function successCallback(response) {
			console.log('Success');
			$scope.result = response.data;
		}, function errorCallback(response) {
			console.log('Failure');
		});
	};
	$scope.calculate(32, 56);
} ]);
