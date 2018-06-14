var pageSize = 20;

Ext.define('journal.store.JournalStore', {
	extend : 'Ext.data.Store',
	alias : 'widget.journalStore',
	autoLoad : true,
	autoSync : true,// 需要同步
	model : 'journal.model.JournalModel',
	proxy : {
		url : server_context + '/manager/journal/.json',
		type : 'ajax',
		api : {
			read : server_context + '/manager/journal/.json',
			update : server_context + '/manager/journal/.json'
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