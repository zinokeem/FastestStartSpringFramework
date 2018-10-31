/**
 *
 */
$("document").ready(function() {
    init();
});

function init() {
    M.AutoInit();
    $('.sidenav').sidenav();
    testService();
    eventHandler();
}

function eventHandler() {
    $("#close-btn").on("click", function() {
        $("#info").fadeOut("slow");
    });
}

function testGet() {
    $.ajax({
        url : "/testGet",
        type : "GET",
        success: function(res) {
            alert("Success : " + res);
            console.log(res);
        },
        error : function(request, status, error){
            alert("Fail");
            console.error("code:" + request.status + "\n"+"message:" + request.responseText + "\n"+"error:" + error);
        }
    });
}

function testPost() {
    $.ajax({
        url : "/testPost",
        type : "POST",
        dataType : "json",
        data : {text : "100"},
        success: function(res) {
            alert("Success : " + res.text);
            console.log(res);
        },
        error : function(request, status, error){
            alert("Fail");
            console.error("code:" + request.status + "\n"+"message:" + request.responseText + "\n"+"error:" + error);
        }
    });
}

function testService() {
    $.ajax({
        url : "/testService",
        type : "POST",
        dataType : "json",
        data : {text : "sample"},
        success: function(res) {
            //alert("Success : " + res[0]);
            console.log(res);
            drawData(res);
        },
        error : function(request, status, error){
            alert("Fail");
            console.error("code:" + request.status + "\n"+"message:" + request.responseText + "\n"+"error:" + error);
        }
    });
}

function drawData(objList) {
    var head = '';
    var body = '';

    if (objList[0] != undefined) {
        head += "<tr>";
        for (var propertyIndex in objList[0]) {
            if (propertyIndex != "text") {
                head += "<th>" + propertyIndex + "</th>";
            }
        }
        head += "</tr>";
    }

    for (var objIndex in objList) {
        var obj = objList[objIndex];
        body += "<tr>";
        for (var propertyIndex in obj) {
            var property = obj[propertyIndex];
            if (propertyIndex != "text") {
                if (propertyIndex.indexOf("Date") > -1) {
                    var date = new Date();
                    date.setTime(property);
                    var text = '';
                    text += date.getFullYear()+"/"
                    text += (date.getMonth()+1) + "/"
                    text += date.getDate()+" "
                    text += date.getHours()+":"
                    text += date.getMinutes();
                    body += "<td>" + text + "</td>";
                } else {
                    body += "<td>" + property + "</td>";
                }
            }
        }
        body += "</tr>";
    }
    $("#list").fadeOut("slow", function() {
        $("#list>tbody").empty().append(head + body);
        $("#list").fadeIn("fast");
    });
/*    $("#list>tbody").empty();
    $("#list>tbody").append(head + body);
    $("#list>tbody").fadeIn("slow");*/
    setTime();
}