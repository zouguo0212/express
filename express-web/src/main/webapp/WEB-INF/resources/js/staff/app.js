Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'staff',
	appFolder : server_context + '/resources/js/staff/app',
	controllers : [ 'StaffController' ],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'staffGrid'
			} ]
		});
	}
});
