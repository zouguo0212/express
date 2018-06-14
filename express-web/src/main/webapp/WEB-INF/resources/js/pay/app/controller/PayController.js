Ext.define('pay.controller.PayController', {
	extend : 'Ext.app.Controller',
	alias : 'widget.payController',
	stores : [ 'PayStore' ],
	models : [ 'PayModel' ],
	views : [ 'PayGrid', 'PayEdit' ],
	init : function() {
		this.control({
			'payGrid' : {
				itemdblclick : this.editPay
			},
			'payEdit button[action=save]' : {
				click : this.updatePay
			}
		});
	},
	editPay : function(grid, record) {
		var view = Ext.widget('payEdit');
		view.down('form').loadRecord(record);
	},
	updatePay : function(button) {
		var win = button.up('window');
		form = win.down('form');
		record = form.getRecord();
		values = form.getValues();
		record.set(values);
		win.close();
	}
});
