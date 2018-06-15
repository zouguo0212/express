Ext.define('ujournal.controller.UJournalController', {
    extend : 'Ext.app.Controller',
    alias : 'widget.ujournalController',
    stores : [ 'UJournalStore' ],
    models : [ 'UJournalModel' ],
    views : [ 'UJournalGrid', 'UJournalEdit' ],
    init : function() {
        this.control({
            'ujournalGrid' : {
                itemdblclick : this.editUJournal
            },
            'ujournalEdit button[action=save]' : {
                click : this.updateUJournal
            }
        });
    },
    editUJournal : function(grid, record) {
        var view = Ext.widget('ujournalEdit');
        view.down('form').loadRecord(record);
    },
    updateUJournal : function(button) {
        var win = button.up('window');
        form = win.down('form');
        record = form.getRecord();
        values = form.getValues();
        record.set(values);
        win.close();
    }
});
