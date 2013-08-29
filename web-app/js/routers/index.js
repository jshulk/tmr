define([
        "underscore",
        "jquery",
        "backbone",
        "marionette"
        ], function(_, $, Backbone, Marionette, RigCollection){
	
	var indexRouter = Marionette.AppRouter.extend({
		
		routes:{
			"":"showRigs"
		},
		
		showRigs: function(){
			console.log('show rigs called');
			

		}
		
	});
	
	return indexRouter;
	
});