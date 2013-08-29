define(["marionette"], function(Marionette){
	return Marionette.Layout.extend({
		template:"#rig-layout",
		regions:{
			rigsRegion:"#rigs-row"
		}
	});
});