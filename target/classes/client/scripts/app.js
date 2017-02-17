(function() {
	'use strict';
	var app = angular.module(
			'app',
			[ 'ngRoute', 'ngAnimate', 'ui.bootstrap', 'easypiechart',
					'mgo-angular-wizard', 'textAngular', 'ui.tree',
					'ngTagsInput']).config(
			[ '$routeProvider', function($routeProvider, $urlRouterProvider) {
				
    $routeProvider
    .when('/', {
        templateUrl: 'views/Dab.html',
      })
      .when('/formation', {
        templateUrl: 'views/formation.html',
        controller: 'FormationCtrl',
        controllerAs: 'formation'
      })
      .when('/formationDetails/:codeformation', {
        templateUrl: 'views/formationDetails.html',
        controller: 'formationDetails',
        controllerAs: 'formationD'
      })
       .when('/formationDelete/:codeFormation', {
        templateUrl: 'views/DeleteFormation.html',
        controller: 'DeleteFormationCtrl',
        controllerAs: 'formationDelete'
      })
      
      .when('/AjoutFormation', {
        templateUrl: 'views/AjoutFormation.html',
        controller: 'AjoutFormationCtrl',
        controllerAs: 'formationAjout'
      })
       .when('/Dab', {
        templateUrl: 'views/Dab.html',
        controller: 'DabCtrl',
        controllerAs: 'Dab'
      })

      
      
      .otherwise({
        redirectTo: '/'
      });
  } ]);
  
}).call(this);