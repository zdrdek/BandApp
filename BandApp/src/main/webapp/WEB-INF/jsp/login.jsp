<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="Login"/>
<%@include file="common/header.jspf" %>

<c:url var="loginUrl" value="/login"/>
<form action="${loginUrl}" method="POST">
	<div class="form-group">
		<label for="username">User Name:</label>
		<input type="text" name="username" class="form-control"/>
	</div>
	<button type="submit" class="btn btn-primary">Login</button>
	
</form>