package org.example

class Rig {
	
	String desc
	String image
	int count
	String name
	Long id
	
    static constraints = {	
    }
	
	static hasMany = [comps:RigComponent]
}
