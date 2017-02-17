'use strict';
angular.module('app')

 //console.log($scope.formation);
 	

.service('formationDeleteSvc', ['$http', function($http) {	
	console.log("service");
	   this.fetchPopular = function(codeformation,callback) {
	   		var url = "http://localhost:8090/DeleteFormation/"+codeformation;
	   		$http.get(url).success(function(response) {
           alert("Formation supprimé");
           //window.location.href = "http://localhost:8090/index.html?#/formation";
       }).error(function(response) {
           alert("impossible de supprimer");
           window.location.href = "http://localhost:8090/index.html?#/formation";
       });
	   }
	  }])
	  
	  .controller('DeleteFormationCtrl', ['$scope','formationDeleteSvc','$routeParams',function ($scope,formationDeleteSvc,$routeParams) {
	  			var codeformation = $routeParams.codeFormation;
	  	    	formationDeleteSvc.fetchPopular(codeformation,function(data){
	  	    			$scope.formation=data;
	  	    			window.location.href = "http://localhost:8090/index.html?#/formation";
	  	    	});
	  
  }]);
  
  
  
  
  