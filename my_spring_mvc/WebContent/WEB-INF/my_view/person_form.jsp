<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>


	<form:form action="processForm" modelAttribute="person">
		First name: <form:input path="firstName"/>
		 <br><br>
		 
		Last name: <form:input path="lastName"/>
		 <br><br>
		 <input type="submit" value="Submit"/>
		 
		 Country:
		
<%-- 		<form:select path="country">
		 <form:option value="PLN" label="Poland"/>
		 <form:option value="SE" label="Sweden"/>
		 </form:select> --%>

		 
		<form:select path="country"> 
     	<form:options items="${theCountryOptions}" />
    	</form:select>
		 
	</form:form>

</body>
</html>