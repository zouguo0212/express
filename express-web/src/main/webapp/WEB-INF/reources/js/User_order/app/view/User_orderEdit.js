Ext.define('user_order.view.User_orderEdit', {
	extend : 'Ext.window.Window',
	alias : 'widget.user_orderEdit',
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
				name : 'time',
				fieldLabel : '时间'
			}, {
				xtype : 'textfield',
				name : 'username',
				fieldLabel : '姓名'
			}, {
				xtype : 'textfield',
				name : 'express_number',
				fieldLabel : '订单号'
			}, {
				xtype : 'textfield',
				name : 'kind',
				fieldLabel : '类别'
			}, {
				xtype : 'textfield',
				name : 'emali',
				fieldLabel : '电子邮箱'
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
