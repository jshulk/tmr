require.config({
		baseUrl:"js",
		shim:{
			underscore:{
				exports:'_'
			},
			backbone:{
				deps:['jquery', 'underscore'],
				exports:'Backbone'
			},
			marionette: {
				deps:['backbone'],
				exports:'Backbone.Marionette'
			},
			relational:{
				deps:['backbone'],
				exports:'Backbone.RelationalModel'
			},
			bootstrap:{
				deps:['jquery'],
				exports:'Bootstrap'
			},
			timeout:{
				deps:['jquery'],
				exports:'doTimeout'
			},
			paginator:{
				deps:['backbone'],
				exports:'Backbone.Paginator'
			}
			
		},
		paths:{
			'jquery':'libs/jquery',
			'backbone':'libs/backbone',
			'underscore': 'libs/underscore',
			'marionette':'libs/backbone.marionette.min',
			'paginator':'libs/backbone.paginator.min',
			'relational':'libs/backbone-relational',
			'bootstrap':'libs/bootstrap.min',
			'timeout':'libs/jquery.ba-dotimeout',
			'app':'app',
			'tpl':'libs/tpl'
		}
		
});

require([
         'jquery',
         'underscore',
         'backbone',
         'marionette',
         'relational',
         'bootstrap',
         'app'
         ], function($, _, Backbone, Marionette, RelationalModel, Bootstrap, App){
	
	console.log('application initialized');
	App.start();
	
});
         
         
         
         