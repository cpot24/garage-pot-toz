<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<fieldset>
        <div class="control-group">
            <div class="controls">
                <form:input id="type" path="type" type="hidden" cssErrorClass="error"/>
            </div>
        </div>

        <div class="control-group">
            <label  class="control-label" for="marque">Marque</label>
            <div class="controls">
                <form:input id="marque" path="marque" cssErrorClass="error"/>
                <br />
                <br />
                <form:errors path="marque" class="alert alert-danger"/>
            </div>
        </div>
        <div class="control-group">
            <label  class="control-label" for="modele">Mod&egrave;le</label>
            <div class="controls">
                <form:input id="modele" path="modele" cssErrorClass="error"/>
                <br />
                <br />
                <form:errors path="modele" class="alert alert-danger"/>
            </div>
        </div>
		<div class="control-group">
			<label  class="control-label" for="couleur">Couleur</label>
			<div class="controls">
				<form:input id="couleur" path="couleur" cssErrorClass="error"/>
				<br />
				<br />
                <form:errors path="couleur" class="alert alert-danger"/>
			</div>
		</div>
		
		<div class="control-group">
			<label  class="control-label" for="puissance">Puissance</label>
			<div class="controls">
				<form:input id="puissance" path="puissance" cssErrorClass="error"/>
				<br />
				<br />
                <form:errors path="puissance" class="alert alert-danger"/>
			</div>
		</div>
		
		<div class="control-group">
			<label  class="control-label" for="neuf">Neuf</label>
			<div class="controls">
				<form:checkbox id="neuf" path="neuf" cssErrorClass="error"/>
			</div>
		</div>
		
		<div class="control-group2">
			<label  class="control-label" >Options</label>
			<div class="controls">
				<form:select path="options" items="${choixOptions}"/>
			</div>
		</div>								
</fieldset>