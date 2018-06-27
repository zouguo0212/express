var pageSize = 20;

Ext.define('myUserorder.store.MyUserorderStore', {
    extend : 'Ext.data.Store',
    alias : 'widget.myUserorderStore',
    autoLoad : true,
    autoSync : true,// 需要同步
    model : 'myUserorder.model.MyUserorderModel',
    proxy : {
        url : server_context + '/Ymz/myUserorder/.json',
        type : 'ajax',
        api : {
            read : server_context + '/Ymz/myUserorder/.json',
            update : server_context + '/Ymz/myUserorder/.json'
        },
        reader : {
            type : 'json',
            root : 'content',
            totalProperty : 'totalElements'
        },
        writer : {
            type : 'json'
        }
    },
    // 每页显示的记录行数
    pageSize : pageSize
});