<#assign base=request.contextPath />
<!DOCTYPE>
<html>
<head>
    <base id="base" href="${base}">
    <title>首页</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="${base}/static/css/bootstrap/bootstrap.min.css" rel="stylesheet">
    <script src="${base}/static/js/bootstrap/bootstrap.min.js"></script>
    <script src="${base}/static/js/jquery/jquery-1.8.2.min.js"></script>
    <script src="${base}/static/js/common.js"></script>
</head>
<body>
<h1 id="tr"></h1><br/>
<a href="/redisDemo"><h1>跳转redisDemo</h1></a><br/>
<img src="${base}/static/image/demo/tree.jpg">
<br/>
</body>
<script>
    var base = document.getElementById("base").href;
    var data = {};
    post("/student/findAll",data,function(data){
        var _html = "";
        $.each(data,function(index,value){
            _html += value.name;
        });
        $("#tr").html(_html);
    })


</script>
</html>