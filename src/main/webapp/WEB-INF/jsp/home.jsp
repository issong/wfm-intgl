<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ include file="/WEB-INF/jsp/include/taglib.jsf"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <%@ include file="/WEB-INF/jsp/include/meta.jsf"%>
    <%@ include file="/WEB-INF/jsp/include/style.jsf"%>
    <title>Main</title>
    <link rel="stylesheet" type="text/css" href="/wfm-intgl/ext-js/resources/css/ext-all.css">
    <style type="text/css" media="screen">
        .refreshButton {
            background-image: url(/wfm-intgl/ext-js/resources/themes/images/default/grid/refresh.gif) !important;
        }
        .processButton {
            background-image: url(/wfm-intgl/ext-js/resources/themes/images/default/grid/page-next.gif) !important;
        }
        .linkButton {
            background-image: url(/wfm-intgl/ext-js/resources/themes/images/default/grid/dd-insert-arrow-right.gif) !important;
        }
	</style>
    <script type="text/javascript" src="/wfm-intgl/ext-js/ext-all.js"></script>
    <script type="text/javascript" src="/wfm-intgl/ext-js/require.js"></script>
    <script type="text/javascript">

        Ext.Loader.setConfig({
            enabled: true,
            paths: {
                'Intgl.app': 'ext-js/app',
                'Ext.ux': 'ext-js/ux'
            }
        });

        Ext.require([
            'Ext.tab.*',
            'Ext.ux.TabCloseMenu',
            'Ext.data.*',
            'Ext.grid.*',
            'Ext.util.*',
            'Ext.toolbar.Paging',
            'Ext.tip.QuickTipManager',
            'Ext.ux.data.PagingMemoryProxy',
            'Ext.ux.SlidingPager',
            'Ext.form.*',
            'Ext.window.Window',
        ]);        

        Ext.tip.QuickTipManager.init();

        Ext.onReady(function() {
            
            if (!window.console) {
                window.console = { log: function() { } };
            }

            Ext.create('Intgl.app.Portal');
        });
    </script>
</head>

<body>
</body>
</html>
