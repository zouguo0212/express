Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'user_order',
	appFolder : server_context + '/resources/js/user_order/app',
	controllers : [ 'User_orderController' ],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'user_orderGrid'
			} ]
		});
	}
});
