var pageSize = 20;

Ext.define('register.store.RegisterStore', {
	extend : 'Ext.data.Store',
	alias : 'widget.RegisterStore',
	autoLoad : true,
	autoSync : true,// 需要同步
	model : 'register.model.RegisterModel',
	proxy : {
		url : server_context + '/fangye/register/.json',
		type : 'ajax',
		api : {
			read : server_context + '/fangye/register/.json',
			update : server_context + '/fangye/register/.json'
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