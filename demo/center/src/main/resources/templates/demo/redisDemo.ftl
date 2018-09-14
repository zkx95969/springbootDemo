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
<div style="text-align: center;padding-top: 10%">
    <input type="text" id="key" placeholder="key"/><br/>
    <input type="text" id="value" placeholder="value"><br/>
    <input type="button" id="set" value="set"/>&nbsp;&nbsp;&nbsp;<input id="get" type="button" value="get"/><br/>&nbsp;&nbsp;&nbsp;<input id="remove" type="button" value="remove"/>
    <h1 id="result"></h1>
</div>

</body>
<script>
    //redis set
    $("#set").click(function(){
        $.ajax({
            url:"/redis/set",
            data:{
                key:$("#key").val(),
                value:$("#value").val()
            },
            datatype:"json",
            type:"post",
            success:function(data){
                $("#result").html("添加成功");
            },
            error:function(data){
                alert("请求失败，请重试");
            }
        });
    });
    //redis get
    $("#get").click(function(){
        $.ajax({
            url:"/redis/get",
            data:{
                key:$("#key").val()
            },
            datatype:"json",
            type:"post",
            success:function(data){
                if(data==null||data==""){
                    $("#result").html("无值");
                }else{
                    $("#result").html("取得值为:"+data);
                }

            },
            error:function(data){
                alert("请求失败，请重试");
            }
        });
    });
    //redis remove
    $("#remove").click(function(){
        $.ajax({
            url:"/redis/remove",
            data:{
                key:$("#key").val()
            },
            datatype:"json",
            type:"post",
            success:function(data){
                $("#result").html("删除成功");
            },
            error:function(data){
                alert("请求失败，请重试");
            }
        });
    });
</script>
</html>