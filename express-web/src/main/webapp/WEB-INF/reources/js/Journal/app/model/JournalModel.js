Ext.define('journal.model.JournalModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.journalModel',
	fields : [ {
		name : 'ID',
		type : 'int',
		sortable : true
	}, {
		name : 'logId',
		type : 'string',
		sortable : true
	}, {
		name : 'userId',
		type : 'string',
		sortable : true
	}, {
		name : 'moduleName',
		type : 'string',
		sortable : true
	}, {
		name : 'operate',
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
	} ]
});