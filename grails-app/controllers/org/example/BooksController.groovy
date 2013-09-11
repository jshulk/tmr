package org.example

import grails.converters.JSON

class BooksController {

    def index() {
		
		def res = [ [title:'The dark knight', author:'christopher nolan'], 
				[title:'deception point', author:'dan brown']
			 ]
		
		render res as JSON
	}
}
