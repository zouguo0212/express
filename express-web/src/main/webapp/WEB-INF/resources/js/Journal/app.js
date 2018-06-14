Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'Journal',
	appFolder : server_context + '/resources/js/Journal/app',
	controllers : [ 'JournalController' ],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'journalGrid'
			} ]
		});
	}
});
