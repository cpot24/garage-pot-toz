<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<fieldset>
		<div class="control-group">
            <label  class="control-label" for="nbGilet">Nombre de gilets : </label>
            <div class="controls">
                <form:input id="nbGilet" path="nbGilet" cssErrorClass="error"/>
                <br />
                <br />
                <form:errors path="nbGilet" class="alert alert-danger"/>
            </div>
        </div>

		<div class="control-group">
			<label  class="control-label" for="typeBateau">Type de bateau : </label>
			<div class="controls">
				<form:input id="typeBateau" path="typeBateau" cssErrorClass="error"/>
				<br />
				<br />
				<form:errors path="typeBateau" class="alert alert-danger"/>
			</div>
		</div>
</fieldset>