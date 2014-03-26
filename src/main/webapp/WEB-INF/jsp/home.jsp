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
        <div class="hero-unit">
            <img src="static/img/potatoes.png" />
        </div>
        <div style="padding-left: 5%; width: 30%;">
            <div class="panel panel-primary">
                <div class="panel-heading">
                    ${nomGarage}
                </div>
                <div class="panel-body">
                    ${adresse1Garage}
                    <br />
                    ${adresse2Garage}
                    <br />
                    ${telephoneGarage}
                </div>
            </div>
        </div>
        <div style="width: 50%;">
            <ul class="list-group">
              <li class="list-group-item">
                <span class="badge">${nbVoitures}</span>
                <a href="/garage/voiture">Voitures</a>
              </li>
            </ul>
        </div>
        <div style="width: 50%;">
            <ul class="list-group">
              <li class="list-group-item">
                <span class="badge">${nbMotos}</span>
                <a href="/garage/moto">Motos</a>
              </li>
            </ul>
        </div>
        <div style="width: 50%;">
            <ul class="list-group">
              <li class="list-group-item">
                <span class="badge">${nbBateaux}</span>
                <a href="#">Bateaux</a>
              </li>
            </ul>
        </div>
        <div style="width: 50%;">
            <ul class="list-group">
              <li class="list-group-item">
                <span class="badge">${nbAvions}</span>
                <a href="#">Avions</a>
              </li>
            </ul>
        </div>
	</body>
</html>

