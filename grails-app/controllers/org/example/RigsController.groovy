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
}
