<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="utf-8">
	<title>KityMinder Editor - Powered By FEX</title>

	<link href="favicon.ico" type="image/x-icon" rel="shortcut icon">

	<!-- bower:css -->
	<link rel="stylesheet" href="../../ver/bower_components/bootstrap/dist/css/bootstrap.css" />
	<link rel="stylesheet" href="../../ver/bower_components/codemirror/lib/codemirror.css" />
	<link rel="stylesheet" href="../../ver/bower_components/hotbox/hotbox.css" />
	<link rel="stylesheet" href="../../ver/bower_components/kityminder-core/dist/kityminder.core.css" />
	<link rel="stylesheet" href="../../ver/bower_components/color-picker/dist/color-picker.min.css" />
	<!-- endbower -->

	<link rel="stylesheet" href="../../ver/css/kityminder.editor.min.css">

	<style>
		html, body {
			margin: 0;
			padding: 0;
			height: 100%;
			overflow: hidden;
		}
		h1.editor-title {
			background: #393F4F;
			color: white;
			margin: 0;
			height: 40px;
			font-size: 14px;
			line-height: 40px;
			font-family: 'Hiragino Sans GB', 'Arial', 'Microsoft Yahei';
			font-weight: normal;
			padding: 0 20px;
		}
		div.minder-editor-container {
			position: absolute;
			top: 40px;
			bottom: 0;
			left: 0;
			right: 0;
		}
		.diy {
    		height: 30px;
    		line-height: 30px;
    		margin-top: 5px;
    		float: right;
    		color: #333;
    		overflow: hidden;
    		position: relative;
		}
		.diy input {
   			position: absolute;
    		top: 0;
    		bottom: 0;
    		left: 0;
    		right: 0;
   			display: inline-block;
    		opacity: 0;
		}
	</style>
</head>
<body ng-app="kityminderDemo" ng-controller="MainController">
<h1 class="editor-title">KityMinder Editor - Powered By FEX
	<button class="diy">
    	导入
    	<input type="file" id="fileInput" />
	</button>

	<button class="diy">
  		导出
  		<input type="km" class="export" id="node_text1"/>
	</button>
</h1>
<kityminder-editor on-init="initEditor(editor, minder)"></kityminder-editor>
</body>

<!-- bower:js -->
<script src="../../ver/bower_components/jquery/dist/jquery.js"></script>
<script src="../../ver/bower_components/bootstrap/dist/js/bootstrap.js"></script>
<script src="../../ver/bower_components/angular/angular.js"></script>
<script src="../../ver/bower_components/angular-bootstrap/ui-bootstrap-tpls.js"></script>
<script src="../../ver/bower_components/codemirror/lib/codemirror.js"></script>
<script src="../../ver/bower_components/codemirror/mode/xml/xml.js"></script>
<script src="../../ver/bower_components/codemirror/mode/javascript/javascript.js"></script>
<script src="../../ver/bower_components/codemirror/mode/css/css.js"></script>
<script src="../../ver/bower_components/codemirror/mode/htmlmixed/htmlmixed.js"></script>
<script src="../../ver/bower_components/codemirror/mode/markdown/markdown.js"></script>
<script src="../../ver/bower_components/codemirror/addon/mode/overlay.js"></script>
<script src="../../ver/bower_components/codemirror/mode/gfm/gfm.js"></script>
<script src="../../ver/bower_components/angular-ui-codemirror/ui-codemirror.js"></script>
<script src="../../ver/bower_components/marked/lib/marked.js"></script>
<script src="../../ver/bower_components/kity/dist/kity.min.js"></script>
<script src="../../ver/bower_components/hotbox/hotbox.js"></script>
<script src="../../ver/bower_components/json-diff/json-diff.js"></script>
<script src="../../ver/bower_components/kityminder-core/dist/kityminder.core.min.js"></script>
<script src="../../ver/bower_components/color-picker/dist/color-picker.min.js"></script>
<!-- endbower -->

<script src="../../ver/js/kityminder.editor.min.js"></script>


<script>
	angular.module('kityminderDemo', ['kityminderEditor'])
			.config(function (configProvider) {
				configProvider.set('imageUpload', '../server/imageUpload.php');
			})
			.controller('MainController', function($scope) {
				$scope.initEditor = function(editor, minder) {
					window.editor = editor;
					window.minder = minder;
				};
			});
window.onload = function() {

    var fileInput = document.getElementById('fileInput');

    fileInput.addEventListener('change', function(e) {
        var file = fileInput.files[0],
                // textType = /(md|km)/,
                fileType = file.name.substr(file.name.lastIndexOf('.')+1);
        switch(fileType){
            case 'md':
                fileType = 'markdown';
                break;
            case 'km':
            case 'json':
                fileType = 'json';
                break;
            default:
                console.log("File not supported!");
                alert('只支持.km、.md、.json文件');
                return;
        }
        var reader = new FileReader();
        reader.onload = function(e) {
            var content = reader.result;
            editor.minder.importData(fileType, content).then(function(data){
                $(fileInput).val('');
            });
        }
        reader.readAsText(file);
    });
}

$().ready(function(){ 
	var fileType = 'json';
	var content = JSON.stringify(${jsonArray});
	
	editor.minder.importData(fileType, content).then(function(data){
			//$(fileInput).val('');
		});
}) 

// 导出
$(document).on('click', '.export', function(event) {
	event.preventDefault();
	//var type = $(this).data('type');
	var type= "km";
	var	exportType = "json";
	switch(type){
		case 'km':
			exportType = 'json';
			break;
		case 'md':
			exportType = 'markdown';
			break;
		default:
			exportType = type;
			break;
	}
	//exportType = "json";
	editor.minder.exportData(exportType).then(function(content){
		switch(exportType){
			case 'json':
				postMindMap(content);
				console.log($.parseJSON(content));
				break;
			default:
				console.log(content);
				break;
		}
//		var aLink = document.createElement('a'),
//				evt = document.createEvent("HTMLEvents"),
//				blob = new Blob([content]);
//
//		evt.initEvent("click", false, false);
//		aLink.download = $('#node_text1').text()+'.'+type;
//		aLink.href = URL.createObjectURL(blob);
//		aLink.dispatchEvent(evt);
	});
});

function postMindMap(content){
	$.ajax({
		url:'/checklist/newChecklist',
		type:'POST',
		data:{"mindMap":content},
		success:function(data){
			console.log("数据提交成功！");
		},
		error:function(data){
			console.log("数据保存失败！");
		}

	});
}
</script>

</html>