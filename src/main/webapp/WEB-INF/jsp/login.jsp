<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="fr">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Garage Pot & Toz</title>

    <link href="/static/css/bootstrap.min.css" rel="stylesheet">
    <link href="/static/css/signin.css" rel="stylesheet">

  </head>
  <body>
    <div id="global" class="container">
      <form id="id_form" name="name_form" class="form-signin" role="form" action="j_spring_security_check" method="post" autocomplete="on">
        <h2 class="form-signin-heading">Acc&egrave;s s&eacute;curis&eacute; au garage</h2>
        <h3>Cette page est s&eacute;curis&eacute;e.<br />Les donn&eacute;est que vous allez saisir sont crypt&eacute;es<br />et ne peuvent pass &ecirc;tre "lues" par des tiers.</h3>
        <input type="username" name="username" class="form-control" placeholder="Identifiant" required autofocus>
        <input type="password" name="password" class="form-control" placeholder="Mot de passe" required>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Connexion</button>
      </form>
    </div>
    <div id="messages">
      <c:if test="${not empty error}">
          <div class="error">${error}</div>
      </c:if>
      <c:if test="${not empty msg}">
          <div class="msg">${msg}</div>
      </c:if>
    </div>
  </body>
</html>
