require.config({
		baseUrl : "/thazmyrigz/js",
		shim:{
			underscore:{
				exports: '_'
			},
			backbone : {
				deps: ['jquery', 'underscore'],
				exports: 'Backbone'
			},
			jpages: {
				deps: ['jquery'],
				exports: "$"
			}
		},
		paths: {
			'jquery' : 'libs/jquery',
			'underscore' : 'libs/underscore',
			'backbone': 'libs/backbone',
			'jpages' : 'libs/jpages',
			'app' : 'paginate/app',
			'tpl' : 'libs/tpl'
		}
});

require(["app"], function(App){
	App.initialize();
});

require