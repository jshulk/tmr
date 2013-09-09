define(["backbone"], function(Backbone){

	return Backbone.Model.extend({
		defaults: {
			"rank" : "",
			"rating" :"",
			"title" : "",
			"votes" : ""
		}
	});

});