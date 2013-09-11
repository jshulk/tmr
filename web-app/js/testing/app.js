define([
        "jquery",
        "backbone", 
        "collections/BookCollection", 
        "collections/MovieCollection"
        ], function($, Backbone, BookCollection, MovieCollection){
	return {
		initialize: function(){
			var  movies = new MovieCollection();
			var books = new BookCollection();
			
			var fetchReturn = movies.fetch()
							 .then(function(){
								 books.fetch();
							 });
			
			console.log(fetchReturn);
			/*$.when(movies.fetch(), books.fetch()).done(function(){
				console.log('both requests completed');
			});*/
		}
	};
});