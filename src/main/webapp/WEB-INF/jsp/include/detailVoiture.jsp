<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<fieldset>
		<div class="control-group">
            <label  class="control-label" for="nbPortes">Nombre de portes : </label>
            <div class="controls">
                <form:input id="nbPortes" path="nbPortes" cssErrorClass="error"/>
                <br />
                <br />
                <form:errors path="nbPortes" class="alert alert-danger"/>
            </div>
        </div>

		<div class="control-group">
			<label  class="control-label" for="nbRoues">Nombre de roues : </label>
			<div class="controls">
				<form:input id="nbRoues" path="nbRoues" cssErrorClass="error"/>
				<br />
				<br />
				<form:errors path="nbRoues" class="alert alert-danger"/>
			</div>
		</div>
</fieldset>