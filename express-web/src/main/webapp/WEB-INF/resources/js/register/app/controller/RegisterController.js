Ext.define('register.controller.RegisterController', {
    extend : 'Ext.app.Controller',
    alias : 'widget.registerController',
    stores : [ 'RegisterStore' ],
    models : [ 'RegisterModel' ],
    views : [ 'RegisterGrid', 'RegisterEdit' ],
    init : function() {
        this.control({
            'registerGrid' : {
                itemdblclick : this.editRegister
            },
            'registerEdit button[action=save]' : {
                click : this.updateRegister
            }
        });
    },
    editRegister : function(grid, record) {
        var view = Ext.widget('registerEdit');
        view.down('form').loadRecord(record);
    },
    updateRegister : function(button) {
        var win = button.up('window');
        form = win.down('form');
        record = form.getRecord();
        values = form.getValues();
        record.set(values);
        win.close();
    }
});
