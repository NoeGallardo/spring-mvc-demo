<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<title>Input Data here</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="cliente">
		First Name: <form:input path="firstName"/><br>
		Last Name:  <form:input path="lastName"/><br>
		Country: <form:select path="country">
					<form:option value="Brazil">Brazil</form:option>
					<form:option value="Mexico">Mexico</form:option>
					<form:option value="Argentina">Argentina</form:option>
					<form:option value="Cuba">Cuba</form:option>
					<form:option value="Panama">Panama</form:option>
				 </form:select>
		<hr>
		<input type="submit" value="submit">
	</form:form>
	
</body>
</html>