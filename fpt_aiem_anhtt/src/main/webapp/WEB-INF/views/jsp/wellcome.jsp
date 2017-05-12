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
		<div style="text-align: center; width: 100%; margin-top: 20%">
			<h2>Wellcome to AIEM</h2>
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