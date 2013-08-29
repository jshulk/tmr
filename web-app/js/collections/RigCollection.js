define(["paginator", "models/RigModel"], function(Paginator, RigModel){
	return Paginator.requestPager.extend({
		model:RigModel,
		paginator_core:{
			url:"rigs",
			type:'GET',
		    dataType:'json'
		},
		paginator_ui:{
			firstPage:0,
			currentPage:0,
			perPage:6,
			totalPages:10
		},
		server_api:{
			//the query field in the request
			'$filter':'',
			//number of items to return per request/page
			'$top': function(){
				return this.perPage;
			},
			//how many results the request should skip ahead
			'$skip': function(){
				return this.currentPage*this.perPage;
			},
			'$format':'json',
			
			
		},
		parse: function(response){
			console.log('parse called');
			console.log(response.results);
			var rigs = response.results;
			this.totalPages = response.totalPages;
			return rigs;
		}
		
	});
});