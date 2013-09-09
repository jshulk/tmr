define([
		"backbone",
		"models/Movie"
		], function(Backbone, Movie){
	return Backbone.Collection.extend({
		url: "/thazmyrigz/rigs/bbPaginate",
		model: Movie,
		parse: function(response){
			
			this.currentPage = response.currentPageNum;
			this.perPage = response.perPage;
			this.offset = response.offset;
			this.totalPages = response.totalPages;

			return response.results;
		}
	});
});