Ext.define('journal.controller.journalController', {
    extend : 'Ext.app.Controller',
    alias : 'widget.journalController',
    stores : [ 'JournalStore' ],
    models : [ 'JournalModel' ],
    views : [ 'JournalGrid', 'JournalEdit' ],
    init : function() {
        this.control({
            'journalGrid' : {
                itemdblclick : this.editJournal
            },
            'journalEdit button[action=save]' : {
                click : this.updatejournal
            }
        });
    },
    editJournal : function(grid, record) {
        var view = Ext.widget('journalEdit');
        view.down('form').loadRecord(record);
    },
    updateJournal : function(button) {
        var win = button.up('window');
        form = win.down('form');
        record = form.getRecord();
        values = form.getValues();
        record.set(values);
        win.close();
    }
});
