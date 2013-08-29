package org.example

class RigComponent {
	Long id
	String name
	String image_url
	
    static constraints = {
    }
	
	static belongsTo = [rig:Rig]
}
