Ext.define('myUserorder.controller.MyUserorderController', {
    extend : 'Ext.app.Controller',
    alias : 'widget.myUserorderController',
    stores : [ 'MyUserorderStore' ],
    models : [ 'MyUserorderModel' ],
    views : [ 'MyUserorderGrid', 'MyUserorderEdit' ],
    init : function() {
        this.control({
            'myUserorderGrid' : {
                itemdblclick : this.editMyUserorder
            },
            'myUserorderEdit button[action=save]' : {
                click : this.updateMyUserorder
            }
        });
    },
    editUserorder : function(grid, record) {
        var view = Ext.widget('myUserorderEdit');
        view.down('form').loadRecord(record);
    },
    updateUserorder : function(button) {
        var win = button.up('window');
        form = win.down('form');
        record = form.getRecord();
        values = form.getValues();
        record.set(values);
        win.close();
    }
});
