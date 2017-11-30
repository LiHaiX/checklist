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
	<!-- endbower -->

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
	</style>
</head>
<body>
<h1 class="editor-title">KityMinder Editor - Powered By FEX </h1>
<div class="container-fluid">
	<div class="row-fluid row">
        <div class="col-xs-6 col-md-4">
            <!--Body content-->
            <div class="panel-group" id="accordion" role="tablist" aria-multiselectable="true">
                <div class="panel panel-default">
                    <div class="panel-heading" role="tab" id="headingOne">
                        <h4 class="panel-title">
                            <a data-toggle="collapse" data-parent="#accordion" href="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
                                链家金融事业部 #1
                            </a>
                        </h4>
                    </div>
                    <div id="collapseOne" class="panel-collapse collapse in" role="tabpanel" aria-labelledby="headingOne">
                        <div class="panel-body">
                            <ul class="nav nav-pills nav-stacked" role="tablist">
                                <li role="presentation" ><a data-toggle="collapse" href="#collapseOneContent" aria-expanded="true" aria-controls="collapseOne">金融创新团队</a></li>
                                <li role="presentation"><a href="#">财务管理团队</a></li>
                                <li role="presentation"><a href="#">房产咨询业务</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
                <div class="panel panel-default">
                    <div class="panel-heading" role="tab" id="headingTwo">
                        <h4 class="panel-title">
                            <a class="collapsed" data-toggle="collapse" data-parent="#accordion" href="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
                                链家金融事业部 #1
                            </a>
                        </h4>
                    </div>
                    <div id="collapseTwo" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingTwo">
                        <div class="panel-body">
                            <button type="button" class="btn btn-danger">
                                交易组
                            </button>
                        </div>
                    </div>
                </div>
                <div class="panel panel-default">
                    <div class="panel-heading" role="tab" id="headingThree">
                        <h4 class="panel-title">
                            <a class="collapsed" data-toggle="collapse" data-parent="#accordion" href="#collapseThree" aria-expanded="false" aria-controls="collapseThree">
                                链家金融事业部 #3
                            </a>
                        </h4>
                    </div>
                    <div id="collapseThree" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingThree">
                        <div class="panel-body">
                            <button type="button" class="btn btn-danger" data-toggle="collapse" data-target="#demo" aria-expanded="true" aria-controls="demo">
                                交易组
                            </button>

                            <div id="demo">
                                <div id="demo1" class="collapse in">金融团队</div>
                                <div id="demo2" class="collapse in">交易核心</div>
                                <div id="demo3" class="collapse in">财务审核</div>
                                <div id="demo4" class="collapse in">deb</div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

        </div>
        <div class="col-xs-12 col-md-8">
            <div id="collapseOneContent">
                col-xs-12 col-md-8
            </div>
			<!--Sidebar content-->
		</div>
	</div>
</div>
</body>

<!-- bower:js -->
<script src="../../ver/bower_components/jquery/dist/jquery.js"></script>
<script src="../../ver/bower_components/bootstrap/dist/js/bootstrap.js"></script>

<!-- endbower -->

<script>
//    $('.collapse').collapse();
</script>



<script>

</script>

</html>