<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="pageTitle" value="BandApp Homepage" />
<%@include file="common/header.jspf"%>

<c:url var="formAction" value="/homePage" />
<div class=tabAll>

		<!-- 							EXISTING USER LOG IN FORM						 -->
		
<form method="GET" action="${formAction}">
	Login ID: <input type="text" name="loginID" class="form-control" />
	Password: <input type="text" name="password" class="form-control" /> 
	<input type="submit" name="submit" class="form-control" /> 
			<br/>
			<br/>
</form>		

		<!-- 						BEGIN NEW SIGN UP FORM						 		-->
			
<div class="newSignUpForm">
	<c:url var="newUser" value="/"/>
	<form method="POST" action="${newUser}">
		<label>Band Name:</label> <input type="text" name="band" id="band" /> 
		
		<!-- 						CHECKBOXES TO SELECT GENRES 							-->
		
		<div class="checkBoxContainer">
			<input type="checkbox" name="genre" value="Alternative" />Alternative
			<input type="checkbox" name="genre" value="Blues" />Blues
			<input type="checkbox" name="genre" value="Classical" />Classical
			<input type="checkbox" name="genre" value="Country" />Country
			<input type="checkbox" name="genre" value="EDM" />EDM
			<input type="checkbox" name="genre" value="Folk" />Folk
			<input type="checkbox" name="genre" value="Grunge" />Grunge
			<input type="checkbox" name="genre" value="Indie" />Indie
			<input type="checkbox" name="genre" value="Jazz" />Jazz
			<input type="checkbox" name="genre" value="Metal"/>Metal
			<input type="checkbox" name="genre" value="Nathan Bardwell"/>Nathan Bardwell
			<input type="checkbox" name="genre" value="Pop"/>Pop
			<input type="checkbox" name="genre" value="Punk"/>Punk
			<input type="checkbox" name="genre" value="Rap"/>Rap
			<input type="checkbox" name="genre" value="Reggae"/>Reggae
			<input type="checkbox" name="genre" value="Ska"/>Ska
			<input type="checkbox" name="genre" value="World"/>World
		</div>
		
		<!-- 							BIOGRAPHY INPUT 									-->
<div class="biographyInput">
	<label>Biography (max 500chars):</label> <input type="text" name="biography" id="biography" />
</div>			

			
	</form>
</div>




<%@include file="common/footer.jspf"%>