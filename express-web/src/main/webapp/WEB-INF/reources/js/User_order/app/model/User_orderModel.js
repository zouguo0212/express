Ext.define('user_order.model.User_orderModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.user_orderModel',
	fields :  [{
		name : 'id',
		type : 'int',
		sortable : true
	},{
		name : 'username',
		type : 'string',
		sortable : true
	}, {
		name : 'time',
		type : 'string',
		sortable : true
	}, {
		name : 'password',
		type : 'string',
		sortable : true
	}, {
		name : 'kind',
		type : 'string',
		sortable : true
	}, {
		name : 'express_number',
		type : 'string',
		sortable : true
	}, {
		name : 'email',
		type : 'string',
		sortable : true
	},{
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