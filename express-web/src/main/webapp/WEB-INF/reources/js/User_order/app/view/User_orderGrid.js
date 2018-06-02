var pageSize = 20;

var studentStore = Ext.create('user_order.store.User_orderStore');

Ext.define('user_order.view.User_orderGrid', {
	extend : 'Ext.grid.GridPanel',
	alias : 'widget.user_orderGrid',
	title : 'Express - 订单信息表',
	store : user_orderStore,
	columns : [ {
		text : 'Time',
		width : 50,
		sortable : true,
		dataIndex : 'time'
	}, {
		text : "快递单号",
		width : 120,
		sortable : true,
		dataIndex : 'express_number'
	}, {
		text : "姓名",
		width : 80,
		sortable : true,
		dataIndex : 'username'
	}, {
		text : "种类",
		width : 80,
		sortable : true,
		dataIndex : 'kind'
	}, {
		text : " 密码",
		width : 80,
		sortable : true,
		dataIndex : 'password'
	}, {
		text : "电子邮箱",
		width : 80,
		sortable : true,
		dataIndex : 'email'
	}, {
		text : "添加时间",
		width : 150,
		dataIndex : 'dateCreated',
		renderer : Ext.util.Format.dateRenderer('Y/m/d H:i:s'),
		sortable : true
	}, {
		text : "修改时间",
		width : 150,
		dataIndex : 'dateModified',
		renderer : Ext.util.Format.dateRenderer('Y/m/d H:i:s'),
		sortable : true
	} ],
	viewConfig : {
		columnsText : '列',
		sortAscText : '升序',
		sortDescText : '降序'
	},

	bbar : new Ext.PagingToolbar({
		pageSize : pageSize,// 每页显示的记录值
		store : user_orderStore,
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
