Ext.define('Register.view.RegisterEdit', {
	extend : 'Ext.window.Window',
	alias : 'widget.RegisterEdit',
	title : '编辑订单信息',
	layout : 'fit',
	autoShow : true,
	initComponent : function() {
		this.items = [ {
			xtype : 'form',
			height : 300,
			width : 300,
			border : false,
			items : [ {
				xtype : 'textfield',
				name : 'id',
				fieldLabel : 'ID'
			}, {
				xtype : 'textfield',
				name : 'username',
				fieldLabel : 'username'
			}, {
				xtype : 'textfield',
				name : 'sex',
				fieldLabel : 'sex'
			}, {
				xtype : 'textfield',
				name : 'idnum',
				fieldLabel : 'idnum'
			}, {
				xtype : 'textfield',
				name : 'phone',
				fieldLabel : 'phone'
			}, {
				xtype : 'textfield',
				name : 'email',
				fieldLabel : 'email'
			}]
		} ];
		this.buttons = [ {
			text : '保存',
			action : 'save'
		}, {
			text : '取消',
			scope : this,
			handler : this.close
		} ];
		this.callParent(arguments);
	}
});
