Ext.Loader.setConfig({
    enabled : true
});
Ext.application({
    name : 'register',
    appFolder : server_context + '/resources/js/register/app',
    controllers : [ 'RegisterController' ],
    launch : function() {
        Ext.create('Ext.container.Viewport', {
            layout : 'fit',
            items : [ {
                xtype : 'registerGrid'
            } ]
        });
    }
});