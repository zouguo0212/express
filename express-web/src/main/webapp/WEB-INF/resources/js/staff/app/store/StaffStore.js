var pageSize = 20;

Ext.define('staff.store.StaffStore', {
	extend : 'Ext.data.Store',
	alias : 'widget.staffStore',
	autoLoad : true,
	autoSync : true,// 需要同步
	model : 'staff.model.StaffModel',
	proxy : {
		url : server_context + '/staff/staff/.json',
		type : 'ajax',
		api : {
			read : server_context + '/staff/staff/.json',
			update : server_context + '/staff/staff/.json'
		},
		reader : {
			type : 'json',
			root : 'content',
			totalProperty : 'totalElements'
		},
		writer : {
			type : 'json'
		}
	},
	// 每页显示的记录行数
	pageSize : pageSize
});