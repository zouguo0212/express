Ext.define('register.model.RegisterModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.registerModel',
	fields : [ {
		name : 'ID',
		type : 'int',
		sortable : true
	}, {
		name : 'username',
		type : 'string',
		sortable : true
	}, {
		name : 'sex',
		type : 'string',
		sortable : true
	}, {
		name : 'email',
		type : 'string',
		sortable : true
	}, {
		name : 'idnum',
		type : 'string',
		sortable : true
	}, {
		name : 'phone',
		type : 'string',
		sortable : true
	}, {
		name : 'dateCreated',
		type : 'date',
		dateFormat : 'time',
		sortable : true
	}, {
		name : 'dateModified',
		type : 'date',
		dateFormat : 'time',
		sortable : true
	}]
});