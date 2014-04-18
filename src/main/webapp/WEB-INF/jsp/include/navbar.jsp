<html>
     <head>
        <style type="text/css" title="currentStyle">
             @import "/static/css/bootstrap.min.css";
             @import "/static/css/bootstrap.css";
             @import "/static/css/garage.css";
         </style>
        <script type="text/javascript" src="/static/js/jquery.js'"></script>
        <script type="text/javascript" src="/static/js/bootstrap.js"></script>
        <script type="text/javascript" src="/static/js/bootstrap.min.js"></script>
    </head>
    <div class="navbar navbar-inverse">
        <div class="container">
          <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
              <span class="sr-only">Toggle navigation</span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>
          </div>
          <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
              <li class="active"><a href="/">Accueil</a></li>
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">Voitures<b class="caret"></b></a>
                <ul class="dropdown-menu">
                    <li class="dropdown-header">Menu principal</li>
                    <li><a id="listeVoiture" href="/voiture">Liste des voitures</a></li>
                    <li><a id="creerVoiture" href="/responsablePrepareAjout">Ajouter une voiture</a></li>
                    <li class="divider"></li>
                    <li class="dropdown-header">Autres actions</li>
                    <li><a id="listeOptionsVoiture" href="/prepareSuppressionOption">Liste des options</a></li>
                    <li><a id="creerOptionsVoiture" href="/adminPrepareAjoutOption">Ajouter une option</a></li>
                </ul>
              </li>
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">Motos<b class="caret"></b></a>
                <ul class="dropdown-menu">
                    <li class="dropdown-header">Menu principal</li>
                    <li><a id="listeMoto" href="/moto">Liste des motos</a></li>
                    <li><a id="creerMoto" href="/responsablePrepareAjoutMoto">Ajouter une moto</a></li>
                    <li class="divider"></li>
                    <li class="dropdown-header">Ajouter une option</li>
                    <li><a id="listeOptionsMoto" href="/prepareSuppressionOptionMoto">Liste des options</a></li>
                    <li><a id="creerOptionsMoto" href="/adminPrepareAjoutOptionMoto">Ajouter une option</a></li>
                </ul>
              </li>
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">Bateaux<b class="caret"></b></a>
                <ul class="dropdown-menu">
                    <li class="dropdown-header">Menu principal</li>
                    <li><a id="listeBateau" href="/bateau">Liste des bateaux</a></li>
                    <li><a id="creerBateau" href="/responsablePrepareAjoutBateau">Ajouter une bateau</a></li>
                    <li class="divider"></li>
                    <li class="dropdown-header">Ajouter une option</li>
                    <li><a id="listeOptionsBateau" href="/prepareSuppressionOptionBateau">Liste des options</a></li>
                    <li><a id="creerOptionsBateau" href="/adminPrepareAjoutOptionBateau">Ajouter une option</a></li>
                </ul>
              </li>
            </ul>
          </div><!--/.nav-collapse -->
        </div>
    </div>
</html>
