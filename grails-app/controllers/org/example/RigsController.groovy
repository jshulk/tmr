package org.example

import grails.converters.JSON

class RigsController {

    def index() { 
		println  'params '+params
		int maxRecords = params.$top?params.int('$top'):5
		int offset = params.$skip?params.int('$skip'):0
		
		int total = Rig.count()
		int totalPages = Math.ceil(total/maxRecords)
		
		
		List rigs = Rig.list(max:maxRecords, offset:offset)
		
		Map resultMap = [results:rigs, totalPages:totalPages ]
		withFormat{
			html {return [rigs:rigs] }
			json {render resultMap as JSON}
		}
	}

	def bbPaginate(){
		
		println  'params '+params
		int maxRecords = params.perPage?params.int('perPage'):5
		int currentPage = params.currentPageNum?params.int('currentPageNum'):1
		int offset = (currentPage-1)*maxRecords
		int total = Movie.count()
		int totalPages = Math.ceil(total/maxRecords)
		
		
		List movies = Movie.list(max:maxRecords, offset:offset)
		
		Map resultMap = [results:movies, totalPages:totalPages, currentPageNum:currentPage, offset:offset, perPage:maxRecords ]
		withFormat{
			html {return [movies:movies] }
			json {render resultMap as JSON}
		
		
	}
}
	
	def testing(){
		
	}
	
}
