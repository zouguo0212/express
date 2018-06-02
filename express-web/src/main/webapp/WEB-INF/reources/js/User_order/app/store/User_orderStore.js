var pageSize = 20;

Ext.define('user_order.store.User_orderStore', {
	extend : 'Ext.data.Store',
	alias : 'widget.user_orderStore',
	autoLoad : true,
	autoSync : true,// 需要同步
	model : 'user_order.model.User_orderModel',
	proxy : {
		url : server_context + '/user_order/.json',
		type : 'ajax',
		api : {
			read : server_context + '/user_order/.json',
			update : server_context + '/user_order/.json'
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