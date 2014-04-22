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
        <div class="hero-unit">
            <img src="static/img/potatoes.png" />
        </div>
        <div style="padding-left: 5%; width: 95%;">
            <div>
                Bonjour ${pageContext.request.userPrincipal.name}, vous &ecirc;tes connect&eacute;s depuis le ${date_connexion} &agrave; ${heure_connexion}.
            </div>
            <br />
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
        <div style="width: 98%;">
            <ul class="list-group">
              <li class="list-group-item">
                <span class="badge">${nbVoitures}</span>
                <a href="/voiture">Voitures</a>
              </li>
            </ul>
        </div>
        <div style="width: 98%;">
            <ul class="list-group">
              <li class="list-group-item">
                <span class="badge">${nbMotos}</span>
                <a href="/moto">Motos</a>
              </li>
            </ul>
        </div>
        <div style="width: 98%;">
            <ul class="list-group">
              <li class="list-group-item">
                <span class="badge">${nbBateaux}</span>
                <a href="/bateau">Bateaux</a>
              </li>
            </ul>
        </div>
	</body>
</html>

