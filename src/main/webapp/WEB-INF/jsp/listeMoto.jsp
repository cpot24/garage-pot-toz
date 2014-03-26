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
		    <h1>Liste des motos</h1>
		    <br />
			<div id="fluidContainer" class="row-fluid">
				<div id="container" class="span9">
					<div>
                        <table class="table table-striped">
							<thead>
								<tr>
									<th>Marque</th>
									<th>Modele</th>
									<th>Couleur</th>
									<th>Puissance</th>
									<th>Car&eacute;nage</th>
									<th>Type de mod&egrave;le</th>
									<th>Neuf</th>
									<th>Options</th>
									<th>Actions</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${listeMoto}" var="moto" >
									<tr>

										<td>${moto.marque}</td>
										<td>${moto.modele}</td>
										<td>${moto.couleur}</td>
										<td>${moto.puissance}</td>
										<td>${moto.carenage ? 'Car&eacute;n&eacute;e':'Non car&eacute;n&eacute;e'}</td>
										<td>${moto.typeModele}</td>
										<td>${moto.neuf ? 'Neuf':'Occasion'}</td>
										<td>${moto.options}</td>
										<td>
										    <a href="/garage/majMoto?id_moto=${moto.id}"><img src="<spring:url value='/static/img/detail.jpg'/>" width="15" height="15" /></a>
										    <a href="/garage/suppressionMoto?id_moto=${moto.id}"><img src="<spring:url value='/static/img/remove.jpg'/>" width="15" height="15" />
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

