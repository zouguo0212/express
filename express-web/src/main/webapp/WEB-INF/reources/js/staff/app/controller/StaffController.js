Ext.define('staff.controller.StaffController', {
	extend : 'Ext.app.Controller',
	alias : 'widget.StaffController',
	stores : [ 'StaffStore' ],
	models : [ 'StaffModel' ],
	views : [ 'StaffGrid', 'StaffEdit' ],
	init : function() {
		this.control({
			'StaffGrid' : {
				itemdblclick : this.editStaff
			},
			'StaffEdit button[action=save]' : {
				click : this.updateStaff
			}
		});
	},
	editStaff : function(grid, record) {
		var view = Ext.widget('StaffEdit');
		view.down('form').loadRecord(record);
	},
	updateStaff : function(button) {
		var win = button.up('window');
		form = win.down('form');
		record = form.getRecord();
		values = form.getValues();
		record.set(values);
		win.close();
	}
});
