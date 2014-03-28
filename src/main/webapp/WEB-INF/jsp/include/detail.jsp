<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<fieldset>
        <div class="control-group">
            <div class="controls">
                <form:input id="type" path="type" type="hidden" cssErrorClass="error"/>
            </div>
        </div>
		<div class="control-group">
            <label  class="control-label" for="marque">Marque : </label>
            <div class="controls">
                <form:select path="marque" items="${choixMarques}" var="marques"/>
                <br />
                <c:forEach var="modele" items="${requestScope['choixMarques']}">
                    <select id="${modele.libelle}" path="modele" value="${model.libelle}"/>
                </c:forEach>
                <br />
                <form:errors path="marque" class="alert alert-danger"/>
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