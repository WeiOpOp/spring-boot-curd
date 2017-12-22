<#assign base=request.contextPath>
<#macro head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">  
    <meta name="viewport" content="width=device-width, initial-scale=1"> 
    <link rel="shortcut icon" href="${base }/favicon.ico" type="image/x-icon">
	<script type="text/javascript" src="${base }/js/jquery-1.12.4.min.js"></script>
	<script type="text/javascript" src="${base }/js/my.js"></script>
	<link href="${base }/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
	<link href="${base }/datepicker/bootstrap-datetimepicker.min.css" rel="stylesheet" media="screen">
	<script src="${base }/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="${base }/datepicker/bootstrap-datetimepicker.js" charset="UTF-8"></script>
	<script type="text/javascript" src="${base }/datepicker/bootstrap-datetimepicker.zh-CN.js" charset="UTF-8"></script>
	<script src="${base }/layer/layer.js"></script>
	<script type="text/javascript">
		contextname='${base}';
	</script>
</#macro>