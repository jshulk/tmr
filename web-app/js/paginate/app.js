define([
        'backbone',
        'views/MovieCollectionView',
        'collections/MovieCollection'
        ], function(Backbone, MovieCollectionView, MovieCollection){
	return {
		initialize: function(){
			var movies = new MovieCollection();
			this.parentView = new MovieCollectionView({collection:movies});
			//send the max, offset parameters with the fetch
			movies.fetch({reset:true});
		}
	};
});