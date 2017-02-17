
'use strict';

angular.module('app')
  .service('formationDetailsSvc', ['$http', function ($http) {
   this.fetchPopular = function(codeformation,callback) {
   		var url = "http://localhost:8090/formation/"+codeformation;
   		$http.get(url).then(function(response){
   			callback(response.data);
   		});
   };

  }])
  
	  	.controller('formationDetails', ['$scope','formationDetailsSvc','$routeParams',function ($scope,formationDetailsSvc,$routeParams) {
		$scope.formation=null;
		var codeformation = $routeParams.codeformation;
    	formationDetailsSvc.fetchPopular(codeformation,function(data){
    			$scope.formation=data;
               // console.log(data);
    	})
 	  }]);