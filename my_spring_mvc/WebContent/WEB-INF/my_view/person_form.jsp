<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>

<style>
.error {
	color: red
}
</style>

</head>
<body>


	<form:form action="processForm" modelAttribute="person">
		First name: <form:input path="firstName" />
		<br>
		<br>
		 
		Last name (*): <form:input path="lastName" />
		<!-- validation rules -->
		<form:errors path="lastName" cssClass="error" />
		<br>
		<br>
		 
		 Country:	
<%-- 		<form:select path="country">
		 <form:option value="PLN" label="Poland"/>
		 <form:option value="SE" label="Sweden"/>
		 </form:select> --%>

		<form:select path="country">
			<form:options items="${theCountryOptions}" />
		</form:select>

		<br>
		<br>
    	Subject:
    	<br>
    	Calculus <form:radiobutton path="subject" value="Calculus" />
    	Networks <form:radiobutton path="subject" value="Networks" />
    	Java <form:radiobutton path="subject" value="Java" />


		<br>
		<br>
    	Groups:
    	<br>
    	A <form:checkbox path="groups" value="A" />
    	B <form:checkbox path="groups" value="B" />
    	C<form:checkbox path="groups" value="C" />

		<br>
		<br>
		Age: <form:input path="age" />
		<!-- validation rules -->
		<form:errors path="age" cssClass="error" />
		<br>
		<br>

		<input type="submit" value="Submit" />

	</form:form>

</body>
</html>