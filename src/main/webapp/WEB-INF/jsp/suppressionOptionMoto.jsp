<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
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
		<div class="container-fluid">
		    <h1>Liste des options d'une moto</h1>
		    <br />
			<div id="fluidContainer" class="row-fluid">
				<div id="container" class="span9">
					<div>
                        <table class="table table-striped">
							<thead>
								<tr>
									<th>Titre</th>
									<th>Actions</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${choixOptions}" var="option" >
									<tr>
										<td>${option}</td>
										<td>
										    <a href="/adminSuppressionOptionMoto?id_option=${option}"><img src="<spring:url value='/static/img/remove.jpg'/>" width="15" height="15" />
										</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>

