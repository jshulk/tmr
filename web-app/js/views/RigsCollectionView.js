define([
        "marionette",
        "views/RigItemView"
        ], function(Marionette, RigItemView){
	
	return Marionette.CollectionView.extend({
		el:'#rigs-list',
		initialize: function(){
			//App.vent.on('scroll:bottom', this.fetchMore);
			var that = this;
			require(["app"], function(App){
				//App.vent.on('scroll:bottom', that.fetchMore);
				that.listenTo(App.vent, 'scroll:bottom', that.fetchMore);
			});
			
		},
		itemView:RigItemView,
		fetchMore: function(){
			console.log('fetchmore');
			this.collection.requestNextPage({update:true, remove:false});
		}
		
	});
	
});