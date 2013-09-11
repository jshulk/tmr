define(["backbone", "models/book"], function(Backbone, Book){
	return Backbone.Collection.extend({
		url:"/thazmyrigz/books",
		model:Book
	});
});