Ext.Loader.setConfig({
    enabled : true
});
Ext.application({
    name : 'myUserorder',
    appFolder : server_context + '/resources/js/myUserorder/app',
    controllers : [ 'MyUserorderController' ],
    launch : function() {
        Ext.create('Ext.container.Viewport', {
            layout : 'fit',
            items : [ {
                xtype : 'myUserorderGrid'
            } ]
        });
    }
});