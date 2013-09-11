require.config({
	baseUrl:"/thazmyrigz/js",
	shim:{
		underscore: {exports: '_'},
		backbone:{
			deps:['jquery', 'underscore'],
			exports:'Backbone'
		}
	},
	paths:{
		'backbone' :'libs/backbone',
		'underscore':'libs/underscore',
		'jquery': 'libs/jquery',
		'app' :'testing/app'
	}
});

require(["app"], function(App){
	App.initialize();
})