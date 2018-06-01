Ext.define('finance.view.FinanceEdit', {
	extend : 'Ext.window.Window',
	alias : 'widget.financeEdit',
	title : '编辑财务信息',
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
				name : 'idnum',
				fieldLabel : '工号'
			}, {
				xtype : 'textfield',
				name : 'name',
				fieldLabel : '姓名'
			}, {
				xtype : 'textfield',
				name : 'sex',
				fieldLabel : '性别'
			}, {
				xtype : 'textfield',
				name : 'age',
				fieldLabel : '年龄'
			}, {
				xtype : 'textfield',
				name : 'money',
				fieldLabel : '金额'
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
