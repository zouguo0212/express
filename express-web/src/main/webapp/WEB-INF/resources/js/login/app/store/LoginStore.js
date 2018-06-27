var pageSize = 20;

Ext.define('login.store.LoginStore', {
	extend : 'Ext.data.Store',
	alias : 'widget.LoginStore',
	autoLoad : true,
	autoSync : true,// 需要同步
	model : 'login.model.LoginModel',
	proxy : {
		url : server_context + '/houjie/login/.json',
		type : 'ajax',
		api : {
			read : server_context + '/houjie/login/.json',
			update : server_context + '/houjie/login/.json'
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