/**
 *
 */
$(document).ready(function() {
    requestPost();
});

function requestPost() {
    $.ajax({
        url : "/number",
        type : "GET",
        dataType : "json",
        success: setRandomBox,
        error : function(request, status, error){
            console.error("code:" + request.status + "\n"+"message:" + request.responseText + "\n"+"error:" + error);
        }
    })
}

function setRandomBox(value) {
    var $randomBox = $("#randomBox").text(value);
}