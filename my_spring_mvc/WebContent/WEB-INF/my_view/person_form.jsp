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
		 
		 Country:	
<%-- 		<form:select path="country">
		 <form:option value="PLN" label="Poland"/>
		 <form:option value="SE" label="Sweden"/>
		 </form:select> --%>
		 
		<form:select path="country"> 
     	<form:options items="${theCountryOptions}" />
    	</form:select>
    	
    	<br><br>
    	Subject:
    	<br>
    	Calculus <form:radiobutton path="subject" value="Calculus"/>
    	Networks <form:radiobutton path="subject" value="Networks"/>
    	Java <form:radiobutton path="subject" value="Java"/>

    	
    	<br><br>
    	
    	<input type="submit" value="Submit"/>
		 
	</form:form>

</body>
</html>