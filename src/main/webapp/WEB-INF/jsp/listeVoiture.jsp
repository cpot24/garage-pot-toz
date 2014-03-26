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
		    <h1>Liste des voitures</h1>
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
									<th>Nombre de roues</th>
									<th>Nombre de portes</th>
									<th>Neuf</th>
									<th>Options</th>
									<th>Actions</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${listeVoiture}" var="voiture" >
									<tr>

										<td>${voiture.marque}</td>
										<td>${voiture.modele}</td>
										<td>${voiture.couleur}</td>
										<td>${voiture.puissance}</td>
										<td>${voiture.nbRoues}</td>
										<td>${voiture.nbPortes}</td>
										<td>${voiture.neuf ? 'Neuf':'Occasion'}</td>
										<td>${voiture.options}</td>
										<td>
										    <a href="/garage/maj?id_voiture=${voiture.id}"><img src="<spring:url value='/static/img/detail.jpg'/>" width="15" height="15" /></a>
										    <a href="/garage/suppression?id_voiture=${voiture.id}"><img src="<spring:url value='/static/img/remove.jpg'/>" width="15" height="15" />
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
