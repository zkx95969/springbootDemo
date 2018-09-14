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
</head>
<body>
<h1 id="tr"></h1><br/>
<a href="/redisDemo"><h1>redisDemo</h1></a><br/>
<img src="${base}/static/image/tree.jpg">
<br/>
</body>
<script>
    var base = document.getElementById("base").href;
    $.ajax({
        url : "/student/findAll",
        //data : {},
        dataType : 'json',
        type : 'post',
        success : function(data) {
            var _html = "";
            $.each(data,function(index,value){
                _html += value.name;
            });
            $("#tr").html(_html);
        },
        error : function(data) {
            alert(data);
        }
    });

</script>
</html>