define(["marionette", "tpl!templates/rigitem.tmpl"], function(Marionette, RigItemTmpl){
	
	return Marionette.ItemView.extend({
		template:RigItemTmpl
	});
});