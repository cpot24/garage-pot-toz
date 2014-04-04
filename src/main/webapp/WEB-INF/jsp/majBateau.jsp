<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
	<head>
        <link href="<spring:url value='/static/css/bootstrap.css'/>" rel="stylesheet" type="text/css" />
        <link href="<spring:url value='/static/css/garage.css'/>" rel="stylesheet" type="text/css" />
        <script type="text/javascript" src="<spring:url value='/static/js/jquery.js'/>"></script>
        <script type="text/javascript" src="<spring:url value='/static/js/bootstrap.js'/>"></script>
	</head>

	<body>
	    <jsp:include page="include/footer.jsp" />
		<jsp:include page="include/navbar.jsp" />
		<br />
		<div class="container-fluid">
		    <h1>Mise &agrave; jour d'un bateau</h1>
		    <br />
			<div id="fluidContainer" class="row-fluid">
				<div id="container" class="span9">
					<div>
						<form:form action="/majSauvegardeBateau" commandName="bateau" method="post" class="form-horizontal">
						     <div class="control-group">
                                <label class="control-label" for="id">Id : </label>
                                <div class="controls">
                                   <form:input id="id" path="id" cssErrorClass="error" disabled="true"/>
                                   <form:input id="id" path="id" cssErrorClass="error" type="hidden"/>
                                </div>
                            </div>
							<jsp:include page="include/detail.jsp"/>
							<br />
							<br />
                            <jsp:include page="include/detailBateau.jsp"/>
                            <div class="control-group">
							    <div class="controls">
							        <input type="submit" value="Enregistrer" />
							    </div>
							</div>
						</form:form>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>

