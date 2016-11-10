app.controller('helloController', ['$scope', '$http', function($scope, $http) {
	$scope.message = "unset";

	$scope.loadMessage = function() {
		console.log('Fetching message');
		$http({
			method : 'GET',
			url : '/hello'
		}).then(function successCallback(response) {
			console.log('Success');
			$scope.message = response.data.message;
		}, function errorCallback(response) {
			console.log('Failure');
		});
	};
	$scope.loadMessage();
}]);
