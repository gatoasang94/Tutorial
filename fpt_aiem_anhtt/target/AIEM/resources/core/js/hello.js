var patt = /^[0-9]+$/;
function callToServer() {

	var dataCaptcha = {};
	var response = grecaptcha.getResponse();

	var data = {};
	$("#hide_layer").show();
	data.phoneNumber = $("#mobile").val()
	// var url = "http://101.99.18.217:8080/AIEM/checkCallAPI";
	var url = "http://localhost:8080/AIEM/checkCallAPI";
	$.ajax({
		type : "POST",
		url : url,
		data : JSON.stringify(data),
		success : function(data) {
			console.log(data);
			$("hide_layer").hide();
			// window.location.href = "http://101.99.18.217:8080/AIEM/wellcome";
			window.location.href = "http://localhost:8080/AIEM/wellcome";
		},
		contentType : "application/json"
	});
}

function order() {
	$("#validate_null").hide();
	$("#validate_format").hide();

	if ($("#mobile").val().length < 1) {
		$("#validate_null").show();
	} else {
		if (patt.test($("#mobile").val())) {
			callToServer();
		} else {
			$("#validate_format").show();
		}
	}
}
