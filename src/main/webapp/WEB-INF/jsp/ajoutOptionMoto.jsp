<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
   	<head>
        <link href="/static/css/bootstrap.css" rel="stylesheet" type="text/css" />
        <link href="/static/css/garage.css" rel="stylesheet" type="text/css" />
        <script type="text/javascript" src="/static/js/jquery.js"></script>
        <script type="text/javascript" src="/static/js/bootstrap.js"></script>
    </head>

	<body>
	    <jsp:include page="include/footer.jsp" />
        <jsp:include page="include/navbar.jsp" />
        <br />
		<div class="container-fluid">
			<div id="fluidContainer" class="row-fluid">
			    <h1>Ajout d'une option</h1>
		        <br />
				<div id="container" class="span9">
					<div>
						<form:form action="/moto/ajoutOptionMoto" commandName="moto" method="post" class="form-horizontal">
							<br />
                            <div class="control-group">
                                <label  class="control-label" for="optionMoto">Option</label>
                                <div class="controls">
                                    <form:input id="optionMoto" path="options" cssErrorClass="error"/>
                                    <br />
                                    <form:errors path="options" cssClass="error"/>
                                </div>
                            </div>
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

