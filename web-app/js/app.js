define([
        'marionette', 'routers/index',
        'timeout',
        'views/layouts/RigLayout',
        'views/RigsCollectionView',
        "collections/RigCollection"
        ], function(Marionette, IndexRouter, doTimeout,  RigLayout, RigsCollectionView, RigCollection){
	
	var app = new Marionette.Application();
	
	
	//add regions
	app.addRegions({
		container:'.container'
	});
	
	app.addInitializer(function(options){
		
		
		$(window).scroll(function(){
			$.doTimeout( 'scroll', 200, function(){
				if( ( $(document).height() -200) < $(document).scrollTop() + $(window).height() ){
					app.vent.trigger('scroll:bottom');
				}

			});
								
		});	
		//create the router instance
		console.log('router initialized')
		var router = new IndexRouter();
		//and start backbone history tracking
		console.log('backbone history started');
		Backbone.history.start();
		
		var rigs = new RigCollection();
				
		var rigLayout = new RigLayout();
		
		app.container.show(rigLayout);
		
		rigLayout.rigsRegion.show(new RigsCollectionView({collection:rigs}));
		
		
		rigs.fetch({
			success: function(response){
				console.log('fetched');
				console.log(response);
				console.log(rigs.toJSON());
			}
		});
	});
	
	
	
	
	return app;
});