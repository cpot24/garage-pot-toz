<html>
    <head>
         <style type="text/css" title="currentStyle">
            @import "/static/css/demo_page.css";
            @import "/static/css/demo_table.css";
            @import "/static/css/bootstrap.css";
            @import "/static/css/garage.css";
            @import "/static/css/TableTools.css";
        </style>
        <script type="text/javascript" src="/static/js/jquery.js"></script>
        <script type="text/javascript" src="/static/js/jquery.dataTables.js"></script>
        <script type="text/javascript" src="/static/js/bootstrap.js"></script>
        <script type="text/javascript" charset="utf-8" src="/static/js/ZeroClipboard.js"></script>
        <script type="text/javascript" charset="utf-8" src="/static/js/TableTools.js"></script>

        <!-- Initialisation de la dataTable -->
        <script type="text/javascript" charset="utf-8">
            $(document).ready(function() {
                oTable = $('#listeVehicules').dataTable({
                    "sDom": 'T<"clear">lfrtip',
                    "oTableTools": {
                        "sSwfPath" : "/static/swf/copy_cvs_xls_pdf.swf",
                    },
                    "aaSorting": [[1,"asc"]],
                	"aoColumns": [
                	    { "sWidth" : "0%", "bVisible" : false},
                	    { "sWidth" : "10%"},
                	    { "sWidth" : "10%"},
                	    { "sWidth" : "10%"},
                	    { "sWidth" : "10%"},
                	    { "sWidth" : "10%"},
                	    { "sWidth" : "10%"},
                	    { "sWidth" : "10%"},
                	    { "sWidth" : "20%"},
                	    {
                	        "sWidth" : "10%",
                	        "bSortable": false,
                            "fnRender": function ( oObj ) {
                                var lien="<a href=\"/collaborateurMajMoto?id_moto="+oObj.aData[0]+"\"><img src=\"/static/img/detail.jpg\" width=\"15\" height=\"15\" /></a>";
                                var lien2="<a href=\"/responsableSuppressionMoto?id_moto="+oObj.aData[0]+"\"><img src=\"/static/img/remove.jpg\" width=\"15\" height=\"15\" /></a>";

                                return lien+lien2;
                            }
                	    }
                	],
                    "sAjaxSource": "/jsonListeMotos"
                });
            } );
        </script>
    </head>

	<body>
		<jsp:include page="include/footer.jsp" />
        <jsp:include page="include/navbar.jsp" />
		<div class="container-fluid">
		    <h1>Liste des motos</h1>
		    <br />
            <div id="container" class="full_width">
                <table cellpadding="0" cellspacing="0" border="0" class="display" id="listeVehicules">
                    <thead>
                        <tr>
                            <th>Id</th>
                            <th>Marque</th>
                            <th>Modele</th>
                            <th>Couleur</th>
                            <th>Puissance</th>
                            <th>Car&eacute;nage</th>
                            <th>type mod&egrave;le</th>
                            <th>Neuf</th>
                            <th>Options</th>
                            <th>Actions</th>
                        </tr>
                    </thead>
                </table>
			</div>
		</div>
	</body>
</html>

