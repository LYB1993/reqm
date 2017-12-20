/**
 * 通用提交数据js文件
 * @author lyb
 * */
$("#btnItemsData").click(function (){
        $.ajax({
            url:"",
            type:'post',
            contentType: "application/json; charset=utf-8",
            data:JSON.stringify(GetJsonData()),
            dataType:'json',
            success:function(){

            },
            error:function(){

            }
        });
    });
function GetJsonData() {
    var json = {

    };
}