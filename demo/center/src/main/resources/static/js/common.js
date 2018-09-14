function post(url,data,success,error){
    $.ajax({
        url:url,
        data:data,
        datatype:"json",
        type:"post",
        success:function(data){
            success(data);
        },
        error:function(data){
            error(data);
        }
    });
}