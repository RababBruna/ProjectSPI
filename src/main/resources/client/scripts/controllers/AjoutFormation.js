'use strict';
angular.module('app')
	  	.controller('AjoutFormationCtrl', ['$scope','AjoutFormationSvc',function ($scope,AjoutFormationSvc) {

	     $scope.AddFormation = function(){
	    		  // data =$scope.formation;
    			AjoutFormationSvc.submit($scope.formation);
           //  console.log($scope.formation);
  
          
    	}
 	  }])
 	     .service('AjoutFormationSvc', ['$http', function($http) {
        	  this.submit = function(formation)
              {
                  $http({
                          url:  "http://localhost:8090/AjoutFormation",
                          method: "POST",
                          data: formation
                     
                      }).success(function(data, status, config) {
                          alert("Done");
                      }).error(function(data, status,  config) {
                          alert("veuillez remplir le formulaire SVP");
                      });
              }	
  }]);