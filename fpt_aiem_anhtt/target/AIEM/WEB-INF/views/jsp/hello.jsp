<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Order saving call service</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<spring:url value="/resources/core/css/hello.css" var="coreCss" />
<link href="${coreCss}" rel="stylesheet" />
<script src="https://code.jquery.com/jquery-3.1.1.min.js"
	integrity="sha256-hVVnYaiADRTO2PzUGmuLJr8BLUSjGIZsDYGmIJLv2b8="
	crossorigin="anonymous"></script>
<script src='https://www.google.com/recaptcha/api.js'></script>
<spring:url value="/resources/core/images" var="images" />
<style type="text/css">
.fullscreen {
	top: 0;
	left: 0;
	bottom: 0;
	right: 0;
	overflow: auto;
}

.footer {
	position: absolute;
	right: 0;
	bottom: 0;
	left: 0;
	padding: 1rem;
	background-color: #efefef;
	text-align: center;
}
</style>
</head>
<body>
	<nav class="navbar navbar-inverse navbar-fixed-top"
		style="position: initial;">
		<div class="container">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">Order saving call service</a>
			</div>
		</div>
	</nav>
	<div class="fullscreen">
		<div class="fullscreen"
			style="background: rgba(0, 0, 0, .1); position: absolute; display: none;"
			id="hide_layer">
			<center>
				<img src="${images}/spin.gif" style="margin-top: 30%" />
			</center>
		</div>
		<div class="row"
			style="border: 1px solid rgba(0, 0, 0, 0.08); border-radius: 5px; width: 56%; margin: 0 auto; padding-bottom: 10px; max-width: 450px;">
			<div style="text-align: center;">
				<h1>AIEM</h1>
			</div>
			<div style="margin: 0px auto; color: #3C3C3C; width: 90%">
				<label style="font-size: 36px; font-family: monospace;">Member
					Login</label> <label style="font-size: 16px; font-family: monospace;">1.
					Please download Juiker APP, and complete the registration (limited
					juiker members)</label> <label
					style="font-size: 16px; font-family: monospace;">2. Enter
					the phone number and verification code login, you can open the
					Juiker Festival fee service. (Each mobile phone door number donated
					15 yuan, only once)</label>
			</div>

			<div style="width: 90%; margin: 0px auto;">
				<i style="display: none; color: red;" id="validate_null">Field
					is required</i> <i style="display: none; color: red;"
					id="validate_format">Format error</i> <input id=mobile type="text"
					class="form-control" style="margin-top: 15px; width: 304px;"
					placeholder="Please enter your phone number" required="required">
			</div>
			<div class="g-recaptcha"
				data-sitekey="6LcE9hEUAAAAAPb4htczvqJRA5mLsXxl8JORAl-2"
				style="width: 90%; margin: 0px auto; margin-top: 15px"></div>
			<div style="width: 90%; margin: 0px auto; margin-top: 15px">
				<input type="button" class="btn btn-success" value="Login"
					onclick="order()">
			</div>
		</div>
	</div>
	<div class="footer">
		Product of Five 9 coporation</strong>.
	</div>
	<spring:url value="/resources/core/js/hello.js" var="coreJs" />

	<script src="${coreJs}"></script>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>

</body>
</html>