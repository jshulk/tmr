define([
        "backbone",
        "relational",
        "models/RigComponent",
        "collections/RigCollection"
        ], function(Backbone, RelationalModel, RigComponent, RigCollection){
	var RigModel = RelationalModel.extend({
		relations:[{
			type: Backbone.HasMany,
			key:'comps',
			relatedModel:RigComponent,
			CollectionType:RigCollection,
			reverseRelation:{
				key:'rig',
				includeInJSON:'id'
			}
		}]
	});
	
	return RigModel;
});