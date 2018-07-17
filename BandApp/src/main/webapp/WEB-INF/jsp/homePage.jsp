<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="pageTitle" value="BandApp Homepage" />
<%@include file="common/header.jspf"%>

<c:url var="formAction" value="/homePage" />
<div class=tabAll>
<form method="GET" action="${formAction}">
		<div class= minMum>
		<label for="minimumLength">Band Name:</label> 
		<input type="text" name="band" id="band" /> 
			</div>
			Genre:
		
<select name="genre">

			<optgroup label="Genres">
			<option value="Alternative">Alternative</option>
			<option value="Blues">Blues</option>
			<option value="Classical">Classical</option>
			<option value="Country">Country</option>
			<option value="EDM">EDM</option>
			<option value="Folk">Folk</option>
			<option value="Grunge">Grunge</option>
			<option value="Indie">Indie</option>
			<option value="Jazz">Jazz</option>
			<option value="Metal">Metal</option>
			<option value="Nathan Bardwell">Nathan Bardwell</option>
			<option value="Pop">Pop</option>
			<option value="Punk">Punk</option>
			<option value="Rap">Rap</option>	
			<option value="Reggae">Reggae</option>	
			<option value="Ska">Ska</option>	
			<option value="World">World</option>		
			</optgroup>
		</select> <input class="formSubmitButton" type="Submit" value="Search" />
		Login:
		<input type="submit" name="username" class="form-control"/>
		<input type="submit" name="password" class="form-control" />
		<input type="text" name="email" class="form-control"/>
		
		</form>
		</div>
		
		
		

		<%@include file="common/footer.jspf"%>