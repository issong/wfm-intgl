var menuStore = Ext.create('Ext.data.TreeStore', {
    root: {
        expanded: true,
        children: [
                    {text: "이벤트 모니터링", expanded: true, children: [
                        {text: "실시간 모니터링", expanded: true, children: [
                            {text: "실시간 현황판", id: "ID_101", url:"eventboard.html", leaf: true},
                            {text: "실시간 모니터링", id: "ID_102", url:"eventstatus.html", leaf: true},
                            {text: "360 INSTANCE TASK 조회", id: "ID_103", url:"applicationInstanceTask.html", leaf: true},
                            {text: "360 SESSION 조회", id: "ID_104", url:"session.html", leaf: true}
                            
                        ]}
                    ]},
                    {text: "이벤트 관리", expanded: true, children: [
                        {text: "이벤트로그 이력", expanded: true, children: [
                            {text: "이벤트로그 이력조회", id: "ID_201", url:"eventlog.html", leaf: true},
                            {text: "올레맵로그 이력조회", id: "ID_202", url:"ollehmaplog.html", leaf: true},
                            {text: "일배치로그 조회", id: "ID_203", url:"", leaf: true}
                        ]},
                        {text: "재처리 관리", expanded: true, children: [
                            {text: "재처리 관리", id: "ID_211", url:"eventreprocess.html", leaf: true}
                        ]}
                    ]},
                    {text: "시스템 관리", expanded: true, children: [
                        {text: "시스템 관리", expanded: true, children: [
                            {text: "시스템 모니터링", id: "ID_301", url:"eventstatus.html", leaf: true}
                            
                        ]}
                    ]},
                    {text: "데이터 관리", expanded: true, children: [
                        {text: "데이터 관리", expanded: true, children: [
                            {text: "매핑 데이터", id: "ID_401", url:"", leaf: true}
                            
                        ]}
                    ]}
        ]
    }
});

var winBatch;
var winMapping;
var views = [];
var baseAppPath = "/wfm-intgl/ext-js/app/";

Ext.define('Intgl.app.Portal', {
    extend: 'Ext.container.Viewport',

    initComponent: function() {
        var me = this;

        Ext.apply(me, {
            itemId: 'app-viewport',
            layout: {
                type: 'border',
                padding: '0 0 0 0'
            },
            items:[{
                region: 'north',
                itemId: 'app-header',
                xtype: 'box',
                height: 25,
                border: false,
                html: '<h1>Integration Layer Service</h1>'
            }, {
                region: 'west',
                itemId: 'app-navi',
                collapsible: true,
                title: 'Menu',
                width: 200,
                layout: 'fit',
                items: [{
                    xtype: 'treepanel',
                    title: false,
                    border: false,
                    width: '100%',
                    height: '100%',
                    store: menuStore,
                    rootVisible: false,
                    listeners: {
                        itemclick: {
                            fn: function(view, record, item, index, e) {
                                var selectedObj = record.raw;
                                if(!selectedObj.leaf) return;

                                if(record.raw.id == 'ID_301') {
                                    window.open("/wfm-intgl/monitoring");
                                }else if(record.raw.id == 'ID_203') {
                                    me.openPopBatch(record.raw);
                                }else if(record.raw.id == 'ID_401') {
                                    me.openPopMapping(record.raw);
                                }else{
                                    me.addTab(record.raw);
                                }
                                console.log(selectedObj.text);
                            }
                        }
                    }
                }]
            }, {
                region: 'center',
                xtype: 'tabpanel',
                id: 'app-main',
                enableTabScroll: true,
                defaults: {
                    autoScroll: true,
                    bodyPadding: 0
                },
                activeTab: 0
            }]

        });
        me.callParent(arguments);
    },

    addTab: function(value) {
        if (views.indexOf(value.id) != -1) {
            this.down('#app-main').setActiveTab(this.down('#app-main').down('panel[title="' + value.text + '"]'));
            return;
        }

        var tab = Ext.create('Ext.panel.Panel', {
            title: value.text,
            //autoScroll: true,
            layout: 'fit',
            deferredRender: false,
            loader: {
                url: baseAppPath + value.url,
                autoLoad: true,
                scripts: true,
                scope: this
            },
            closable: true,
            listeners: {
                added: function (component) {
                    views.push(value.id);
                },
                removed: function (component) {
                    views.splice(views.indexOf(value.id), 1);

                    console.log(component.title);
                    switch(component.title) {
                        case "실시간 현황판": 
                            Ext.TaskManager.stop(boardRefreshTask); 
                            console.log(component.title + " task stop");
                            break;
                        case "360 INSTANCE TASK 조회": 
                            Ext.TaskManager.stop(apprefreshTask); 
                            console.log(component.title + " task stop");
                            break;
                        case "실시간 모니터링": 
                            Ext.TaskManager.stop(refreshTask);
                            console.log(component.title + " task stop"); 
                            break;
                        default:
                            break;
                    }
                }
            }            
        });

        this.down('#app-main').add(tab);
        this.down('#app-main').setActiveTab(tab);
    },
    
    openPopBatch : function(value) {
        if (!winBatch) {
            winBatch = Ext.create('widget.window', {
                title: 'Day Break Batch Monitoring',
                closable: true,
                closeAction: 'hide',
                width: 800,
                minWidth: 500,
                height: 500,
                minHeight: 300,
                layout: {
                    type: 'border',
                    padding: 0
                },
                tbar: [{
                    xtype: 'datefield',
                    itemId: 'searchFromDt',
                    width: 95,
                    format: 'Y-m-d',
                    value: new Date()
                },
                Ext.create('Ext.Button',{
                    text: 'Refresh',
                    itemId: 'refreshAction',
                    listeners: {
                        click: function() {
                            searchAll(winBatch.down("#searchFromDt").getRawValue().replace(/-/g,''));
                        }
                    },
                    iconCls: 'refreshButton'
                })],
                items: [{
                    title: 'aa',
                    itemId: 'content-panel1',
                    region: 'west', // this is what makes this panel into a region within the containing layout
                    activeItem: 1,
                    autoScroll: true,
                    border: true,
                    width: '33%',
                    height: '100%',
                    weight: -100,
                    html: ''
                },{
                    title: 'bb',
                    itemId: 'content-panel2',
                    region: 'center', // this is what makes this panel into a region within the containing layout
                    activeItem: 1,
                    autoScroll: true,
                    border: true,
                    width: '33%',
                    height: '100%',
                    weight: -100,
                    html: ''
                },{
                    title: 'cc',
                    itemId: 'content-panel3',
                    region: 'east', // this is what makes this panel into a region within the containing layout
                    activeItem: 1,
                    autoScroll: true,
                    border: true,
                    width: '33%',
                    height: '100%',
                    weight: -100,
                    html: ''
                }]
            });
        }
        if (winBatch.isVisible()) {
            winBatch.hide(this, function() {
            });
        } else {
            winBatch.show(this, function() {
                searchAll(winBatch.down("#searchFromDt").getRawValue().replace(/-/g,''));
            });
        }
        
        var searchAll = function(date) {
            winBatch.down('#content-panel1').setTitle('daybreak.log.vs1.' + date);
            winBatch.down('#content-panel2').setTitle('daybreak.log.vs14b.' + date);
            winBatch.down('#content-panel3').setTitle('daybreak.log.vs14c.' + date);

            var store = Ext.create('Ext.data.Store', {
                fields: ['vs1', 'vs14b', 'vs14c'],
                proxy: {
                    type: 'ajax',
                    url: '/wfm-intgl/intgl/event/getDayBreak.json?date=' + date,
                    reader: {
                        type: 'json',
                        root: 'items'
                    }
                }
            });
            store.load(function(records, operation, success) {
                winBatch.down('#content-panel1').body.update(store.getAt(0).get("vs1"));
                winBatch.down('#content-panel2').body.update(store.getAt(0).get("vs14b"));
                winBatch.down('#content-panel3').body.update(store.getAt(0).get("vs14c"));
            });
        }
    },
    
    openPopMapping: function(value) {
        if (!winMapping) {
            winMapping = Ext.create('widget.window', {
                title: 'Input Reference Mapping Data Setting',
                closable: true,
                closeAction: 'hide',
                width: 300,
                minWidth: 300,
                height: 220,
                minHeight: 220,
                layout: {
                    type: 'border',
                    padding: 0
                },
                items: [Ext.create('Ext.form.Panel', {
                    renderTo: Ext.getBody(),
                    region: 'center',
                    border: 0,
                    bodyPadding: 10,
                    defaults: {
                        labelWidth: 100
                    },
                    items: [{
                        fieldLabel: 'VS Type',
                        xtype: 'textfield',
                        itemId: 'vsType',
                        readOnly: true
                    }, {
                        fieldLabel: 'DS Type',
                        xtype: 'combo',
                        itemId: 'dsType',
                        editable: false,
                        forceSelection: true,
                        queryMode: 'local',
                        displayField: 'name',
                        valueField: 'abbr',
                        store: {
                            fields: ['abbr', 'name'],
                            data: [
                                {'abbr':'1', 'name':'true(1)'},
                                {'abbr':'0', 'name':'false(0)'}
                            ]
                        }
                    }, {
                        fieldLabel: 'TS Type',
                        xtype: 'combo',
                        itemId: 'tsType',
                        editable: false,
                        forceSelection: true,
                        queryMode: 'local',
                        displayField: 'name',
                        valueField: 'abbr',
                        store: {
                            fields: ['abbr', 'name'],
                            data: [
                                {'abbr':'1', 'name':'true(1)'},
                                {'abbr':'0', 'name':'false(0)'}
                            ]
                        }
                    }, {
                        fieldLabel: 'IR Date',
                        xtype: 'datefield',
                        itemId: 'irDate',
                        format: 'Y-m-d'
                    }, {
                        fieldLabel: 'IR Time',
                        xtype: 'timefield',
                        itemId: 'irTime',
                        increment: 5,
                        format: 'H:i:s'
                    }],
                    buttons: [{
                        text: 'Submit',
                        formBind: true, //only enabled once the form is valid
                        disabled: true,
                        handler: function() {
                            Ext.Ajax.request({
                                url: '/wfm-intgl/intgl/event/updateInputReference.json',
                                method: 'GET',
                                params: {
                                    vsType: winMapping.down('#vsType').getValue(),
                                    dsType: winMapping.down('#dsType').getValue(),
                                    tsType: winMapping.down('#tsType').getValue(),
                                    irDate: winMapping.down('#irDate').getRawValue(),
                                    irTime: winMapping.down('#irTime').getRawValue()
                                },
                                success: function(response, opts) {
                                    var obj = Ext.decode(response.responseText);
                                    if (obj.items.result) {
                                        alert('SUCCESS!!');
                                        winMapping.hide(winMapping, function() {
                                        });
                                    } else {
                                        alert('ERROR!!');
                                    }
                                },
                                failure: function(response, opts) {
                                    alert('ERROR!!');
                                }
                            });
                        }
                    }, {
                        text: 'Cancel',
                        handler: function() {
                            this.up('form').getForm().reset();
                            winMapping.hide(this, function() {
                            });
                        }
                    }]
                })]
            });
        }
        if (winMapping.isVisible()) {
            winMapping.hide(this, function() {
            });
        } else {
            winMapping.show(this, function() {
                var store = Ext.create('Ext.data.Store', {
                    fields: ['vsType', 'dsType', 'tsType', 'irDate', 'irTime'],
                    proxy: {
                        type: 'ajax',
                        url: '/wfm-intgl/intgl/event/getInputReference.json',
                        reader: {
                            type: 'json',
                            root: 'items'
                        }
                    }
                });
                store.load(function(records, operation, success) {
                    winMapping.down('#vsType').setValue(store.getAt(0).get("vsType"));
                    winMapping.down('#dsType').setValue(store.getAt(0).get("dsType"));
                    winMapping.down('#tsType').setValue(store.getAt(0).get("tsType"));
                    winMapping.down('#irDate').setValue(store.getAt(0).get("irDate"));
                    winMapping.down('#irTime').setValue(store.getAt(0).get("irTime"));
                });
            });
        }
    }
});
