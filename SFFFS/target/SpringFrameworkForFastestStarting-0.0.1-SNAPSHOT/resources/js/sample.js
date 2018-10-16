/**
 *
 */
$(document).ready(function() {
    requestGet();
    setCount(count)
});

var count = 0;

function requestGet() {
    setCount();
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

function requestPost() {
    setCount();
    $.ajax({
        url : "/postsample",
        type : "POST",
        dataType : "json",
        data : {header : "request", body : "count"},
        success: function(res) {
            setRandomBox(res.body);
            writeAry(res.log);
        },
        error : function(request, status, error){
            console.error("code:" + request.status + "\n"+"message:" + request.responseText + "\n"+"error:" + error);
        }
    });
}

function setRandomBox(value) {
    var $randomBox = $("#randomBox").text(value);
    writeLog(value)
}

function setCount() {
    $("#tryCount").text(count++);
}

function writeLog(log) {
    var $logBox = $("#logBox");
    var text = $logBox.text();
    if (text == "") {
        $logBox.text(log);
    } else {
        $logBox.text(text + ", " + log);
    }
}

function writeAry(log) {
    var $listBox = $("#listBox");
    var text = '';
    for (var loop in log) {
        if (text == "") {
            text += log[loop];
        } else {
            text += ", " + log[loop];
        }
    }
    $listBox.text(text);
}