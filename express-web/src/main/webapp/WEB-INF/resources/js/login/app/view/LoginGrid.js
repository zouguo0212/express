var pageSize = 20;

var loginStore = Ext.create('login.store.LoginStore');

Ext.define('login.view.LoginGrid', {
	extend : 'Ext.grid.GridPanel',
	alias : 'widget.loginGrid',
	title : 'Express - 用戶信息表',
	store : loginStore,
	columns : [ {
		text : 'ID',
		width : 50,
		sortable : true,
		dataIndex : 'id'
	}, {
		text : "用戶賬號",
		width : 120,
		sortable : true,
		dataIndex : 'userid'
	}, {
		text : "姓名",
		width : 80,
		sortable : true,
		dataIndex : 'username'
	}, {
		text : "性别",
		width : 80,
		sortable : true,
		dataIndex : 'sex'
	}, {
		xtype : 'textfield',
		name : 'password',
		fieldLabel : '密码'
	},{
		xtype : 'textfield',
		name : 'satisficing',
		fieldLabel : '满意度'
	},{
		xtype : 'textfield',
		name : 'passage',
		fieldLabel : '留言信息'
	} ],
	viewConfig : {
		columnsText : '列',
		sortAscText : '升序',
		sortDescText : '降序'
	},

	bbar : new Ext.PagingToolbar({
		pageSize : pageSize,// 每页显示的记录值
		store : loginStore,
		displayInfo : true,
		firstTest : '首页',
		lastText : '尾页',
		nextText : '下页',
		prevText : '前页',
		beforePageText : '第',
		afterPageText : '页，共{0}页',
		displayMsg : '记录数：第{0}条 - 第{1}条，共 {2}条',
		emptyMsg : "没有记录"
	})
});
