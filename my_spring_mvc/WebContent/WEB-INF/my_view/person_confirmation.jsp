<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmation</title>
</head>
<body>

Registered: ${person.firstName} ${person.lastName} 
<br><br>
From: ${person.country}
<br><br>
Subject: ${person.subject}
<br>
<br>
Groups: 
<ul>
	<c:forEach var="temp" items= "${person.groups}">
		<li> ${temp} </li>
	</c:forEach>
</ul>
<br>
<br>
Age: ${person.age}
<br>
<br>
Postal code: ${person.postalCode}
<br>
<br>
Personal code: ${person.myCode}
</body>
</html>