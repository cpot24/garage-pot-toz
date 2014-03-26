<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<fieldset>
		<div class="control-group">
            <label  class="control-label" for="carenage">Car&eacute;nage : </label>
            <div class="controls">
                <form:checkbox id="carenage" path="carenage" cssErrorClass="error"/>
                <br />
                <br />
                <form:errors path="carenage" class="alert alert-danger"/>
            </div>
        </div>

		<div class="control-group">
			<label  class="control-label" for="typeModele">Type du mod&egrave;le : </label>
			<div class="controls">
				<form:input id="typeModele" path="typeModele" cssErrorClass="error"/>
				<br />
				<br />
				<form:errors path="typeModele" class="alert alert-danger"/>
			</div>
		</div>
</fieldset>