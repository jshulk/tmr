class UrlMappings {

	static mappings = {
		
		"/rigs"(controller:'rigs', parseRequest:true){
			action = [GET:"index", POST:"save", PUT:"update", DELETE:"delete"]
		}
		
		"/rigs"(controller:'books', parseRequest:true){
			action = [GET:"index", POST:"save", PUT:"update", DELETE:"delete"]
		}
		
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

		"/"(view:"/index")
		"500"(view:'/error')
	}
}
