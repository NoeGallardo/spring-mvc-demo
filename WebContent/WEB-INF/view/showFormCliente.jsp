<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
	<title>Input Data here</title>
	
	<style>
		.error{color:red}
	</style>
</head>
<body>
	<form:form action="processForm" modelAttribute="cliente">
		First Name: <form:input path="firstName"/><br>
		Last Name:  <form:input path="lastName"/><form:errors path="lastName" cssClass="error"/><br>
		
		Introduce your Code: <form:input path="code"/><form:errors path="code" cssClass="error"/><br> 
		
		Country: <form:select path="country">
					<form:options items="${countryOptions}"/>
				 </form:select><br><br>
		
		Elige tu Lado<br>	 
		<form:radiobuttons path="sexo" items="${genderOptions}"/><br><br><br>
		
		Selecciona tus conocimiento<br>
		<form:checkboxes items="${lenguajeOptions}" path="lenguaje"/>
		
		<hr>
		<input type="submit" value="submit">
	</form:form>
	
</body>
</html>