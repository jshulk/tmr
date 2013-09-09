define([
		"backbone", 
		"views/TableView", 
		"views/PaginationView"], 

	function(Backbone, TableView, PaginationView){

	return Backbone.View.extend({
		el: "#movies",
		initialize: function(){
			this.tableView = new TableView({collection:this.collection});
			this.paginationView = new PaginationView(
				{
					collection : this.collection,
					parentView : this,
					containerID : "movies-table"
				});
		}

	});
});