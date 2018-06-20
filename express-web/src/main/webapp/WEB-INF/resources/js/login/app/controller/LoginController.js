Ext.define('login.controller.LoginController', {
	extend : 'Ext.app.Controller',
	alias : 'widget.LoginController',
	stores : [ 'LoginStore' ],
	models : [ 'LoginModel' ],
	views : [ 'LoginGrid', 'LoginEdit' ],
	init : function() {
		this.control({
			'loginGrid' : {
				itemdblclick : this.editLogin
			},
			'loginEdit button[action=save]' : {
				click : this.updateLogin
			}
		});
	},
	editLogin : function(grid, record) {
		var view = Ext.widget('loginEdit');
		view.down('form').loadRecord(record);
	},
	updateLogin : function(button) {
		var win = button.up('window');
		form = win.down('form');
		record = form.getRecord();
		values = form.getValues();
		record.set(values);
		win.close();
	}
});
