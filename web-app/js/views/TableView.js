define(["backbone", "tpl!templates/movies.tmpl"], function(Backbone, moviesTemplate){

	return Backbone.View.extend({
		el: "#movies-table",
		initialize: function(){
			this.listenTo(this.collection, "reset", this.render);
		},
		render: function(){
			this.$el.html( moviesTemplate( {movies:this.collection.toJSON()} ));
		}
	});
});